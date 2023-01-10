import React from "react";
import "../assets/css/Result.css";

const Result = ({score, setScore, fetchQuestion}) => {
    const setTasksToUncompleted = async () => {
        const API_URL = "http://localhost:8080/task/uncompleted"
        await fetch(API_URL)
        fetchQuestion()
        setScore(0)
    }

    return <div className="result">
        <h1>Your Score</h1>
        <h2>{score}</h2>
        <button onClick={setTasksToUncompleted}>Again?</button>
    </div>
}

export default Result;
