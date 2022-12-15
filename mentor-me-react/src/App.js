import Header from "./Header";
import {useState} from "react";
import Footer from "./Footer";

function App() {
    const [isLogged, setIsLogged] = useState(true);

    return (
    <div className="App">
        <Header
            logo="logo"
            title="Mentor Me"
            isLogged={isLogged}
        />
        <Footer
            text="Coodecool 2022"
        />
    </div>
  );
}

export default App;
