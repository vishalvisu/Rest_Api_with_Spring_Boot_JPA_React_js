import React from 'react';
import './index.css';
import { Button } from 'reactstrap';

export function Course (props)
{

function remov()
{
   props.del(props.id);  
}
  
    return(
        <>
    <div className="course" key={props.key} >
    <h2 className="ID">Course_Id::{props.id}</h2>
    <div className="title" id={props.key}>
    {props.title}</div>
    <div className="content">
    {props.desc}
    </div>
    <div className="buttons">
    <Button color="danger" className="delete" onClick={remov}>delete</Button>
    </div>
    </div>
    </>
    )
}