import {SIGNED_IN, SET_GOALS} from '../constance';

export function logUser(email) {
    const action = {
        type: SIGNED_IN,
        email
    }
    return action;
}

export function setGoals(goals) { //SEND tu reducer
    const action = {
        type: SET_GOALS,
        goals
    }
    return action;
}