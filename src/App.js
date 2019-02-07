import React, { Component } from 'react';
import './App.css';
import axios from "axios";
import MessageView from './message-view';



class App extends Component {
  state = {
    messages:  [
      {
        from: 'John',
        message: 'The event will start next week',
        status: 'unread'
      },
      {
        from: 'Martha',
        message: 'I will be traveling soon',
        status: 'read'
      },
      {
        from: 'Jacob',
        message: 'Talk later. Have a great day!',
        status: 'read'
      }
    ]
  }

  render() {
    const messageViews = this.state.messages.map(function(message, index) {
      return(
        <MessageView key={index} message={message} />
      )
    })
    return(
      <div>
        <h1>List of Messages</h1>
        {messageViews}
      </div>
    )
  }
}
export default App;