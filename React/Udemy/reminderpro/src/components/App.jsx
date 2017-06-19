import React, {Component} from 'react';
import {connect} from 'react-redux';
import {addReminder, deleteReminder, clearReminders} from '../actions';
import Moment from 'moment';

class App extends Component {
    constructor(props){
        super(props);
        this.state = {
            text: '',
            dueDate: ''
        }
    }

    addReminder() {
        this.props.addReminder(this.state.text, this.state.dueDate);
    }

    deleteReminder(id){
        this.props.deleteReminder(id);
    }

    renderReminders() {
        const { reminders } = this.props;
        return (
            <ul className="list-group col-sm-4">
                {
                    reminders.map(reminder => {
                        return (
                            <li key={reminder.id} className="list-group-item">
                                <div className="list-item">
                                    <div>{reminder.text}</div>
                                    <div><em>{Moment(new Date(reminder.dueDate)).fromNow()}</em></div>
                                </div>
                                <div className="list-item delete-button" onClick={() => this.deleteReminder(reminder.id)}>&#x2715;</div>
                            </li>
                        )
                    })
                }
            </ul>
        )
    }

    render(){
        return (
            <div className="App">
                <div className="title">
                    Reminder Pro
                </div>
                <div className="form-inline">
                    <div className="form-group">
                        <input type="text" className="form-control reminder-form" onChange={event => this.setState({text: event.target.value})} placeholder="I have to..."/>
                        <input type="datetime-local" className="form-control" onChange={event => this.setState({dueDate: event.target.value})}/>
                    </div>
                    <button onClick={() => this.addReminder()} type="button" className="btn btn-success">Add Reminder</button>
                </div>
                {this.renderReminders()}
                <div className="btn btn-danger" onClick={() => this.props.clearReminders()}>Clear Reminders</div>
            </div>
        )
    }
}
//mapStateToProps - allows reducers in the redux store to become accessible within React Components through this.props.
function mapStateToProps(state) {
    return {
        reminders: state
    }
}
                        /*Reducers*/                 /*Actions*/
export default connect(mapStateToProps, {addReminder, deleteReminder, clearReminders})(App);
//mapDispatchToProps  allows reducers in the redux store to become accessible within React Components through this.props.