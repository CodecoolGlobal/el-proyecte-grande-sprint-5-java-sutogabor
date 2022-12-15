import Header from "./Header";
import {useState} from "react";

function App() {
    const [isLogged, setIsLogged] = useState(true);

    return (
    <div className="App">
        <Header
            logo="logo"
            title="Mentor Me"
            isLogged={isLogged}
        />
    </div>
  );
}

export default App;
