import React from "react";
import ReactDOM from "react-dom";
import ObjectList from "./components/ObjectList";
import axios from "axios";

class App extends React.Component {
	
	constructor(props){
		super(props);
		
		this.state = {
			objects: []
		};
	}
	
	componentDidMount() {
		axios.get("/api/basicPersistenceObjects").then(response => {
			let oldState = this.state;
			oldState.objects = oldState.objects.concat(response.data._embedded.basicPersistenceObjects);
			this.setState(oldState);
		}).catch(err => {
			console.log(err);
		});
	}
	
	render() {
		return(
			<div>
				<ObjectList items={this.state.objects} />
			</div>
		);
	}
}

ReactDOM.render(<App />, document.getElementById('react'));
