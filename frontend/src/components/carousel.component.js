import React, { useState } from 'react';
import '../carousel.css';
import AboutSection from '../components/section';
import Footer from '../components/footer';

function Home() {
  const [activeIndex, setActiveIndex] = useState(0);
  const images = ['home1.png', 'edit2.jpg', 'home4.jpg'];

  const handleNext = () => {
    setActiveIndex((prevIndex) => (prevIndex === images.length - 1 ? 0 : prevIndex + 1));
  };

  const handlePrevious = () => {
    setActiveIndex((prevIndex) => (prevIndex === 0 ? images.length - 1 : prevIndex - 1));
  };

  return (
    <div className="Carousel">
      <div className="image-container">
        <div className="arrow-left" onClick={handlePrevious}>
          {/* Insert left arrow icon */}
        </div>
        <img
          src={images[activeIndex]}
          alt="Food Image"
          className="responsive-image"
        />
        <div className="arrow-right" onClick={handleNext}>
          {/* Insert right arrow icon */}
        </div>
      </div>

      <div className="scrollable-description">
        <div className="scrollable-content">
          <p>
            Donating to the needy is a great way to improve the conditions in your neighborhood or community.
            Donating food to the worthy people or organizations helps counter poverty, hunger and at the same time, it can improve harmony, friendliness, and trust among residents.
            It has been found that charitable donations promote increased levels of prosperity, and boost health happiness, cooperation, goodwill, and strong communities.
          </p>

          <p>
            It gives new information and reveals a different point of views about different social issues such as homelessness, hunger or poverty.
            We aim to provide nutritious meals to our NGO across India. We believe that access to healthy and balanced food is an essential component of the healing process, and we strive to provide our patients with the best possible nutrition to aid in their recovery.
            We use only fresh and high-quality ingredients in our cooking, and our meals are prepared in a clean and hygienic environment. Our menu includes a variety of vegetarian and non-vegetarian dishes that are customized according to the patient’s taste preferences and nutritional needs.
            We hope that you will consider supporting our efforts to provide nutritious meals for NGO’s across India. Your support will help us continue to provide the best possible care for those in need.
          </p>
          <p>
            Donating to the needy is a great way to improve the conditions in your neighborhood or community.
            Donating food to the worthy people or organizations helps counter poverty, hunger and at the same time, it can improve harmony, friendliness, and trust among residents.
            It has been found that charitable donations promote increased levels of prosperity, and boost health happiness, cooperation, goodwill, and strong communities.
          </p>

          <p>
            It gives new information and reveals a different point of views about different social issues such as homelessness, hunger or poverty.
            We aim to provide nutritious meals to our NGO across India. We believe that access to healthy and balanced food is an essential component of the healing process, and we strive to provide our patients with the best possible nutrition to aid in their recovery.
            We use only fresh and high-quality ingredients in our cooking, and our meals are prepared in a clean and hygienic environment. Our menu includes a variety of vegetarian and non-vegetarian dishes that are customized according to the patient’s taste preferences and nutritional needs.
            We hope that you will consider supporting our efforts to provide nutritious meals for NGO’s across India. Your support will help us continue to provide the best possible care for those in need.
          </p>
        </div>
      </div>

      <div>
        <h1>ABOUT</h1>
      </div>
      <AboutSection />
<br></br><br></br><br></br>
      <Footer />
    </div>
  );
}

export default Home;
