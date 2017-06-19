import React, {Component} from 'react';
import {connect} from 'react-redux';
import {firebaseApp} from '../firebase';
import AddGoal from './addGoal';
import GoalList from './goalList';

class App extends Component {
    signOut() {
        firebaseApp.auth().signOut();
    }

    render() {
        return (
            <div style={{margin: '5px'}}>
                <h3>Goals</h3>
                <AddGoal/>
                <GoalList/>
                <div>Add Goal</div>
                <div>Goal List</div>
                <button className="btn btn-danger" onClick={() => this.signOut()}>Sign Out</button>
            </div>
        )
    }
}

function mapStateToProps(state) {
    // console.log('state', state);
    return {}
}
export default connect(mapStateToProps, null)(App);