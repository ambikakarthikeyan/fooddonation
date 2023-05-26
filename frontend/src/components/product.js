import React, { useEffect, useState } from 'react';
import './carousel.component'; // Import the CSS file
import Footer from './footer';

function VolunteerPage() {
  const [volunteers, setVolunteers] = useState([]);

  useEffect(() => {
    fetchVolunteers();
  }, []);

  const fetchVolunteers = () => {
    fetch('http://localhost:8085/volunteer')
      .then(response => response.json())
      .then(data => {
        setVolunteers(data);
      })
      .catch(error => {
        console.log(error);
        setVolunteers([]);
      });
  };

  const VolunteerCard = ({ volunteer }) => (
    <div className="volunteer-card">
      <img src={volunteer.photo} alt={volunteer.vname} className="volunteer-photo-small" />
      <div className="volunteer-details">
        <h3>{volunteer.vname}</h3>
        <p>Location: {volunteer.location}</p>
        <p>Phone No: {volunteer.phoneno}</p>
        <p>Vehicle No: {volunteer.vechicleno}</p>
        <p>Available: {volunteer.available}</p>
        <button className="allocate-button">Allocate Delivery</button>
      </div>
    </div>
  );

  return (
    <div >
       <div className="volunteer-heading">
        <h1>Volunteer Details</h1>
      </div>
      {volunteers.length > 0 ? (
        <div className="volunteer-container">
          {volunteers.map(volunteer => (
            <VolunteerCard key={volunteer.volunteerid} volunteer={volunteer} />
          ))}
        </div>
      ) : (
        <p>No volunteers available</p>
      )}
      <br></br>
      <br></br>
      <br></br>
      <div>
        <Footer />
      </div>
    </div>
  );
}

export default VolunteerPage;
