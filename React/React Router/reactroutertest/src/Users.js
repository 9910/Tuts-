import React from 'react'

const user = [
   {
      name: 'Neko1',
      id: 1
   },
   {
      name: 'Neko2',
      id: 2
   },
   {
      name: 'Neko3',
      id: 3
   },
   {
      name: 'Neko4',
      id: 4
   }
]

export default React.createClass({
   getInitialState() {
      return {
         user: user.filter((user) => {
            return Number(user.id) === Number(this.props.match.params.userId)
         })[0]
      }
   },
   componentWillUpdate() {
      this.setState({
         user: user.filter((user) => {
            return Number(user.id) === Number(this.props.match.params.userId)
         })[0]
      })
   },
    render() {
        return (
           <div>
             <h1>User</h1>
             <span>{this.state.user.name}</span>
           </div>
        )
    }
})
