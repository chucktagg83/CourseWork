console.log("Functions");

//1.  function declaration (creating the fn)
function sayHello() {
    console.log("Hello cohort 65");
}

// 2. call/trigger/run/execute fn (code, console, user)
sayHello(); //code run
sayHello(); //code run
sayHello(); //code run

// Example 2. Fn with 1 parameter
function greetBird(birdName){
    document.write(`<p>Hello ${birdName}!  Ready to destroy some pigs!</p>`)
}

greetBird("Red")
greetBird("Blue")
greetBird("Yellow")

// Example 3 with 2 parameters
function greetPlayer(firstName, lastName){
    document.write(`<p>Welcome back ${firstName} ${lastName}</p>`);
}

greetPlayer("John", "Doe");
greetPlayer("Sally", "Seashells");

//Challenge 1
//mine
function doubleScore(playerScore){
    document.write(`<p>Player has a score of ${playerScore}.</p>`);
}

doubleScore(200 * 2)

//instructors
function doubleScore(score){
    let total = score * 2;
    console.log(`Your new score is: ${total}`);
}

doubleScore(10);
doubleScore(12);
doubleScore(8);

// Example 4. Fn with prompt()

function askCharacterName(){
    let characterName = prompt("Enter the name: ");

    document.write(`Welcome ${characterName}`)
}

//trigger the fn from the console

//Example 5. Fn with default parameters
function add(num1=0,num2=0){
    let total = num1 + num2;
    console.log(`The total is ${total}`);
}

add(2,3);
add(5,22.5)
add();

//Challenge 2: Combine Names
function combineNames(firstName="Unknown", lastName="Unknown"){
    console.log(`${firstName} ${lastName}`);
}

combineNames("Alice","Johnson")
combineNames("Alice")
combineNames();

//Challenge 3: Convert Minutes to Seconds

//function convertToSeconds(mins){
//    let secs = mins * 60;
//    console.log(`${mins} mins are ${secs} secs`)
//}

//convertToSeconds(1);
//convertToSeconds(10);
//convertToSeconds(3);

function convertSeconds(){
    console.log("Converting");
    let mins = prompt("Enter mins: ");
    let secs = mins * 60;
    document.write(`${mins} mins are ${secs} seconds`);
}