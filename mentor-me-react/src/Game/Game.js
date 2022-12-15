import React from "react";

import Quiz from "./Quiz";
import Codecooler from "./Codecooler";

import "../assets/css/Game.css";

const Game = ({showResult, score, currentQuestion, fetchQuestion}) => {
    return <main>
        <Quiz
            showResult={showResult}
            score={score}
            currentQuestion={currentQuestion}
            fetchQuestion={fetchQuestion}
        />
        <Codecooler />
    </main>
}

export default Game;
