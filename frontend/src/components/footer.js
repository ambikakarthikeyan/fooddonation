// components/Footer.js

import React from 'react';
import "../footer.css";
function Footer() {
  return (
    <footer className="footer">
    
      <div className="contact">
        <h4>Contact</h4>
        <p>Email: contact@example.com</p>
        <p>Phone: 123-456-7890</p>
        <p>Address: 123 Street, City, Country</p>
      </div>
      <div className="mission">
        <h4>Our Mission</h4>
        <p>Provide food to those in need and reduce food waste.</p>
      </div>
      <div className="links">
        <h4>Links</h4>
        <ul>
          <li>
            <a href="#">Home</a>
          </li>
          <li>
            <a href="#">About Us</a>
          </li>
          <li>
            <a href="#">Services</a>
          </li>
          <li>
            <a href="#">Contact</a>
          </li>
        </ul>
      </div>
    </footer>
  );
}

export default Footer;

