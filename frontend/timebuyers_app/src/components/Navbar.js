import '../static/CSS/Navbar.css';
import React from "react";
import {Link} from "react-router-dom";

function Navbar(){
    return (
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <Link to={"/"}  className="navbar-brand">TimeBuyers</Link>
            <button className="navbar-toggler" type="button" data-toggle="collapse"
                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation">
                <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarSupportedContent">
                <ul className="navbar-nav mr-auto">
                    <li className="nav-item">
                        <Link to={"about-us"} className="nav-link">About us</Link>
                    </li>
                    <li className="nav-item dropdown">
                        <a className="nav-link dropdown-toggle" href="src/frontend/timebuyers_app/src/components/Navbar#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Buyers and Taskers
                        </a>
                        <div className="dropdown-menu" aria-labelledby="navbarDropdown">
                            <Link to="/users/buyers" className="dropdown-item">Buyers</Link>

                            <Link to="/users/taskers" className="dropdown-item">Taskers</Link>

                            <Link to="/users/all" className="dropdown-item">All</Link>
                        </div>
                    </li>
                    <li className="nav-item">
                        <Link to="contact-us" className="nav-link">Contact us </Link>
                    </li>
                </ul>
                <ul className="navbar-nav mr-right">
                    <li className="nav-item">
                        <a className="nav-link" href="src/frontend/timebuyers_app/src/components/Navbar#">Login</a>
                    </li>
                    <li className="nav-item">
                        <Link to={"/users/new-user"} className="nav-link">Registration</Link>
                    </li>
                    <li className="nav-item">
                        <Link to={"/users/edit-profile/josh@gmail.com"} className="nav-link">Edit Profile</Link>
                    </li>
                </ul>
            </div>
        </nav>
    )
}

export default Navbar;