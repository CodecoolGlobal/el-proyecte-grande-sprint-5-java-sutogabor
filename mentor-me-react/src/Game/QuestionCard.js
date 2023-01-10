import React, {useState} from "react";
import Result from "./Result";

const QuestionCard = ({showResult, currentQuestion, fetchQuestion}) => {
    const [score, setScore] = useState(0);

    const fetchAnswer = async (id) => {
        try {
            const res = await fetch(`http://localhost:8080/task/${id}`);
            const isCorrect = await res.json();
            if (isCorrect) {
                setScore(score + 1);
            }
        } catch (err) {
            console.log(err);
        }
    }

    const handleClick = (e) => {
        e.preventDefault();
        const answerId = e.target.value;
        fetchAnswer(answerId);
        fetchQuestion();
    }

    return <>
        {!showResult ?
            <div className="question-card">
                <h2>{currentQuestion.message}</h2>
                <ul>
                    {currentQuestion.options.map(option => {
                        return <li onClick={handleClick} key={option.id} value={option.id}>
                            {option.message}
                        </li>
                    })}
                </ul>
            </div>
            : <Result
                fetchQuestion={fetchQuestion}
                score={score}
                setScore={setScore}
            />
        }
    </>
}

export default QuestionCard;

