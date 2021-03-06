import React from 'react';
import './App.css';
import { library } from "@fortawesome/fontawesome-svg-core";
import { faPhone, faEnvelope, faUser, faCar } from "@fortawesome/free-solid-svg-icons";
import { RouterHome } from './Components/RouterHome';

library.add(faPhone, faEnvelope, faUser, faCar);

function App() {
  return (
    <div className="App">
      <RouterHome />
    </div>
  );
}

export default App;
