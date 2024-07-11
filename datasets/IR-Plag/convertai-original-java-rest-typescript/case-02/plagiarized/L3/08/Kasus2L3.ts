import { Scanner } from 'readline-sync';

/**
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
class Kasus2L3 {
    /**
     * @param args the command line arguments
     */
    public static main(args: string[]): void {
        // Enter radius of the cylinder
        console.log('Enter the radius and length of a cylinder: ');
        const in: Scanner = new Scanner();
        const radius: number = in.nextDouble();
        const length: number = in.nextDouble();
        // Calculate Area
        const luas: number = radius * radius * 3.14159;
        // Print area cylinder
        console.log('The area is ' + luas);
        // Calculate Volume
        const volume: number = luas * length;
        // Print volume cylinder
        console.log('The volume of the cylinder is ' + volume);
    }
}

