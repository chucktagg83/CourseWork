// Fernanda
let name = "Fernanda";
let lastname = "Murillo";
let email = "fmurillo@sdgku.edu";

// Timothy
let name1 = "timothy";
let lastname1 = "Sailer";
let email1 = "tsailer@sdgku.edu";



// Object Literal
let person1 = {
    name: "Fernanda",
    lastname: "Murillo",
    email: "fmurillo@sdgku.edu"
};

let person2 = {
    name: "Luis",
    lastname: "Perez",
    email: "lperez@sdgku.edu"
};

let person3 = {
    name: "Aprile",
    lastname: "Smith",
    email: "asmith@sdgku.edu"
};

//Access to the attributes of an object
console.log(person1.name);
console.log(person1.email);

// Display the person names in the html/browser
let paragraph = document.createElement("p");
paragraph.innerHTML = person2.name;

document.body.appendChild(paragraph);