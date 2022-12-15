import React from "react";
import "./assets/css/Header.css";

const Header = ({logo, title, isLogged}) => {
    return <header>
        <p>{logo}</p>
        <h1>{title}</h1>
        {isLogged
            ? <button>logout</button>
            : <button>login</button>}
    </header>
}

export default Header;
