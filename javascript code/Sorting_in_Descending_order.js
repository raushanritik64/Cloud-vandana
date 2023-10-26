// B. Perform sorting of an array in descending order. 

function descArray(arr) {

    arr.sort(function(a, b) {
        return b - a; 
    });
}
var inputArray=[];
var n = prompt("Enter the size of the Array: ");
for(var i=0; i<n; i++){
  inputArray[i] = prompt();
}

descArray(inputArray);
console.log(inputArray);