import {combineReducers} from 'redux';
import UserReducer from './reducer-users';
import ActiveUserReducer from './reducer-active-user';

//Combines the Data
const allReducers = combineReducers({
   users: UserReducer,
   activeUser: ActiveUserReducer
   //Something: Value
});

export default allReducers;
