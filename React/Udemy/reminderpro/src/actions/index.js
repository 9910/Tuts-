import {ADD_REMINDER, DELETE_REMINDER, CLEAR_REMINDERS} from '../constans';

export const addReminder = (text, dueDate) => {
    const action = {
        type: ADD_REMINDER,
        text,
        dueDate
    }
    console.log('action in addReminder', action);
    return action;
}

// 2. Add actions to throw them to reducers
export const deleteReminder = (id) => {
    const action = {
        type: DELETE_REMINDER,
        id
    }
    console.log('deleting', action);
    return action;
}

export const clearReminders = () => {
    return {
        type: CLEAR_REMINDERS
    }
}
