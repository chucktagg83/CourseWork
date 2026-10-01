// Save
$("#saveBtn").click(function () {
    //1. Get the value from the input
    const username = $("#username").val().trim();
    const name = $("name").val().trim();
    const age = $("age").val().trim();
    const password = $("password").val().trim();

    //2. Save the value on the local storage
    localStorage.setItem("username", username);
    localStorage.setItem("name", name);
    localStorage.setItem("age", age);
    localStorage.setItem("password", password);


    //3. Clear the form for UX
    $("#username").val("");
    $("#name").val("");
    $("#age").val("");
    $("#password").val("");
});



// Get
$("#getBtn").click(function (event) {
    event.preventDefault();
    //1. Find the key in the local storage
    const username = localStorage.getItem("username");
    const name = localStorage.getItem("name");
    const age = localStorage.getItem("age");
    const password = localStorage.getItem("password");

    //2. Display the value in the p element
    $("#result").text(`Username: ${username}, Name: ${name}, Age: ${age}, Password: ${password}`);
});


// Delete
$("#deleteBtn").click(function(event) {
    event.preventDefault();

    //1. Remove the item from local storage
    const confirmation = confirm("Are you sure?");

    if(confirmation){
        localStorage.clear();
    }
});