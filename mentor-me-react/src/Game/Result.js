import React from "react";
import "../assets/css/Result.css";

const Result = ({score}) => {
    return <div className="result">
        <h1>Your Score</h1>
        <h2>{score}</h2>
        <button>Again?</button>
    </div>
}

export default Result;
