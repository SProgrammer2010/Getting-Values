// This JavaScript code will get the First, Middle, and the Last Values of an array.

const Values = ["Tesla", "Porsche", "Ferrari", "Lamborghini","Chevrolet"]
const fun = Math.floor(Values.length/2)

console.log("This is the number of cars: ", Values.length);
console.log("This is the First Car: ", Values[Values.length-Values.length])
console.log("This is the Middle Car: ", Values[fun])
console.log("This is the Last Car: ", Values[Values.length-1])