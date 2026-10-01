console.log("The loops.js is running");
// repeat
// FOR loop Syntax
// for(startPoint; condition; interval) {
//code to be repeated
// }

for (let i=0; i<10; i++){
    console.log(i);
}

for (let j=10; j<201; j++){
    console.log(j);
}
         
function multiTable(){
    let num = document.getElementById("txtNum"); //get the value from input
    
    for (let i=1; i<=10; i++){
        document.getElementById("results").innerHTML+=`<li>
        ${i} * ${num} = ${i * num}</li>`;
    }
}
    

// print your names 5 times
// use for loop

for (let name  = 1; name<6; name++){
    console.log("Chuck");
}

for (let i=1; i<=10; i++){
    console.log(`Iteration:  ${i}` );
}

for(let counter=0; counter<101;counter+=10){
    console.log(`Iteration:  ${counter}`);
}

//print the places from 1 ... 20 (runners places)
// Gold, Silver, Bronze, 4, 5, ... 20

for (let place = 1; place <=20; place++){
    if (place == 1){
        console.log("Gold");
    } else if (place == 2){
        console.log("Silver");
    } else if (place == 3){
        console.log("Bronze");
    } else {
        console.log(place++)
    }
} 

function generateTable(){
    for(let c=1;c<10;c++){
        let f = (c*9/5) + 32;
        document.getElementById("temps").innerHTML+=`
            <tr>
                <td>${c}</td>
                <td>${f}</td>
            </tr>
        `;
    }
}