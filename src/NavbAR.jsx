import React from 'react';
import './index.css';
import { ListGroup } from 'reactstrap';
import { Link } from 'react-router-dom';

export default function NavbaR()
{
    return(
        <>
       <ListGroup>
        <Link className="menu list-group-item list-group-item-action" tag="a" to="/home" action>
        HOME
        </Link>
        <Link className="menu list-group-item list-group-item-action" tag="a" to="/" action>
       View Courses
        </Link>
        <Link className="menu list-group-item list-group-item-action" tag="a" to="/add_course" action>
        Add Course
        </Link>
        <Link className="menu list-group-item list-group-item-action" tag="a" to="/update_course" action>
       Update Course
        </Link>
        <Link className="menu list-group-item list-group-item-action" tag="a" to="/" action>
       Delete Course
        </Link>
       </ListGroup>
         </>
    )
}