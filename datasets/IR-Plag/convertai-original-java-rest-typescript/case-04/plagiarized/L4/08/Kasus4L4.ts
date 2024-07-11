/**
 * Converts miles to kilometers.
 * @param miles The number of miles to convert.
 * @returns The number of kilometers.
 */
function convertMilesToKilo(miles: number): number {
    return miles * 1.609;
}

let counter: number = 1;
console.log("Miles\t\tKilometers");
console.log("-------------------------------");

// Use while loop
while (counter <= 10) {
    // Display the results
    console.log(`${counter}\t\t${convertMilesToKilo(counter)}`);
    counter++;
}

