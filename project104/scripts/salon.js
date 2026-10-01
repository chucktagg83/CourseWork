//Object literal for salon infornmation
const salon = {
    name: "Colfax Pet Saloon",
    hours: {
        open: "9:00 AM",
        close: "6:00 PM"
    },
    phone: "123-231-4567",
    address: {
        street: "123 Colfax Ave",
        city: "Denver",
        state: "CO",
        zip: "80011"
    }
};

// Function to display salon information
function displaySalonInfo() {
    const info = 
    salon.name +
    " is open from " + salon.hours.open +
    " to " + salon.hours.close + 
    ". You can reach us at " + salon.phone +
    ", " + salon.address.city +
    ", " + salon.address.state +
    " " + salon.address.zip + ".";

     // Display the information in a <p> tag
    const salonInfoElement = document.getElementById("salonInfo");
    salonInfoElement.textContent = info; // Update the content of <p> tag
}

// Call the function to display the information when the page loads
document.addEventListener("DOMContentLoaded", displaySalonInfo);