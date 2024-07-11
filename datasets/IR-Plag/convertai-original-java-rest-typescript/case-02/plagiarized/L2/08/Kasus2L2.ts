import { Scanner } from 'readline-sync';

/**
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
function main(args: string[]): void {
    const in: Scanner = new Scanner();
    // Enter radius of the cylinder
    console.log("Enter the radius and length of a cylinder: ");
    
    const radius: number = in.nextFloat();
    const length: number = in.nextFloat();
    // Calculate Area
    const luas: number = radius * radius * 3.14159;
    // Calculate Volume
    const volume: number = luas * length;
    // Print area cylinder
    console.log("The area is " + luas);
    // Print volume cylinder
    console.log("The volume of the cylinder is " + volume);
}

main(process.argv.slice(2));

