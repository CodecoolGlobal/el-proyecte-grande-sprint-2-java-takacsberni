import React, {useEffect, useRef, useState} from "react";
import '../static/CSS/UpperSection.css';

function UpperSection() {

    const first = <section id="hero1" className="d-flex flex-column justify-content-center align-items-center">
        <div className="upper-section-text-container" data-aos="fade-up"><h1>Welcome to <span>TimeBuyers</span></h1>
            <h2>Welcome to our webpage, where you can either buy or sell some time!</h2></div>
    </section>

    const second = <section id="hero2" className="d-flex flex-column justify-content-center align-items-center">
        <div className="upper-section-text-container" data-aos="fade-up"><h1>Want to make some <span>money</span> with us?</h1>
            <h2>Or just switching tasks with someone? It's time to become a Tasker!</h2></div>
    </section>


    const third =  <section id="hero3" className="d-flex flex-column justify-content-center align-items-center">
        <div className="upper-section-text-container" data-aos="fade-up"><h1>Or we can help you save some <span>time</span></h1>
            <h2>Hi Buyer! Let our Taskers do your stuff, while you spend some some family-time.</h2></div>
    </section>

    const elements = [first, second, third]

    const delay = 3000;

    const [index, setIndex] = useState(0);
    const timeoutRef = useRef(null);

    function resetTimeout() {
        if (timeoutRef.current) {
            clearTimeout(timeoutRef.current);
        }
    }

    useEffect(() => {
        resetTimeout();
        timeoutRef.current = setTimeout(
            () =>
                setIndex((prevIndex) =>
                    prevIndex === elements.length - 1 ? 0 : prevIndex + 1
                ),
            delay
        );

        return () => {
            resetTimeout();
        };
    }, [index]);

    return (
        <div className="slideshow-container">
        <div className="slideshow">
            <div
                className="slideshowSlider"
                style={{ transform: `translate3d(${-index * 100}%, 0, 0)` }}
            >
                {elements.map((element, index) => (
                    <section
                        className="slide"
                        key={index}
                    >{element}</section>
                ))}
            </div>

            <div className="slideshowDots">
                {elements.map((_, idx) => (
                    <div
                        key={idx}
                        className={`slideshowDot${index === idx ? " active" : ""}`}
                        onClick={() => {
                            setIndex(idx);
                        }}
                    ></div>
                ))}
            </div>
        </div>
        </div>
    );



}

export default UpperSection;