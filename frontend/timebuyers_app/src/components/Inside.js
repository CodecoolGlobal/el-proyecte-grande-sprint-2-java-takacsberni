import React from "react";
import '../static/CSS/Inside.css';
import assembly from "../static/images/fa-hero-img-desktop.jpg";
import cleaningPic from "../static/images/cleaning.jpg";
import laundryPic from "../static/images/laundry.png";
import womanPic from "../static/images/woman.png";
import UpperSection from "./UpperSection";

function Inside(){
    return (
        <div>
        <UpperSection />
        <div className="flex-container-inside">

            {/*<div className="left">*/}
            {/*    <img src={assembly} alt="assembler" />*/}
            {/*</div>*/}
            <div className="card-inside">
                <div className="left">
                    <div className="text-container">
                    <h1 className="text-h1 blue">About TimeBuyers...</h1>
                    <p className="home-text"> Have you ever felt like you don't have enough time? <br/>
                        After a long and tiring day at work with all the housework to do, have you wished there was more time?<br/>
                        We think we all do, so you are actually at the right place. Why would you spend yours when you can just buy someone else's.<br/><br/>
                        So TimeBuyers aka 'Taskees' are people who hire
                        other people for jobs such as cleaning, walking the dog, do a grocery shopping etc. But it is not all.
                        You can also people for standing in long lines for you in the bank
                        or even do the Christmas shopping. <br/> Busy animal owners are also welcome as TimeBuyers, as some people are so willing to
                        spend some time with your beloved fury child while the
                        owners can go to places where they cannot bring animals.<br/>
                        Some TimeSellers are also willing to help the elderly with everyday things, such as shopping and cooking. Go and play
                        with the grandchildren Grandma, out TimeSellers take care of everything!

                    </p>
                    </div>
                </div>
                <div className="right">
                    <img src={cleaningPic} alt="cleaning" />
                </div>
            </div>
            <div className="card-inside-left">
                <div className="left">
                    <img src={laundryPic} alt="laundry" />
                </div>
                <div className="right">
                    <div className="text-container">
                        <h1 className="text-h1 green">About TimeSellers...</h1>
                        <p className="home-text">
                            TimeSellers or we can also call them 'Taskers' are people who are hired for a certain job.<br/>
                        If you are student who has a some free time after school and willing to sit someone's baby or dog you are
                        a great candidate to become a TimeSeller. Don't worry, If you are not a dog or baby person you can still complete
                        a vide-variety of "to do"-s. You never know when you find someone who's willing to pay for an activity which is even fun for you.<br/><br/>
                            In the end, if you have some free time and energy to sell, feel free to check the options under the "Tasks" button. That's the first step
                            to become a professional TimeSeller. It is hard to find a second a job which can be synchronized with our already busy schedule, but as a TimeSeller
                        you can always find something occasional.</p>
                    </div>
                </div>
            </div>
            <div className="card-inside bottom">
            <div className="left">
                <div className="text-container">
                <h1 className="text-h1 blue">How to get started?</h1>
                    <p className="home-text">
                        In order to become a TimeBuyer or a TimeSeller or even both, the first thing you need to do is register via the "Register" button in the top right corner of the page,
                        then complete your user profile. <br/>At this step, you need to choose the task you are willing to do and the task you need someone for.
                        Without a user profile you cannot hire people and people cannot hire you.<br/><br/>
                        After completing your profile have fun SAVING TIME!
                    </p>
                </div>
            </div>
                <div className="right">
                <img src={womanPic} alt="woman" />
            </div>
            </div>

        </div>
        </div>
    )
}
export default Inside;