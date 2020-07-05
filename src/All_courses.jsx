import React, { useState,useEffect} from 'react';
import {Topic} from './Topic.jsx';
import base_url from './Url.js';
import axios from 'axios';

export function All_courses()
{
  const [topics,update_topics]= useState([]);

  useEffect(()=>{
    getAllCoursesFromServer();
  });

  //function to get all courses from server
   const  getAllCoursesFromServer=()=>
   {
     axios.get(`${base_url}/topics`).then(
     (response)=>{
       update_topics(response.data);
     },(error)=>{
       console.log(error);
     }
     );
   };

  

      function list(item,index)
      {
        return <Topic id={item.id} title={item.name} desc={item.description} del={remove} key={index} />
      }

      function remove(ID)
      {
        console.log(ID);

           axios.delete(`${base_url}/topics/${ID}`).then(
            (response)=>{
              getAllCoursesFromServer();
            console.log(response);
            },(error)=>{
              console.log(error);
            }
            );     
      }       
      return  (topics.map(list));
}