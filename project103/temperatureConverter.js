function promptUserC() {
    let celsius = prompt("Enter temperature in °Celsius")
    celsius = Number(celsius);
    if (isNaN(celsius)) {
        alert("Please enter a vaild number.");
        return;
    }
    //convert to Fahrenheit
    let fahrenheit = ((celsius * 9/5) +32)
    document.getElementById("userInputDisplay").innerHTML = `${celsius} °C is ${fahrenheit.toFixed()} °F`;
    updateThermometer(celsius);
}

function promptUserF() {
    let fahrenheit = prompt("Enter temperature in °Celsius")
    fahrenheit = Number(fahrenheit);
    if (isNaN(fahrenheit)) {
        alert("Please enter a vaild number.");
        return;
    }
    //convert to Fahrenheit
    let celsius = (fahrenheit - 32) * 5/9;
    document.getElementById("userInputDisplay").innerHTML = `${fahrenheit} °F is ${celsius.toFixed()} °C`;
    updateThermometer(celsius);
}

function generateTable() {
    const tbody = document.querySelector("#chart tbody");
    tbody.innerHTML = "";
    
    for (let celsius = 0; celsius <= 100; celsius +=10) {
        const fahrenheit = (celsius * 9/5) +32;
        const row = document.createElement("tr");

     // Create cells for Celsius and Fahrenheit
        const celsiusCell = document.createElement("td");
        celsiusCell.innerText = celsius;
        const fahrenheitCell = document.createElement("td");
        fahrenheitCell.innerText = fahrenheit.toFixed(2);

     // Append cells to the row
        row.appendChild(celsiusCell);
        row.appendChild(fahrenheitCell);
        tbody.appendChild(row); // Append row to the table body   
    }
}

function updateThermometer(celsius) {
    const filled = document.getElementById("filled");
    const thermometerHeight = 300;
    const percentage = (celsius / 100) * thermometerHeight;

    filled.style.height = `${Math.min(Math.max(percentage, 0), thermometerHeight)}px`;

    if(celsius <=10) {
        filled.style.backgroundColor = "blue";
    } else if (celsius <= 25) {
        filled.style.backgroundColor = "orange";
    } else {
        filled.style.backgroundColor = "red";
    }
}