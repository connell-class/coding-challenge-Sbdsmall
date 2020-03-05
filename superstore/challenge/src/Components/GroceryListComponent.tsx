import React from 'react';
import {AppBar,Toolbar,IconButton } from 'material-ui';
export class GroceryListComponent extends React.Component<any>{
    constructor(props:any){
        super(props);
    }

    render(){
        return(
            <>
            <div>
                <h1>Hello Welcome to the grocery list</h1>
            </div>
            </>
        )
    }
}