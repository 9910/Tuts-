import React from 'react'
import './App.css'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Home from './Home'
import Paris from './Paris'
import London from './London'
import Tokyo from './Tokyo'
import Users from './Users'

export default React.createClass({
    render() {
        return (
           <Router>
               <div>
                   <div className="container">
                       <header>
                           <h1>City Gallery</h1>
                       </header>
                       <nav>
                           <ul>
                              <li>
                                 <Link to="/">Home</Link>
                              </li>
                               <li>
                                   <Link to="/London">London</Link>
                               </li>
                               <li>
                                   <Link to="/Paris">Paris</Link>
                               </li>
                               <li>
                                   <Link to="/Tokyo">Tokyo</Link>
                               </li>
                               <li>
                                   <Link to="/users/1">User1</Link>
                               </li>
                               <li>
                                   <Link to="/users/2">User2</Link>
                               </li>
                               <li>
                                   <Link to="/users/3">User3</Link>
                               </li>
                               <li>
                                   <Link to="/users/4">User4</Link>
                               </li>
                           </ul>
                       </nav>
                       <Route exact={true} path="/" component={Home} />
                       <Route path="/London" component={London} />
                       <Route path="/Paris" component={Paris} />
                       <Route path="/Tokyo" component={Tokyo} />
                       <Route path="/users/:userId" component={Users} />
                       <footer>Copyright &copy; W3Schools.com</footer>
                   </div>
                </div>
            </Router>
          )
       }
})
