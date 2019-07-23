 window.onload=function(){

 };
function validateForm() {
    //alert("fun called ");
  /*var x = document.forms["myForm"]["email"].value;
  if (x == "") {
    alert("Email address must be filled out");
    return false;
  }*/

  let email=document.forms[0].email.value;
  let password=document.forms[0].password.value;
  let confirmpassword=document.forms[0].confirmpassword.value;
  if(email.length>6 &&
    password.length>6 &&
    confirmpassword.length>6 &&
    (password==confirmpassword)){
        document.forms[0].submitbtn.disabled=true;
    }else{
        document.forms[0].submitbtn.disabled=false;
    }
}

//Sample Program1
var num = prompt("enter no");
 
var factorial = function(n) {
    if(n == 0) {
        return 1
    } else {
        product = 1;
        for(i = 1; i<= n; i++) {
            product *= i;
        }
        return product;
    }
}
 
console.log(factorial(num));

//Sample Program2
function counter(){
    var counter=0;
    function getCount(){
        counter++;
        return counter;
        }
    return getCount();
    }
    let count=counter();
    var value=count();
    console.log(value);
    var value1=count();
    console.log(value);

//promises
var promise=new Promise((res,rej)=>{
    const items=[{id:1,name:'jyothi'},{id:2,name:'joylin'},{id:3,name:'joy'}];
    if(items.length>0){
    res(items);
    }else{
    rej("rejected");
    }
    });
    
    promise.then((data)=>{
        console.log(data);
    }).catch((reason)=>{
        console.log(reason);
    });

    
