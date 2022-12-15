import Header from "./Header";
import {useEffect, useState} from "react";
import Footer from "./Footer";
import Home from "./Home";
import Game from "./Game/Game";

function App() {
    const API_URL_BASE = "http://localhost:8080";
    const [isLogged, setIsLogged] = useState(true);
    const [showResult, setShowResult] = useState(false);
    const [currentQuestion, setCurrentQuestion] = useState();
    const [score, setScore] = useState(0);

    const fetchQuestion = async () => {
        try {
            const res = await fetch("http://localhost:3500/questions");
            const questions = await res.json();
            setCurrentQuestion(questions[Math.floor(Math.random() * questions.length)]);
            console.log("response is " + res.ok);
        } catch (err) {
            console.log(err);
        }
    }

    useEffect(() => {
        fetchQuestion();
    }, [])


    return (
    <div className="App">
        <Header
            logo="logo"
            title="Mentor Me"
            isLogged={isLogged}
        />
        { isLogged
            ? <Game
                showResult={showResult}
                score={score}
                currentQuestion={currentQuestion}
                fetchQuestion={fetchQuestion}
            />
            : <Home />
        }
        <Footer
            text="Coodecool 2022"
        />
    </div>
  );
}

export default App;
