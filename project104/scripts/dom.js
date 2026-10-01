function changeTitle(){ //changeTitle has to be added in the html as a id
    // Testing
    // alert("Is connected");

    //Get the HTML element with id="title" and store it in a variable
    var title = document.getElementById("title");

    // Change the text inside the title
    title.innerHTML = "Hello Cohort 65!!";

    // Get ALL the elements with class="text" and store them in a variable
    var paragraphs = document.getElementsByClassName("text");

    paragraphs[0].style.color = "blue";
    paragraphs[1].style.color = "red";
}  

function addItem(){
    let inputValue = document.getElementById("itemInput").value;
    // this line is pointing back to the id from the html and requesting the value that was input

    let list = document.getElementById("list");

    let li = document.createElement("li");
    li.innerHTML = inputValue;
    
    list.appendChild(li);

    inputValue.value = "";
}  
