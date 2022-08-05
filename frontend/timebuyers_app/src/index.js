import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import AllUsers from './routes/AllUsers';
import Inside from "./components/Inside";
import RegisterForm from "./components/Register";
import AboutUs from "./components/AboutUs";
import ContactUs from "./components/ContactUs";
import EditProfile from "./components/EditProfile";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <BrowserRouter>
        <Routes>
            <Route path="/" element={<App />}>
                <Route path="tasks/:filter" element={<AllUsers />} />
                <Route path="tasks/:filter/:statusFilter" element={<AllUsers />} />
                <Route path="users/:filter" element={<AllUsers />} />
                <Route path="users/new-user" element={<RegisterForm />} />
                <Route path="about-us" element={<AboutUs />} />
                <Route path="contact-us" element={<ContactUs />} />
                <Route path="" element={<Inside />}/>
                <Route path="users/edit-profile/:filter" element={<EditProfile />}/>

            </Route>

        </Routes>

    </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
