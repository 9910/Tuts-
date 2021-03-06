import React, {Component} from 'react';
import {bindActionCreators} from 'redux';
import {connect} from 'react-redux';
import {selectUser} from '../actions/index';

class UserList extends Component {
   createListItems(){
      return this.props.users.map((user) => {
         return (
            //Always use the ID
            <li keyParams={user.id} onClick={() => this.props.selectUser(user)}>
               {user.first} {user.last}
            </li>
         )
      });
   }
   render() {
      return(
         <ul>
            {this.createListItems()}
         </ul>
      );
   }
}

//Makes users enabled as props in UserList
function mapStateToProps(state){
   return {
      users: state.users
   };
}

function matchDispatchToProps(dispatch){
   return bindActionCreators({selectUser: selectUser}, dispatch);
}

//Connect combines mapStateToProps with UserList
export default connect(mapStateToProps, matchDispatchToProps)(UserList);
