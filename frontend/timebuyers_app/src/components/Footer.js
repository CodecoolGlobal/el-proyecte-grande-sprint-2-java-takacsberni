import React from "react";
import '../static/CSS/Footer.css';
import Inside from "./Inside";

function Footer() {
    return (
        <footer>
            <div className="flex-container-footer">
                <div className="footer-col-1">
                    <h5 className="text-md-left">TimeBuyers</h5>
                    <h5 className="text-md-left">2022</h5>
                    <h5 className="text-md-left">CodeCool</h5>
                </div>
                <div className="footer-col-2">
                    <ul className="list-us">
                        <h5 className="middle">Eszter Kövesdi</h5>
                        <h5 className="middle">Hanna Szepesi</h5>
                        <h5 className="middle">Bernadett Takács</h5>
                    </ul>
                </div>
                <div className="footer-col-3">
                    <h5 className="text-md-right">Contact Us</h5>
                    <h5 className="text-md-right"> cctimebuyers@gmail.com </h5>
                </div>
            </div>
        </footer>
)
}

export default Footer;