import React, { useState } from 'react';
import { Form, FormGroup, Button } from 'reactstrap';
import axios from 'axios';
import base_url from './Url.js';
import { ToastContainer, toast } from 'react-toastify';
  import 'react-toastify/dist/ReactToastify.css';
export function AddCourse(props)
{

  const [topic,set_topic]=useState({
    id:"",
    name:"",
    description:""
  });
  function Add_Data_To_Server ()
  {
    if(props.utility=="Add Course")
 {
    axios.post(`${base_url}/topics`,topic).then(
      (response)=>{
        toast.success("Topic Added Succesfully");
      },(error)=>{
        toast.error("Something Went Wrong!");
        console.log(error);
      }
      );
    }
    else
    {
      axios.put(`${base_url}/topics/${topic.id}`,topic).then(
        (response)=>{
          toast.success("Topic Updated Succesfully");
        },(error)=>{
          toast.error("Something Went Wrong!");
          console.log(error);
        }
        );
    }
      set_topic({
        id:"",
        name:"",
        description:""
      });
  }
return(
    <> 
     <Form className="add_course">
  
   <FormGroup>
   <h1 className="topic_header" >{props.utility}</h1>
   
   <label for="user_ID">Enter Topic_id</label><br/>
   <input type="text" id="id" name="id" placeholder="enter id" onChange={(e)=>{
          set_topic({...topic,id:e.target.value});}}/>
   </FormGroup>

   <FormGroup>
   <label for="title">Enter Name</label><br/>
   <input type="text" id="name" name="name" placeholder="enter title" onChange={(e)=>{
          set_topic({...topic,name:e.target.value});}}/>
   </FormGroup>

   <FormGroup>
   <label for="desc">Enter Description</label><br/>
   <textarea rows="5" cols="70" id="desc" name="description" placeholder="enter Description"
     onChange={(e)=>{
          set_topic({...topic,description:e.target.value});}}/>
   </FormGroup>
  
     <FormGroup>
     <ToastContainer/>
   <Button color="primary"  id="submit" name="submit" onClick={Add_Data_To_Server}>{props.utility}</Button>
   </FormGroup>
  
   </Form>
    </>
)}