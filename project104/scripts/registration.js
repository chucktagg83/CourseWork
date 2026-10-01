// Create an Array to hold the pet objects
const petsList = [];

// Function to generate Unique ID
function generateID() {
    return Math.floor(Math.random() * 1000 + Date.now() % 10000);
}

// Define the Pet constructor
function Pet(name, age, species, gender, breed, service) {
    this.id = generateID(); // Unique ID for each pet
    this.name = name;       // Pet's name
    this.age = age;         // Pet's age
    this.species = species; // Pet's species
    this.gender = gender;   // Pet's gender
    this.breed = breed;     // Pet's breed
    this.service = service; // Service requested
    this.registrationDate = new Date().toLocaleDateString(); // Registration date
}

// Function to add new pet and update displays
function addPet(newPet) {
    petsList.push(newPet); // Add to petsList
    displayPetsTable();    // Update display of the table
}

// Function to display pets in a table
function displayPetsTable() {
    const tableBody = document.getElementById('petsTableBody'); // Get the table body element
    if (!tableBody) return;

    tableBody.innerHTML = ''; // Clears table content
    // Loop through each pet and create a new table row for each one
    petsList.forEach(pet => {
        const row = tableBody.insertRow(); // Create a new row in the table
        row.innerHTML = `
            <td>${pet.id}</td>
            <td>${pet.name}</td>
            <td>${pet.age}</td>
            <td>${pet.breed}</td>
            <td>${pet.species}</td>
            <td>${pet.gender}</td>
            <td>${pet.service}</td>
            <td>${pet.registrationDate}</td>
            <td><button class="btn btn-danger" onclick="deletePet(${pet.id})">Delete</button>
        `;
    });
}

// Retrieve the information when the form is submitted
function registerProduct(event) {
    event.preventDefault(); // Prevents the default form submission behavior

    // Use the input names to pull the data
    const name = productForm.elements["input-name"].value;
    const age = productForm.elements["input-age"].value;
    const breed = productForm.elements["input-breed"].value;
    const species = productForm.elements["input-species"].value;
    const gender = productForm.elements["input-gender"].value;
    const service = productForm.elements["input-service"].value;

    // Create a new product object with the gathered input values
    const newProduct = new Pet(name, age, species, gender, breed, service);
    console.log(newProduct); // Log to console for debugging

    // Add the new product to the list and update the display
    addPet(newProduct);

    // Clear form inputs after submission
    productForm.reset();  
}

// Event listener to handle form submission
const productForm = document.querySelector("form"); // Select the form
productForm.addEventListener('submit', registerProduct); // Connect the form submission to the function


//---------------------------------------Dark Mode----------------------------------------------//
$("#darkOrLight").click(function () {

    // Toggle dark mode class on body
    $("body").toggleClass("dark-mode");

    // Change button icon depending on mode
    if ($("body").hasClass("dark-mode")) {
        $("#darkOrLight")
            .text("🌙")
            .removeClass("btn-light")
            .addClass("btn-dark");
    } else {
        $("#darkOrLight")
            .text("☀️")
            .removeClass("btn-dark")
            .addClass("btn-light");
    }
});
