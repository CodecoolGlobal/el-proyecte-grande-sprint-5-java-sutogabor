import React from "react";

import Quiz from "./Quiz";
import Codecooler from "./Codecooler";

import "../assets/css/Game.css";

const Game = ({showResult, currentQuestion, fetchQuestion, showErrMsg}) => {
    return <main>
        <Quiz
            currentQuestion={currentQuestion}
            fetchQuestion={fetchQuestion}
            showErrMsg={showErrMsg}
            showResult={showResult}
        />
        <Codecooler />
    </main>
}

export default Game;
