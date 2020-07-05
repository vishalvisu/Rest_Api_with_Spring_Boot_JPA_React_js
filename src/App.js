import React from 'react';
import logo from './logo.svg';
import './App.css';
import Header from './Header';
import {Button} from 'reactstrap'; 
import Home from './Home';
import {Course} from './Course';
import './index.css';
import './All_courses.jsx';
import { All_courses } from './All_courses.jsx';
import { AddCourse } from './AddCourse';
import {BrowserRouter,Route} from 'react-router-dom';
import {Update_course} from './Update_course';
import  NavbaR from './NavbAR.jsx'; 
import { ToastContainer, toast } from 'react-toastify';
  import 'react-toastify/dist/ReactToastify.css';

function App() {
  return (

    <div>
   <Header backend="Spring-Boot"/>
   <div className="box">
  <BrowserRouter>
  <div className="navclass">
    <Route  path="/*"  component={NavbaR}/>  
    </div>
  <div id="content">  
<Route exact path="/"  component={All_courses}/>
<Route exact path="/home"  component={Home}/> 
<Route exact path="/add_course"  render={()=>(<AddCourse utility="Add Course"/>)} /> 
<Route exact path="/update_course" render={()=>(<AddCourse utility="Update Course"/>)}/> 
</div>
</BrowserRouter></div>
</div>
  )
}

export default App;
