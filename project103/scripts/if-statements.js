console.log("Running the if statement file");

// if-statement condition (y/n)
//syntax
//if(condition){
//code to be run if the condition is TRUE
//}

let result = 50;

if(result >= 30){
    console.log("You passed the test!");
}

let result2 = 50;
if (result2 == 50){
    console.log("The results are the same!");
}

// ------ 
// == compare 
// case 1: 5 == 5 // true
// case 2: 5 == "5" // true - checks the value
// case 3: 5 === "5" // false - checks the value and data type

// if-statement condition (y/n)
//syntax
//if(condition){
//code to be run if the condition is TRUE
//} else {
//code to be run if the condition is FALSE
//}

result = 50;
if(result >= 40){
    console.log("You passed the exam!");
} else {
    console.error("You did not pass the exam.")
}


let waterTemp = 105;
if(waterTemp >= 100){
    console.log("The water is boiling!");
} else {
    console.log("The water is not boiling yet.");
}

// else if statements
//syntax
//if(condition1){
//code to be run if the condition is TRUE
//} else if(condition2){}
//code to be run if the condition is FALSE
//}else {
    //code to be run if all conditions are FALSE}

function ageCalculator(){
    let age = 15;

    if(age < 13){
        console.log("You are a child.");
    } else if(age < 21){
        console.log("You are an teenager.");
    } else if(age < 65){
        console.log("You are and adult.");
    } else {
        console.log("You are a senior.");
    }   
}

// Challenge 1: 
function traffic(){
    let light = prompt("Enter a color:");

    if(light.toLowerCase() == "green"){ 
        console.log("Go!");
    }else if(light.toLowerCase() == "yellow"){
        console.log("Slow Down!");
    }else if(light.toLowerCase() == "red"){
        console.log("Stop!");
    }else{
        console.error("Unknown light color. Please proceed with caution.");
    }
}


//Movie Ticket Price Calculator

function ticketPrice(){
    let age = prompt("Enter your age:");

    if(age < 12){
        console.log("Your ticket price is $5.00")
    } else if(age < 18 && age >= 12){
        console.log("Your ticket price is $8.00")
    } else if(age >= 18){
        console.log("Your ticket price is $10.00")
    } else {
        console.log("The general ticket price is $10.00")
    }
}

// Role Access Message 

function roleAccess(){
    let role = prompt("Enter your role (admin, editor, visitor):");

    if(role.toLowerCase() == "admin"){
        document.write("Full Access, ");
        document.write(" Welcome Admin!");
    } else if(role.toLowerCase() == "editor"){
        document.write("Access but limited actions,");
        document.write(" Welcome Editor!");
    } else {
        document.write("Error, ");
        document.write("You do not have access!");
    }
}

function weatherOutfit(){
    console.log("Weather outfit");
    const DIV = document.getElementById("results");
    let tmp = prompt("Enter the weather");

    //clear the CSS
    DIV.classList.remove("hot","cold");

    if(tmp < 15){
        DIV.innerHTML="Jacket";
        DIV.classList.add("cold");
    }else if(tmp < 25){
        DIV.innerHTML="Sweater";
    }else{
        DIV.innerHTML="T-Shirt";
        DIV.classList.add("hot");
    }
}