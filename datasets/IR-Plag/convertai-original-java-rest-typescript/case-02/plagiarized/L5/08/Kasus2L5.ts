import { Scanner } from 'readline-sync';

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
function main(): void {
    // Enter radius of the cylinder
    console.log("Enter the radius and length of a cylinder: ");
    const in: Scanner = new Scanner();
    //input radius
    const radius: number = in.nextFloat();
    // Hitung Area
    const area: number = calculateArea(radius);
    //input Length
    const length: number = in.nextFloat();
    // Print area cylinder
    console.log("The area is " + area);
    //Hitung Volume
    const volume: number = calculateVolume(area, length);
    // Print volume cylinder
    console.log("The volume of the cylinder is " + volume);
}

function calculateArea(radius: number): number {
    return radius * radius * 3.14159;
}

function calculateVolume(area: number, length: number): number {
    return area * length;
}

main();

