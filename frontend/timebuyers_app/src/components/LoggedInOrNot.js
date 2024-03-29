import '../static/CSS/Navbar.css';
import React, {useEffect} from "react";
import {Link} from "react-router-dom";


function LoggedInOrNot({isLoggedIn}) {

    useEffect(() => {
        returnOnLogin();
    }, [isLoggedIn])



    const returnOnLogin = () => {
        console.log(isLoggedIn)
        if (isLoggedIn) {
            return (

                <ul className="navbar-nav mr-right">
                    <li className="nav-item">
                        <Link to={"/logout"} className="nav-link"> Logout </Link>
                    </li>
                    <li className="nav-item">
                        <Link to={"/users/edit-profile/josh@gmail.com"} className="nav-link">Edit Profile</Link>
                    </li>
                </ul>
            )
        } else {
            return (
                <ul className="navbar-nav mr-right">
                    <li className="nav-item">
                        <Link to={"/login"} className="nav-link"> Login </Link>
                    </li>
                    <li className="nav-item">
                        <Link to={"/users/new-user"} className="nav-link">Registration</Link>
                    </li>
                </ul>
            )
        }
    }
    return returnOnLogin();
}

export default LoggedInOrNot;