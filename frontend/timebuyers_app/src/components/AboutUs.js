import '../static/CSS/AboutUs.css';
import React from "react";
import developPic from "../static/images/develop.jpg";
import esztiPic from "../static/images/eszti.png";
import hannaPic from "../static/images/hanna.png";
import berniPic from "../static/images/berni.png";

function AboutUs(){
    return (
        <div className="container">
            <div className="weare">
                <h1> We are the TimeBuyers! </h1>
            </div>

            <div className="container2">
                <div className="develop-pic">
                    <img src={developPic} alt="develop" />
                </div>

                <div className="description">
                    <p>After some exceptionally entertaining projects - like the Spice Girls rouge-like game, or
                        the web shop for special animals - we came out with the demand of doing something useful
                    </p>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid deserunt illum inventore ipsam, mollitia, optio, provident quaerat suscipit totam unde vel voluptate voluptatibus. Aliquam aperiam earum, eligendi officia qui quisquam?
                    </p>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid deserunt illum inventore ipsam, mollitia, optio, provident quaerat suscipit totam unde vel voluptate voluptatibus. Aliquam aperiam earum, eligendi officia qui quisquam?
                    </p>
                </div>
            </div>

            <div className="meet"> <h1>Meet our team </h1>  </div>

            <div className="team-pics">
                <div className="eszti-pic">
                    <h3> Eszter Kövesdi </h3>
                    <img src={esztiPic} alt="eszti" />
                    {/*<p> kjsdlfj</p>*/}
                </div>
                <div className="hanna-pic">
                    <h3> Hanna Szepesi </h3>
                    <img src={hannaPic} alt="hanna" />
                    {/*<p> kjsdlfj</p>*/}
                </div>
                <div className="berni-pic">
                    <h3> Bernadett Takács </h3>
                    <img src={berniPic} alt="berni"/>
                    {/*<p> kjsdlfj</p>*/}
                </div>
            </div>
        </div>
    )
}

export default AboutUs;