import Header from "./Header";
import {useState} from "react";
import Footer from "./Footer";
import Home from "./Home";

function App() {
    const [isLogged, setIsLogged] = useState(true);

    return (
    <div className="App">
        <Header
            logo="logo"
            title="Mentor Me"
            isLogged={isLogged}
        />
        { isLogged
            ? <div>Logged in</div>
            : <Home />
        }
        <Footer
            text="Coodecool 2022"
        />
    </div>
  );
}

export default App;
