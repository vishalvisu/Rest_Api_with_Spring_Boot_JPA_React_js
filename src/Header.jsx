import React from 'react';
import './index.css';

function Header (props)
{
    return (
    <h1 className="Header">This is Front-End of Rest-Api Project with {props.backend}</h1>
    );

}

export default Header;