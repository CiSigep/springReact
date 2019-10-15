import React from "react";

export default function ObjectList(props) {
	return(
		<div>
			<ol>
				{props.items.map(ele => {
					return (
						<li>String: {ele.stringValue}, Number: {ele.numValue}</li>
					);
				})}
			</ol>
		</div>
	);
};