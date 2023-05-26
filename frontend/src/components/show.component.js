import React, { useEffect, useState } from 'react';
import { FaPen, FaTrash, FaMinusCircle, FaPlus } from 'react-icons/fa';

function Show() {
  const [popup, setPopup] = useState(false);
  const [itemName, setItemName] = useState('');
  const [itemDescription, setItemDescription] = useState('');
  const [ngoName, setNgoName] = useState('');
  const [date, setDate] = useState('');
  const [quantity, setQuantity] = useState('');
  const [imageUrl, setImageUrl] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    const data = {
      itemName,
      itemDescription,
      ngoName,
      date,
      quantity,
      imageUrl,
    };
    createPlants(data);
  };

  const createPlants = async (data) => {
    try {
      const response = await fetch('http://localhost:8082/api/donations', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
      });

      const result = await response.json();
      console.log('Success:', result);
      EditPopup();
    } catch (error) {
      console.error('Error:', error);
    }
  };

  const EditPopup = () => {
    setPopup(!popup);
  };

  const SetCreateValues = () => {
    setItemName('');
    setItemDescription('');
    setNgoName('');
    setDate('');
    setQuantity('');
    setImageUrl('');
    EditPopup();
  };

  return (
    <div>
      <div
        style={{
          margin: 10,
          backgroundColor: '#D3D3D3',
          padding: 10,
          width: 100,
        }}
        onClick={SetCreateValues}
      >
        <FaPlus /> Create Donation
      </div>
      <div>
      <div style={{ display: 'flex', justifyContent: 'center', width: '100%' }}>
        <video
          width="100%"
          height="auto"
          style={{ maxWidth: '75%', margin: '50px 0' }}
          controls
        >
          <source src="/videos/pexels-julia-m-cameron-6894121-3840x2160-50fps.mp4" type="video/mp4" />
          Your browser does not support the video tag.
        </video>
      </div>
      </div>


      {popup && (
        <div
          style={{
            position: 'absolute',
            backgroundColor: '#D3D3D3',
            height: '100%',
            width: '100%',
            top: 0,
          }}
        >
          <div
            style={{
              backgroundColor: '#e0e0e0',
              width: '50%',
              height: '75%',
              margin: 'auto',
              top: 20,
            }}
          >
            <FaMinusCircle style={{ padding: 10 }} onClick={EditPopup} />
            <form onSubmit={handleSubmit}>
              <br />
              <br />
              <br />
              <div style={{ flexDirection: 'row', padding: 10 }}>
                <label>
                  Item Name:
                  <input
                    type="text"
                    value={itemName}
                    onChange={(e) => setItemName(e.target.value)}
                  />
                </label>
              </div>
              <div style={{ flexDirection: 'row', padding: 10 }}>
                <label>
                  Item Description:
                  <input
                    type="text"
                    value={itemDescription}
                    onChange={(e) => setItemDescription(e.target.value)}
                  />
                </label>
              </div>
              <div style={{ flexDirection: 'row', padding: 10 }}>
                <label>
                  NGO Name:
                  <input
                    type="text"
                    value={ngoName}
                    onChange={(e) => setNgoName(e.target.value)}
                  />
                </label>
              </div>
              <div style={{ flexDirection: 'row', padding: 10 }}>
                <label>
                  Date:
                  <input
                    type="date"
                    value={date}
                    onChange={(e) => setDate(e.target.value)}
                  />
                </label>
              </div>
              <div style={{ flexDirection: 'row', padding: 10 }}>
                <label>
                  Quantity:
                  <input
                    type="text"
                    value={quantity}
                    onChange={(e) => setQuantity(e.target.value)}
                  />
                </label>
              </div>
              <div style={{ flexDirection: 'row', padding: 10 }}>
                <label>
                  Enter image URL:
                  <input
                    type="text"
                    value={imageUrl}
                    onChange={(e) => setImageUrl(e.target.value)}
                  />
                </label>
              </div>
              <div style={{ flexDirection: 'row', padding: 10 }}>
                <input type="submit" />
              </div>
            </form>
          </div>
        </div>
      )}
    </div>
  );
}

export default Show;
