// 1. Identify the form
//querySelector will ask for a html element
const productForm = document.querySelector("form");

// Identify the body 
const body = document.getElementById("body")

// Define the constructor
function Product(name, price, category){
    this.name = name;
    this.price = price;
    this.category = category;
}

// Retrieve the information
function registerProduct(event){
    event.preventDefault();// avoid the refresh in the page
   //console.log(event)

   // Test the button and function connection
    //console.log("Connected");

    // Use the input name to pull the data
    const name = productForm.elements["productName"].value;
    const price = productForm.elements["productPrice"].value;
    const category = productForm.elements["productCategory"].value;

    // Create the object
    const newProduct = new Product(name, price, category);
    console.log(newProduct);

    const row = displayRow(newProduct);

    body.appendChild(row);
}

function displayRow(newProduct) {
    // Use the information - Create the row on the table
    const row = document.createElement("tr");

    // Define the content of the row
    row.innerHTML = `
        <td>${newProduct.name}</td>
        <td>${newProduct.price}</td>
        <td>${newProduct.category}</td>
        <td><button> class="btn btn--danger">Delete</button></td>
    `;

    return row;
}
