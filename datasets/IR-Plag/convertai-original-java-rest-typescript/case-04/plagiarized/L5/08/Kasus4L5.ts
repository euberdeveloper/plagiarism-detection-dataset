/**
 * Converts miles to kilometers.
 * @param miles The number of miles to convert.
 * @returns The number of kilometers.
 */
function convertMilesToKilo(miles: number): number {
    return miles * 1.609;
}

console.log("Miles\t\tKilometers");
console.log("-------------------------------");

// Use for loop
for (let i = 1; i <= 10; i++) {
    console.log(`${i}\t\t${convertMilesToKilo(i)}`);
}

