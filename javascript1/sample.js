//this keyword

var a=10;
console.log(this);  //window
console.log(window);//window
console.log(this.a);//10
console.log(window.a);//10
console.log(this===window);

var person={
    name:'jyothi',
    age:21,
    getNAme:function(){
        console.log(this);
        function innerFunction(){
            console.log(this);
        }
        innerFunction();
    }

};
person.getNAme();

function checkThis(){
console.log(this);  //window
console.log(window);//window
console.log(this.a);//10
console.log(window.a);//10
console.log(this===window);

}

this.checkThis();

var person={
    name:'jyothi',
    age:21,
    getNAme:function(){
        console.log(this);
        function innerFunction(){
            console.log(this);
        }
        innerFunction();
    }

};
person.getNAme();

var john={
    name:'john',
    age:26,
    presentation:function(style,message){
        if(style==='form1'){
            console.log("hii" +this.name+ 'good' +message);
        }else{
            console.log('hey' +this.name+ ' ' +message);
        }
    }
};

john.presentation('form1','morning');

var mike={
    name:'mike',
    age:33
};

//call method
john.presentation.call(mike,'frndly','evening');

//apply method
john.presentation.apply(mike,['frndly','evening']);

//bind method
var johnformal= john.presentation.bind(mike,'form1');
johnformal('night');
