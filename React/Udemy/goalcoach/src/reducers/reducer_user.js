import {SIGNED_IN} from '../constance';

let user = {
    email: null
}

export default (state = user, action) => {
    switch (action.type){
        case SIGNED_IN:
            const {email} = action;
            user = {
                email
            }
            return user;
        default:
            return state; //Return STATE to mapStateToFunction
    }
}