import React from 'react';
import '../static/CSS/Navbar.css';
import '../static/CSS/Searchbar.css';
import {Link} from "react-router-dom";

const Searchbar = () => {
    return (
        <nav className="searchbarContainer">
            <div className="nav-item dropdown">
                <a className="nav-link dropdown-toggle taskTitle"
                   href="src/frontend/timebuyers_app/src/components/Navbar#" id="navbarDropdown" role="button"
                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Tasks
                </a>
                <div className="dropdown-menu search-menu" aria-labelledby="navbarDropdown">
                    <Link to="/tasks/IKEA_ASSEMBLY" className="dropdown-item-searchbar dropdown-item">Ikea assembly</Link>
                    <Link to="/tasks/MOVE_BOXES" className="dropdown-item dropdown-item-searchbar">Move boxes</Link>
                    <Link to="/tasks/SHOPPING" className="dropdown-item dropdown-item-searchbar">Shopping</Link>
                    <Link to="/tasks/DOG_WALKING" className="dropdown-item dropdown-item-searchbar">Dog walking</Link>
                    <Link to="/tasks/GARDENING" className="dropdown-item dropdown-item-searchbar">Gardening</Link>
                    <Link to="/tasks/HOUSE_CLEANING" className="dropdown-item dropdown-item-searchbar">House cleaning</Link>
                    <Link to="/tasks/WAIT_IN_LINE" className="dropdown-item dropdown-item-searchbar">Wait in line</Link>
                    <Link to="/tasks/COOKING" className="dropdown-item dropdown-item-searchbar">Cooking</Link>
                    <Link to="/tasks/RETURN_ITEMS" className="dropdown-item dropdown-item-searchbar">Return items</Link>
                    <Link to="/tasks/BABY_SITTING" className="dropdown-item dropdown-item-searchbar">Baby sitting</Link>
                    <Link to="/tasks/GET_KIDS_FROM_SCHOOL" className="dropdown-item dropdown-item-searchbar">Get kids from school</Link>
                    <Link to="/tasks/CAT_SITTING" className="dropdown-item dropdown-item-searchbar">Cat sitting</Link>
                    <Link to="/tasks/DOG_SITTING" className="dropdown-item dropdown-item-searchbar">Dog sitting</Link>
                </div>
            </div>
        </nav>
    )
}

export default Searchbar;
