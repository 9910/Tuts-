import React, {Component} from 'react';
import {connect} from 'react-redux';

class UserDetail extends Component {
   render() {
      if(!this.props.user){
         return (<h4>Select a User</h4>);
      }
      return (
         <div>
            <img src={this.props.user.thumbnail}/>
            <h2>{this.props.user.first} {this.props.user.last}</h2>
            <h3>{this.props.user.age}</h3>
            <h3>Desc: {this.props.user.description}</h3>
         </div>
      )
   }
}

//Makes users enabled as props in UserList
function mapStateToProps(state){
   return {
      users: state.activeUser
   };
}

export default connect(mapStateToProps)(UserDetail);
