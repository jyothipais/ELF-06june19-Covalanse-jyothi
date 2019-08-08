//1 Way of Creating Component
//Creating class for Header Component
class Header extends React.Component{
    constructor(props){
        super(props);
        console.log(this.props);
    }
   render(){
    return React.createElement('h1',null,'Header');
   }   
}

//Creating class for Footer Component
class Footer extends React.Component{
    render(){
        return React.createElement('h1',null,'Footer');
    }   
}

//Creating class  for content  
class Content extends React.Component{
    constructor(props){
        super(props);
    }
    render(){
       return React.createElement('ul',null,
        this.props.item.map((value,index)=>{
            return React.createElement('li',{key:index},value);
        })
        )
        // return React.createElement('h1',null,'Content');
    }   
}
const items=['vimali','ashika','pavi','sarathi']
//Creating Elements to Component
const header=React.createElement(Header,{items:['johnson']});
const footer=React.createElement(Footer);
const content=React.createElement(Content,{item:items});

//Passing all Element in div Element
const myApp=React.createElement('div',null,header,content,footer);

ReactDOM.render(myApp,document.getElementById('app'));