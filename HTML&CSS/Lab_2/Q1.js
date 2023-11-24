// Function to calculate the square of a number
function squareNumber(number) {
    return number * number;
  }
  
  // Get user input 
  var userInput = prompt("Enter a number:");
  // Convert the user input to a number
  var number = parseFloat(userInput);
  
  // Check if the input is a valid number
  if (!isNaN(number)) {
    // Calculate the square using the squareNumber function
    var result = squareNumber(number);
  
    // Display the result in the console
    console.log("The square of " + number + " is: " + result);
  } else {
    // Display an error message if the input is not a valid number
    console.log("Invalid input. Please enter a valid number.");
  }