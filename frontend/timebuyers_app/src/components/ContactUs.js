import React, { useState } from "react";
import '../static/CSS/ContactUs.css';

const ENDPOINT = ""; // TODO - ide jöjjön majd a route!

function ContactUs() {
    // const emailAddress = "takacsberni@gmail.com";
    const emailAddress = "cctimebuyers@gmail.com";

    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [message, setMessage] = useState('');

    const [submitted, setSubmitted] = useState(false);
    const [error, setError] = useState(false);

    const handleName = (e) => {
        setName(e.target.value);
    };

    const handleEmail = (e) => {
        setEmail(e.target.value);
    };

    const handleMessage = (e) => {
        setMessage(e.target.value);
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        if (name === '' || email === '') {
            setError(true);
        } else {
            setSubmitted(true);
            setError(false);
        }
    };

    const successMessage = () => {
        return (
            <div
                className="success"   style={{display: submitted ? '' : 'none'}}>
                <h1>{name}, your message has been successfully sent!!</h1>
            </div>
        );
    };

    const errorMessage = () => {
        return (
            <div className="error"  style={{display: error ? '' : 'none'}}>
                <h1>Please enter all the fields</h1>
            </div>
        );
    };


    return (
        <div className="contact-container">

                <div>
                    <h1> Contact Us</h1>
                    <p>Please feel free to contact our Support Team</p>
                </div>
                <div className="info-wrap">
                    <div className="info-row">
                        <div className="info"><i className="bi bi-geo-alt"></i><h4>Location:</h4><p>44 Nagymező
                            Street<br/>Budapest, 1065</p></div>
                        <div className="info"><i className="bi bi-envelope"></i><h4>Email:</h4>
                            <p>cctimebuyers@gmail.com</p></div>
                        <div className="info"><i className="bi bi-phone"></i><h4>Call:</h4><p>+1
                            5589 55488 51</p></div>
                    </div>
                </div>
                <div>
                    <form action="api/send-email/takacsberni@gmail.com" method="post">
                <label htmlFor="name">Name</label>
                <input type="text" id="name" name="name" placeholder="Your name.." onChange={handleName} value={name}/>

                <label htmlFor="email">Email</label>
                <input type="text" id="email" name="email" placeholder="Your email address.." onChange={handleEmail} value={email} />

                <label htmlFor="message">Message</label>
                <textarea id="message" name="message" placeholder="White a message..." onChange={handleMessage} value={message}>  </textarea>

                <input type="submit" value="Submit"/>
            </form>
                </div>
        </div>
)
}

export default ContactUs;
