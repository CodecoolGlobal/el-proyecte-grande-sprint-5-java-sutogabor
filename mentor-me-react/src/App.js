import Header from "./Header";
import {useEffect, useState} from "react";
import Footer from "./Footer";
import Home from "./Home";
import Game from "./Game/Game";

function App() {
    const API_URL_BASE = "http://localhost:8080";
    const [isLogged, setIsLogged] = useState(true);
    const [showErrMsg, setShowErrMsg] = useState(null);
    const [currentQuestion, setCurrentQuestion] = useState();

    const fetchQuestion = async () => {
        try {
            const res = await fetch(API_URL_BASE + "/task");
            const question = await res.json();
            setCurrentQuestion(question);
            if (res.ok) {
                setShowErrMsg(true);
            } else {
                setShowErrMsg(false);
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