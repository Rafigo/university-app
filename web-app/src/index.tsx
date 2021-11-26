import React from 'react';
import ReactDOM from 'react-dom';
import { Auth0Provider } from '@auth0/auth0-react';
import App from './App';
import './styles/index.scss';

/* <Auth0Provider
    domain="dev-ez3iwtzi.eu.auth0.com"
    clientId="HTTS6VQujf9UaCjMuvfSBwwWAaGGkwNI"
    redirectUri={window.location.origin}
  > </Auth0Provider> */

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root'),
);
