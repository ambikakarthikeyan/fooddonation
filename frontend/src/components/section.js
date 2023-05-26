import React from 'react';
import '../carousel.css';

function About() {
  return (
    <div className="about-content">
      <div className="about-card">
      <img src={'card1.png'} alt="BigCo Inc. logo" width="70px" height="70px"/>
        <p>The act of giving food brings nourishment to the body and joy to the soul.</p>
      </div>
      <div className="about-card">
      <img src={'card2.jpg'} alt="BigCo Inc. logo" width="70px" height="70px"/>
        <p>Food is meant to be shared, not wasted.
Feed the hungry, and you will feed the soul.
No one should go to bed hungry when there is enough food in the world.</p>
      </div>
      <div className="about-card">
      <img src={'card3.png'} alt="BigCo Inc. logo" width="70px" height="70px"/>
        <p>Join us in the fight against hunger! Visit our website to learn how you can make a difference through food donation.
Make an impact with just a few clicks. Explore our website and discover the power of food donation.
Every meal counts. Donate food through our website and help those in need.</p>
      </div>
    </div>
  );
}

export default About;
