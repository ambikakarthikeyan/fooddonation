import React, { useState } from 'react';
import { FaSearch } from 'react-icons/fa';
import Footer from './footer';

function Show() {
  const [donationData, setDonationData] = useState(null);
  const [ngoName, setNgoName] = useState('');

  const fetchDonationData = () => {
    if (ngoName) {
      fetch(`http://localhost:8081/api/ngos/${ngoName}`)
        .then(response => response.json())
        .then(data => {
          console.log(data);
          setDonationData(data.donations); // Update to retrieve the array of donations
        })
        .catch(error => {
          console.log(error);
          setDonationData(null);
        });
    } else {
      setDonationData(null);
    }
  };

  const handleSearch = event => {
    event.preventDefault();
    fetchDonationData();
  };

  return (
    <div
      style={{
        overflowX: 'scroll',
        background: 'white',
        position: 'absolute',
        top: '70px',
        right: '0px',
        bottom: '0px',
        left: '0px',
        width: '100%',
      }}
    >
      <form onSubmit={handleSearch} style={{ display: 'flex', alignItems: 'center' }}>
        <input
          type="text"
          value={ngoName}
          onChange={e => setNgoName(e.target.value)}
          placeholder="Enter NGO Name"
          style={{ marginRight: '10px' }}
        />
        <button type="submit">
          <FaSearch />
        </button>
      </form>

      {donationData && donationData.length > 0 ? (
        <div
          style={{
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
            height: '100vh',
          }}
        >
          {donationData.map(donation => (
            <div
              key={donation.id}
              style={{
                display: 'flex',
                flexDirection: 'column',
                alignItems: 'center',
                backgroundColor: '#D3D3D3',
                padding: '20px',
                borderRadius: '5px',
                margin: '10px',
              }}
            >
              <img
                src={donation.imageUrl}
                alt={donation.itemName}
                style={{ width: '200px', height: '200px', marginBottom: '10px' }}
              />
              <div style={{ marginBottom: '10px', fontWeight: 'bold' }}>
                Item Name: {donation.itemName}
              </div>
              <div style={{ marginBottom: '10px' }}>Item Description: {donation.itemDescription}</div>
              <div style={{ marginBottom: '10px' }}>NGO: {donation.ngoName}</div>
              <div style={{ marginBottom: '10px' }}>Date: {donation.date}</div>
              <div style={{ marginBottom: '10px' }}>Quantity: {donation.quantity}</div>
            </div>
          ))}
        </div>
      ) : (
        <p>No donation data available</p>
      )}

      <div>
        <Footer />
      </div>
    </div>
  );
}
export default Show;