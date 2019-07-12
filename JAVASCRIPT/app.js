/*var a=10;
console.log(a);
var b=a;
console.log(b);
b=20;
console.log(a);
console.log(b);
console.log("*****************************");

var person={
    name:"jyothi",
    age:21,
    };
    console.log(""+person.name);
    var person1=person;
    console.log(""+person1.name);
    person1.name="Eyekiller";
    console.log(""+person.name);
    console.log(""+person1.name);

    var person={
        firstname:"Eye",
        lastname:"Killer",
        age:21,
       getfullname : function(){
            return this.firstname+""+this.lastname;
        },
        address:{
            city:'Manglore',
            state:'Karnataka'
        },
        hobbies:['sleeping','spendingtimeswith ma parents','listening music']
        };
        console.log(""+person.getfullname());
        console.log(""+person.address.city);
        console.log(""+person.hobbies);
//Array
var students=[
    {
        id:1,
        name:'sara'
    },{
        id:2,
        name:'anitta'
    },{
        id:3,
        name:'jyothi'
    }
];  
console.log(students[0]);
console.log(""+students[0].name); 

//new Date(millisec)
var date=new Date(0);
console.log(""+date);

//new Date()
var date1=new Date();
console.log(""+date1.getDate());

var hobbies=['sleeping','listening songs'];
document.getElementById('demo').innerHTML=hobbies;

//for loop
    var hobbies=['sleeping','listeningsongs']
    document.getElementById('demo').innerHTML=hobbies;
var person={
name:"Jyothi",
age:21,
city:"Manglore"
};
for(var i=0;i<hobbies.length;i++){
    console.log("values="+hobbies[i]);
}

console.log("==================for of loop started ===");
console.time("forof");
for(var i of hobbies){
    var a=[];
}
console.timeEnd("forof");
console.log("for of ended");

function alertMessage(val,number){
    alert('this is named function value=${val} number=${number}');
}
(function(){
    alert("IIFE");
}())
(function(){
    alert("IIFE111111");
})();
alertMessage("aa",12);

varkey();
    function varkey(){
       a=20;
        console.log("aaa="+a);
    }
   
    letkey()
    function letkey(){
        let b=20;
        console.log("bbb="+b);
    }
    
    function constkey(){
        let c=20;
        console.log("bbb"+c);
    }

    fnname();
    function fnname(){
        console.log("aaaaa");
    }

    
    function fnname1(){
        console.log("bbbb");
    }
     fnname1();

    var incl=hobbies.includes("cric");
     console.log(incl);

     hobbies.push("Throw ball");
     console.log(hobbies);
        
     hobbies.pop();
     console.log(hobbies);

     hobbies.shift();
     console.log(hobbies);

     hobbies.unshift("new value");
     console.log(hobbies);  

     hobbies.splice(0,0,"sleeping",'listening music','hhh');
     console.log(hobbies);
     
     let hobbies1=hobbies.slice(1);
     console.log(hobbies);

     //Join method
    
        console.log(hobbies.join('*********'));
        console.log(hobbies); 

        //Indexof     
        console.log( hobbies.indexOf('throwball')); 
        
        
        function first(sec){
            setTimeout(()=>{
                console.log("first");
                sec();
            });           
        }
        function second(){
            console.log("second");
        }
        first(second); */

      //mapping
        const items=[
            {
                id:1,
                name:"book",
                price:100
            },
            {
                id:2,
                name:"pen",
                price:200
            },
            {
                id:3,
                name:"pencil",
                price:50
            }
         ];
         console.log(items);

       let mappedIds=items.map((value)=>{
                return value.id;
        }
        )
        console.log(""+mappedIds);
        console.log(""+items);

        //Filter    
        var hobbies=['sleeping','listening songs','reading'];
        document.getElementById('demo').innerHTML=hobbies;

        let filteredValue=items.filter((value)=>{
            return value.name=='pen';
        });
        console.log(""+filteredValue);
      
