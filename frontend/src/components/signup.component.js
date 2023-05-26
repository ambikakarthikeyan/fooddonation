import React, { Component } from 'react';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import Button from 'react-bootstrap/Button';
import axios from 'axios';
import { Link } from 'react-router-dom';


class Signup extends React.Component {
    constructor() {
        super();
        this.state = {
          name: '',
          email: '',
          bio: '',
         password: '',
          location: '',
          successMessage: ''
        }
        
      }
      handleNameChange = (event) => {
        this.setState({ name: event.target.value });
      }
    
      handleEmailChange = (event) => {
        this.setState({ email: event.target.value });
      }
    
    
      handleBioChange = (event) => {
        this.setState({ bio: event.target.value });
      }

      handleLocationChange = (event) => {
        this.setState({ location: event.target.value });
      }
    
      handlePasswordChange = (event) => {
        this.setState({ password: event.target.value });
      }
    
      

      handleSubmit = (event) => {
        event.preventDefault();
        const { name,email,password,bio,location } = this.state;
        axios.post('http://localhost:8084/donors', {name,email,password,bio,location })
          .then(response => {
            console.log('Form submitted successfully');
            this.setState({ successMessage: 'Form submitted successfully' });
          })
          .catch(error => {
            console.error('Error submitting form:', error);
            this.setState({ successMessage: 'Submission is unsuccessful' });
          });
      }
      
    render() {
        
      return (
        
        <div className="App"  >
          <br></br><br></br>
        <h1>Signup</h1>
    
        <Form.Group as={Row} className="mb-3" >
        <Form.Label column sm="2">
          Name
        </Form.Label>
        <Col sm="10">
        <Form.Control type="text" placeholder="Enter your full name"   value={this.state.name} onChange={this.handleNameChange}/>
        </Col>
      </Form.Group>
        

        <Form.Group as={Row} className="mb-3" >
        <Form.Label column sm="2">
          Email
        </Form.Label>
        <Col sm="10">
        <Form.Control type="email" placeholder="Enter email"  value={this.state.email}onChange={this.handleEmailChange}/>
        </Col>
      </Form.Group>

      <Form.Group as={Row} className="mb-3" >
        <Form.Label column sm="2">
          Password
        </Form.Label>
        <Col sm="10">
        <Form.Control type="password" placeholder="Enter strong password"  value={this.state.password}onChange={this.handlePasswordChange}/>
        </Col>
      </Form.Group>

      <Form.Group as={Row} className="mb-3" >
        <Form.Label column sm="2">
          Bio
        </Form.Label>
        <Col sm="10">
        <Form.Control type="text" placeholder="Enter a short bio of yours "  value={this.state.bio}onChange={this.handleBioChange}/>
        </Col>

      </Form.Group>
     

      {/* <Form.Group as={Row} className="mb-3" >
        <Form.Label column sm="2">
         Country
        </Form.Label>
        <Col sm="10">
        <Form.Select
              aria-label="Floating label select example"
              value={this.state.country}
              onChange={this.handleCountryChange}
            >
              <option>Select your country</option>
              <option value="India">India</option>
              <option value="Srilanka">Srilanka</option>
              <option value="America">America</option>
              <option value="Africa">Africa</option>
            </Form.Select>
        </Col> */}
      {/* </Form.Group> */}
      <Form.Group as={Row} className="mb-3" >
        <Form.Label column sm="2">
        Location
        </Form.Label>
        <Col sm="10">
        <Form.Control
                as="textarea"
                rows={3}
                placeholder="Enter Location"
                value={this.state.location}
                onChange={this.handleLocationChange}/>
        </Col>
      </Form.Group>

      <Button type="submit" className="m-3 " onClick={this.handleSubmit}>Register</Button>
      <br></br>
      <Link to="/sign-in" className="btn btn-link">Already registered? Sign In</Link>
  

     
      {this.state.successMessage && <div>{this.state.successMessage}</div>}
       
        
      </div>
      );
      
    }
  }
  
  export default Signup;
