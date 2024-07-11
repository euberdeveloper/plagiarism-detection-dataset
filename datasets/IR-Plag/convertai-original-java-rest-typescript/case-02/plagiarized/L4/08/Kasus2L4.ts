import { Scanner } from 'readline-sync';

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
function main(args: string[]): void {
    // Enter radius of the cylinder
    console.log("Enter the radius and length of a cylinder: ");
    const in: Scanner = new Scanner();
    const radius: number = in.nextFloat();
    const length: number = in.nextFloat();
    // Hitung Area
    const luas: number = hitungLuas(radius);
    // Print area cylinder
    console.log("The area is " + luas);
    //Hitung Volume
    const volume: number = hitungVolume(luas, length);
    // Print volume cylinder
    console.log("The volume of the cylinder is " + volume);
}

function hitungLuas(radius: number): number {
    return radius * radius * 3.14159;
}

function hitungVolume(luas: number, length: number): number {
    return luas * length;
}

main(process.argv.slice(2));

