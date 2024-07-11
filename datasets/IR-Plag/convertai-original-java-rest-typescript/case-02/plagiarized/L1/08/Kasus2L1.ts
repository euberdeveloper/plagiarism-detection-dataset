import { Scanner } from 'readline-sync';

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
class Kasus2L1 {
    
    /**
     * @param args the command line arguments
     */
    static main(args: string[]): void {
        const input = new Scanner();
        // Enter radius of the cylinder
        console.log("Enter the radius and length of a cylinder: ");
        
        const radius: number = input.nextDouble();
        const length: number = input.nextDouble();
        // Calculate Area
        const area: number = radius * radius * 3.14159;
        //Calculate Volume
        const volume: number = area * length;
        // Print area cylinder
        console.log("The area is " + area);
        // Print volume cylinder
        console.log("The volume of the cylinder is " + volume);
    }
    
}

