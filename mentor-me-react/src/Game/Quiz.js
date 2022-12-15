import React from "react";
import "../assets/css/Quiz.css";
import QuestionCard from "./QuestionCard";


const Quiz = ({showResult, score, currentQuestion, fetchQuestion}) => {
    // const showResult = useContext(resultContext);

    return <div className="question-container">
        <h1>Insert Module Name</h1>
        <h2>Current Score: {score}</h2>
        {fetchQuestion ?
            <QuestionCard
                showResult={showResult}
                currentQuestion={currentQuestion}
                fetchQuestion={fetchQuestion}
            />
            :
            <div>
                <h2>Sorry something bad happened</h2>
            </div>
        }
    </div>
}

export default Quiz;
