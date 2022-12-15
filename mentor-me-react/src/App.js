import Header from "./Header";
import {useEffect, useState} from "react";
import Footer from "./Footer";
import Home from "./Home";
import Game from "./Game/Game";

function App() {
    const API_URL_BASE = "http://localhost:8080";
    const [isLogged, setIsLogged] = useState(true);
    const [showErrMsg, setShowErrMsg] = useState(null);
    const [currentQuestion, setCurrentQuestion] = useState(null);
    const [showResult, setShowResult] = useState(null);

    const fetchQuestion = async () => {
        try {
            const res = await fetch(API_URL_BASE + "/task");
            const question = await res.json();

            console.log(question);

            if (res.ok) {
                setShowErrMsg(true);
            } else {
                setShowErrMsg(false);
            }

            if (question.message == null) {
                setShowResult(true);
            } else {
                setShowResult(false);
                setCurrentQuestion(question);
            }


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
                currentQuestion={currentQuestion}
                fetchQuestion={fetchQuestion}
                showErrMsg={showErrMsg}
                showResult={showResult}
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
