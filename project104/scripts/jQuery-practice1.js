// Old Way
function sayHello()  {
    alert("Hello class!")
}

// How to trigger an event after clicking a button?
// Using jQuery      (jQuery is alwasy Selector -> Action)

//Selector                  Action
$("#triggerEventButton").click(function (){
    alert("Hello class!")
});
// Select the button,  on click start the function

//Create the function for all the buttons
$("#hideButton").click(function (){  //<-------the function telling it "on click"
    $("p").hide();                    //<-------this is what you want it to do
});

$("#showButton").click(function (){
    $("p").show();
});

$("#toggleButton").click(function (){
    $("p").toggle();
});

$("#changeTextButton").click(function (){
    $("p").text("This is new text")
});

$("#addCssButton").click(function (){
    $("p")
    .css("color", "blue")
    .css("border", "solid, red, 2px")
    .css("padding", "10px")
    .css("background-color", "yellow");
});

$("#applyCssClassButton").click(function (){
    $("p").addClass("my-class");
});