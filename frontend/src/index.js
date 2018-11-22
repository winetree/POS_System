import React from 'react';
import ReactDOM from 'react-dom';
import App from './App.js';
import 'bootstrap/dist/css/bootstrap.min.css';
import './css/style.css';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(<App />, document.getElementById('root'));
serviceWorker.unregister();