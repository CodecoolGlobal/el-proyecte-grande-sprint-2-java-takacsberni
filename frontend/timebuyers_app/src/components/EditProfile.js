import React from 'react';
import {useEffect, useState} from 'react';
import {useParams} from "react-router-dom";
import Form from 'react-bootstrap/Form';


export default function EditProfile() {
    const [user, setUser] = useState([]);
    let {filter} = useParams();



    useEffect(() => {
        fetchUser(filter).then((user) => {
            setUser(user)
        })
    }, [filter])

    const fetchUser = async (filter) => {
        const response = await (fetch("/api/users/get/" + filter));
        return await response.json();
    }


    return (
        <>
        <Form.Group className="mb-3">
                <Form.Label>Username</Form.Label>
                <Form.Control placeholder={user.userName} disabled />

                <Form.Label>Username</Form.Label>
                <Form.Control placeholder={user.password} disabled />

                <Form.Label>Email</Form.Label>
                <Form.Control placeholder={user.email}  />

                <Form.Label>Phone</Form.Label>
                <Form.Control placeholder={user.phoneNumber}  />

                <Form.Label>Town</Form.Label>
                <Form.Control placeholder={user.town}  />

                <Form.Label>Rating</Form.Label>
                <Form.Control placeholder={user.rating} disabled />
            </Form.Group>


            <Form.Group className="mb-3">
                <Form.Label>Status</Form.Label>
                <Form.Select >
                    <option>BUYER</option>
                    <option>TASKER</option>
                    <option>BOTH</option>
                </Form.Select>
            </Form.Group>
        </>
    );


};






