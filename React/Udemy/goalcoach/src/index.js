import React from 'react';
import ReactDOM from 'react-dom';
import {createStore} from 'redux';
import {Provider} from 'react-redux';
import {Router, Route, browserHistory} from 'react-router';
import {firebaseApp} from './firebase';
import {logUser} from './actions';
import reducer from './reducers/reducer_user';

import App from './components/App';
import Signin from './components/Signin';
import Signup from './components/Signup';

const store = createStore(reducer);

firebaseApp.auth().onAuthStateChanged(user => {
    if(user) {
        // console.log('user is signed in', user);
        const {email} = user;
        store.dispatch(logUser(email));
        browserHistory.push('/app');
    } else {
        // console.log('user is signed out or needs to sign in', user);
        browserHistory.replace('/signin');
    }
});

ReactDOM.render(
    <Provider store={store}>
        <Router path="/" history={browserHistory}>
            <Route path="/app" component={App}/>
            <Route path="/signin" component={Signin}/>
            <Route path="/signup" component={Signup}/>
        </Router>
    </Provider>,
    document.getElementById('root')
);
