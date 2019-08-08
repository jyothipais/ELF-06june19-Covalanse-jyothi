//1 Way of Creating Component
//Creating fn for Header Component
function Header(props){
    console.log(props);
    return React.createElement('h1',null,'Header');
}

//Creating fn for Footer Component
function Footer(){
    return React.createElement('h1',null,'Footer');
}

//Creating fn for Component Component
function Content(){
    return React.createElement('h1',null,'Content');
}
//Creating Elements to Component
const header=React.createElement(Header,{items:['johnson']});
const footer=React.createElement(Footer);
const content=React.createElement(Content);

//Passing all Element in div Element
const myApp=React.createElement('div',null,header,footer,content);

ReactDOM.render(myApp,document.getElementById('app'));