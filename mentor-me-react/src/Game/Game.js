import React from "react";

import Quiz from "./Quiz";
import Codecooler from "./Codecooler";

import "../assets/css/Game.css";

const Game = ({score, currentQuestion, fetchQuestion, showErrMsg}) => {
    return <main>
        <Quiz
            score={score}
            currentQuestion={currentQuestion}
            fetchQuestion={fetchQuestion}
            showErrMsg={showErrMsg}
        />
        <Codecooler />
    </main>
}

export default Game;
