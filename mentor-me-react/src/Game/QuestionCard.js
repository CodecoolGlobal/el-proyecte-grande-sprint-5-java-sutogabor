import React, {useEffect} from "react";
import Result from "./Result";

const QuestionCard = ({showResult, currentQuestion, fetchQuestion}) => {
    const fetchAnswer = async (id) => {
        try {
            const res = await fetch(`http://localhost:8080/task/${id}`);
            const isCorrect = await res.json();
        } catch (err) {

        }
    }

    const handleClick = (e) => {
        e.preventDefault();
        const answerId = e.target.value;
        fetchQuestion();
    }

    return <>
        {currentQuestion ?
            <div className="question-card">
                <h2>{currentQuestion.text}</h2>
                <ul>
                    {currentQuestion.options.map(option => {
                        return <li onClick={handleClick} key={option.id} value={option.id}>
                            {option.text}
                        </li>
                    })}
                </ul>
            </div>
            : <Result />
        }
    </>
}

export default QuestionCard;

