function showImages() {
    //change other images
     document.getElementById('im2').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2019/07/09/19/39/squirrel-4327363__340.jpg'/>";
     document.getElementById('im3').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2019/07/05/11/10/squirrel-4318332__340.jpg'/>";
     document.getElementById('im4').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2019/07/14/09/44/squirrel-4336651__340.jpg'/>";
    //create elements
      var containerElem = document.createElement("div");
      containerElem.setAttribute("id", "container");
      containerElem.setAttribute("class", "container row margin-for-element");
      document.body.appendChild(containerElem);
      var firstImg = document.createElement("img");
      firstImg.setAttribute("class", "col-3 imgheight");
      firstImg.setAttribute("src", 'https://cdn.pixabay.com/photo/2019/07/09/19/39/squirrel-4327363__340.jpg');
      containerElem.appendChild(firstImg);
      var SecondImg = document.createElement("img");
      SecondImg.setAttribute("class", "col-3 imgheight");
      SecondImg.setAttribute("src", 'https://cdn.pixabay.com/photo/2019/07/05/11/10/squirrel-4318332__340.jpg');
      containerElem.appendChild(SecondImg);
      var thirdImg = document.createElement("img");
      thirdImg.setAttribute("class", "col-3 imgheight");
      thirdImg.setAttribute("src", 'https://cdn.pixabay.com/photo/2019/07/14/09/44/squirrel-4336651__340.jpg');
      containerElem.appendChild(thirdImg);
    }
    
    function hideImages() {
        //change back other images
        document.getElementById('im2').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2019/07/05/11/09/squirrel-4318331__340.jpg'/>";
        document.getElementById('im3').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2019/07/16/06/04/squirrel-4341122__340.jpg'/>";
        document.getElementById('im4').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2019/07/01/14/30/squirrel-4310069__340.jpg'/>";
        //remove elements
        var container = document.getElementById('container');
        document.body.removeChild(container);
    }