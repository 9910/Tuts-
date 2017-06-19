import React, { Component } from 'react';
import Clock from './Clock.jsx';
import './App.css';
import { Form, FormControl, Button } from 'react-bootstrap';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            deadline: 'December 25, 2017',
            newDeadLine: ''
        }
    }

    changeDeadLine() {
        this.setState({deadline: this.state.newDeadLine})
    }

    render() {
        return (
            <div className="App">
                <div className="App-title">
                    Countdown to {this.state.deadline}
                </div>
                <Clock deadline={this.state.deadline} />
                <Form inline>
                    <FormControl className="Deadline-input" type="text" placeholder="new date" onChange={event => this.setState({newDeadLine: event.target.value})}/>
                    <Button onClick={() => this.changeDeadLine()}>Submit</Button>
                </Form>
            </div>
        )
    }
}

export default App;