/*let NAME=document.getElementById('NAME');
console.log(NAME);
console.log(NAME.textContent);
NAME.style.color='skyblue';

var classCollection=document.getElementsByClassName('demo');
console.log(classCollection);
classCollection[0].style.fontSize='100px';

classCollection[1].style.display='none';

document.getElementById('mybutton1').className='button';
document.getElementById('mybutton2').classList='button button1';

var querySelect=document.querySelectorAll('.demo');
console.log(querySelect);


var input=document.createElement('input');
document.body.appendChild(input);
var demoClass=document.querySelectorAll('.demo');
console.log("By class name"+demoClass.length);


var demoClass1=document.querySelectorAll('.demo');
console.log("query selector"+demoClass1.length);

console.log("Number of Elements eith querySelectorAll="+demoClass1.length);
console.log("Number of Elements eith queryElementsByClassName="+demoClass.length);

document.getElementById('pele').className="blue";

console.log("Number of Elements eith querySelectorAll="+demoClass1.length);
console.log("Number of Elements eith queryElementsByClassName="+demoClass.length);

document.getElementById('div1')

button.onclick=function cretaeElement(){
    document.getElementById('div1').innerHTML='<a href="https://www.google.com">Anchor Tag </a>';
};

})*/
let button=document.getElementById('mybutton');
window.onload=function(){

document.getElementById('mybutton').textContent='Dont Click';
};
button.addEventListener('click',()=>{
    document.getElementById('div1').innerHTML='<a href="https://www.google.com">Anchor Tag </a>';
});








