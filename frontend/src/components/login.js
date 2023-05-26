import React, { Component } from 'react';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';
import axios from 'axios';
import Product from './about.component';
// import { withRouter } from 'react-router-dom';
// import { FormGroup } from 'react-bootstrap';
// import { useHistory } from 'react-router-dom';
// import { Redirect } from 'react-router-dom';
import { BrowserRouter as  Link } from 'react-router-dom'
import Footer from '../components/footer';

class SignIn extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: '',
      password: '',
      error: '',
      showPage: false
    };
  }
  isNameValid = (name) => {
    // Add your validation rules here
    const MIN_LENGTH = 3;
    const allowedCharacters = /^[a-zA-Z0-9_]+$/;
  
    // Check if the name meets the minimum length requirement
    if (name.length < MIN_LENGTH) {
      return false;
    }
  
    // Check if the name only contains allowed characters
    if (!allowedCharacters.test(name)) {
      return false;
    }
  
    return true;
  }

  handlenameChange = (event) => {
    this.setState({ name: event.target.value });
  };

  handlePasswordChange = (event) => {
    this.setState({ password: event.target.value });
  };

  handleSubmit = (event) => {
    event.preventDefault();
    const { name, password } = this.state;
    if (!this.isNameValid(name)) {
      this.setState({ error: 'Invalid name' });
      return;
    }
    axios
      .get(`http://localhost:8083/ngo?name=${name}&password=${password}`)
      .then((response) => {
        const data = response.data;
        if (data.length){
          <Link to="/about.component">Product</Link>
         console.log('User exists!');
          // Set the isSignedIn state to true in the parent component
           //this.props.onSignIn();
           this.setState({ showPage: true });

         
      
        } else {
          console.log('User does not exist!');
          this.setState({ error: 'Invalid name or password' });
        }
      })
      .catch((error) => {
        console.error('Error fetching user data:', error);
        this.setState({ error: 'Error signing in. Please try again later.' });
      });
  };

  handleSignOut = () => {
    // Set the isSignedIn state to false in the parent component
    this.props.onSignOut();
  };

  render() {
    // If the user is signed in, render a sign-out button
    if (this.props.isSignedIn) {
      return (
        <div className="App">
          <h1>Sign Out</h1>
          <Button variant="primary" onClick={this.handleSignOut}>
            Sign Out
          </Button>
        </div>
      );
    }
   

    // Otherwise, render the sign-in form
    return (
      <div className="App">
        <br></br><br></br>
        {/* <h1>Sign In</h1> */}


        {this.state.showPage ? <Product /> : (
          <div className="auth-wrapper">
            <div className="auth-inner">
        <Form onSubmit={this.handleSubmit}>
        <Form.Group className="mb-3" controlId="formBasicname">
          <Form.Label>name</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter name"
            value={this.state.name}
            onChange={this.handlenameChange}
          />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicPassword">
          <Form.Label>Password</Form.Label>
          <Form.Control
            type="password"
            placeholder="Enter password"
            value={this.state.password}
            onChange={this.handlePasswordChange}
          />
        </Form.Group>

        <Button variant="primary" type="submit">
          Sign In
        </Button>

        {this.state.error && <div className="mt-3 text-danger">{this.state.error}</div>}
      </Form>
        </div>
        </div>
      )}
      <div>
        <Footer/>
      </div>
      </div>
    
    
    );
  }
}

export default SignIn;
