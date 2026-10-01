function convertTemps(){
    console.log("Converting")
    let temperature = prompt("What is the temperature in Celcius: ")
    let fahrenheit = (temperature * 9/5) + 32

    console.log(`The temperature in Fahrenheit is: ${fahrenheit}`);
    document.write(`The temperature in Fahrenheit is: ${fahrenheit}`);
}

