import React from 'react'
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import "react-bootstrap";
import './App.css'
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom'
import SignIn from './components/signin.component'
import Show from './components/show.component'
import SignUp from './components/signup.component'
import Register from './components/register'
import Login from './components/login'
import Product from './components/product'
import About from './components/about.component'
import Home from './components/carousel.component'
import styled from 'styled-components'
import "react-responsive-carousel/lib/styles/carousel.min.css"; // requires a loader
import { Carousel } from 'react-responsive-carousel';
import {HashLink} from 'react-router-hash-link';
import  ButtonGroup  from 'react-bootstrap/ButtonGroup'
import Button from 'react-bootstrap/Button';

function App(
)

{
  return (
    
   
<section>
  
 
    <Router className="router">
    
       
      <div className="App" >
        <nav className="navbar navbar-expand-lg navbar-light fixed-top"> 
        {/* <nav className="navbar"> */}
          <div className="container">
            <Link className="navbar-brand" href="#section1"  to={'/carousel'}>
              
            </Link>
            <div className="collapse navbar-collapse" id="navbarTogglerDemo02">
              <ul className="navbar-nav ml-auto">
                <li className="nav-item">
                  <Link className="nav-link" to={'/carousel'}>
                    Home
                  </Link>
                </li>
                <li className="nav-item">
                <Link className="nav-link" to={'/register'}>
                  NGO
                  </Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" hrefLang='section1' to={'/sign-up'}>
                    Donor
                  </Link>
                </li>
                <li className="nav-item">
                <Link className="nav-link" to={'/product'}>
                    Donor items
                  </Link>
                </li>
                <li className="nav-item">
                
                </li>
               {/* <li className="nav-item">
                <Link className="nav-link" to={'/show'}>
                    Show
                  </Link>
                </li> 
                 */}
              
                              <li className="nav-item">
                              
                  <center><h1 style={{color:'rgb(48, 25, 52)'}}>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Donation</h1></center>
                  </li>
                  
              </ul>
            </div>
          </div>
          <br></br>
        </nav>
        {/* <section id='form'> */}
       
  
        <div className="auth-wrapper">
         <div className="auth-inner"> 
            <Routes>
             
              {/* <Route exact path="/login" element={<Login />} /> */}
              {/* <Route path="/sign-in" element={<SignIn />} /> */}
              <Route path="/sign-up" element={<SignUp />} />
              <Route path="/about" element={<About/>} />
              
            </Routes>
          </div>
        </div>
        <Routes>
        <Route path="/sign-in" element={<SignIn />} />
        <Route path="/carousel" element={<Home/>} />
        <Route path="/product" element={<Product/>} />
        <Route path="/register" element={<Register/>} />    
          <Route path="/show" element={<Show/>} />
          <Route path="/login" element={<Login/>} />
        </Routes>
       
        {/* </section> */}
      </div>
      
      <div>
       
     
      </div>
     
      
    </Router>
    

    </section>
    
        
  )
}
 

export default App;