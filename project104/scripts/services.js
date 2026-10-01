console.log("Services.js .....");


let select = document.getElementById("serviceName")
let price = document.getElementById("servicePrice")

function disableInput() {
    price.setAttribute("disabled", "")
}

select.addEventListener("change", () => {
    let service  = document.getElementById("serviceName").value

    if (service === "Wash-Dry") {
        disableInput()
        price.value = 55

    } else if (service === "Nail Trimming") {
        disableInput()
        price.value = 40

    } else if (service === "Vaccinations") {
        disableInput()
        price.value = 85
    
    } else if (service === "Socialization") {
        disableInput()
        price.value = 25

    } else if (service === "Boarding") {
        disableInput()
        price.value = 50

    } else if (service === "Pet Spa") {
        disableInput()
        price.value = 85

    } else if (service === "Other") {
        price.value=null
        price.removeAttribute("disabled")
        price.setAttribute("placeholder", "Insert price")
        //alert("All fields are required")
        const pricevalue = $("#servicePrice").val();
        if (pricevalue <= 0){
            $("#servicePrice").css("border", "solid 2px red")
        }
    }
});
    $("#servicesForm").submit(function(event) {

    event.preventDefault();

    let serviceName = $("#serviceName").val().trim();
    let serviceDescription = $("#serviceDescription").val().trim();
    let servicePrice = $("#servicePrice").val().trim();

    if (
        serviceName === "" ||
        serviceDescription === "" ||
        servicePrice === ""
    ) {
        $("#errorMsg")
            .text("All fields are required.")
            .css("color", "red");
        return;
    }

    if (servicePrice <= 0) {
        $("#errorMsg").text("Price must be greater than 0.");
        $("#servicePrice").css("border", "2px solid red");
        return;
    }

    $("#errorMsg").text("");
    alert("Form submitted successfully!");

    $("#servicesForm")[0].reset();
});

    $("#save").click(function(event) {
        event.preventDefault();

        localStorage.setItem("serviceName", $("#serviceName").val().trim());
        localStorage.setItem("serviceDescription", $("#serviceDescription").val().trim());
        localStorage.setItem("servicePrice", $("#servicePrice").val().trim());
    });

    $("#reset").click(function () {
        $("#serviceForm")[0].reset();
    })
    
//--------------------------------------------------------------------------------------------------//
/*call the form, then .submit is the action, then function 
$("#servicesForm").submit(function(event){
    event.preventDefault(event);
    //console.log(event);

    //------Validation------//
    //1. Ge the values of the input field (trim takes away any blank spaces)
    const name = $("#serviceName").val().trim();
    const description = $("#serviceDescription").val().trim();
    const price = $("#servicePrice").val();

    //2. Validate the values
    // && = and, || = or
    if (name == "" || description == "" || price <= 0) {
        //alert("All fields are required"); 
        $("#serviceName").css("border", "solid, 2px, red")

    }

    // Two ways to remove border 
    //if no name, put border, esle no border
    if(!name){
        $("serviceName").css("border", "solid, 2px, red");
    } else {
        $("serviceName").css("border", "");
    }

    if(!description){
        $("#serviceDescription").css("border", "solid, 2px, red")
    } else {
        $("#serviceDescription").removeAttr("style");
    }

    // to clear the form
    this.reset();

});*/

//--------------------------------------------------------------
// Dark Mode
//--------------------------------------------------------------

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
