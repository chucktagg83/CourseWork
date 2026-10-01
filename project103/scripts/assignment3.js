function convertTemperature() {
    let input = prompt("Enter temperature and scale (e.g., '32C' or '100F'):");

    // input is the variable, brackets say to use input string length -1 to get the last character
    if(input[input.length - 1].toUpperCase() == "C"){
        let temp = input.substr(0, input.length - 1); //Remove the last character
        let fahrenheit = (temp * 9/5) + 32;

        //results DIV for USA
        let resultsDIV = document.getElementById("results");
        resultsDIV.innerHTML = "USA: The current temperature is " + fahrenheit + " °F";
        resultsDIV.className = "USA"; // Set the class to apply the color

        console.log(fahrenheit + " °F");
       
    } else if(input[input.length - 1].toUpperCase() == "F"){
        let temp = input.substr(0, input.length - 1); //Remove the last character
        let celsius = (temp - 32) * 5/9;

        //results DIV for Worldwide
        let resultsDIV = document.getElementById("results");
        resultsDIV.innerHTML = "Worldwide: The current temperature is " + celsius + " °C";
        resultsDIV.className = "Worldwide"; // Set the class to apply the color

        console.log(celsius + " °C");

    } else {
        document.getElementById("results").innerHTML = "Invalid input. Please enter temperature followed by 'C' or 'F'.";
    }
}