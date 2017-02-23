import React from 'react';

class App extends React.Component{
   render(){
      return <Button>I <Heart /> React</Button>
   }
}

const Button = (props) => <button>{props.children}</button>

class Heart extends React.Component{
   render(){
      return <span>&hearts;</span>
   }
}

export default App

/*
import React from 'react';

 class App extends React.Component {
    constructor(){
      super();
      this.state = {currentEvent: '---'}
      this.update = this.update.bind(this)
   }
   update(e){
     this.setState({currentEvent: e.type})
   }
   render(){
     return (
       <div>
       <textarea
          onKeyPress={this.update}
          onCopy={this.update}
          onCut={this.update}
          onPaste={this.update}
          onFocus={this.update}
          onBlur={this.update}
          cols="30"
          rows="10"/>
        <h1>{this.state.currentEvent}</h1>
       </div>
     )
   }
 }
*/
