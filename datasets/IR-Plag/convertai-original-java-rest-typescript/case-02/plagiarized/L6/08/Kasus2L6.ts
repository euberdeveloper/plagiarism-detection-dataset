import { Scanner } from 'java-scanner';

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
class Kasus2L6 {
    
    /**
     * @param args the command line arguments
     */
    static main(args: string[]): void {
        // Enter radius of the cylinder
        console.log("Enter the radius and length of a cylinder: ");
        const in = new Scanner(System.in);
        //input radius
        const input: number = in.nextFloat();
        //Hitung Area
        const luas: number = this.hitungLuas(input);
        //input Length
        const length: number = in.nextFloat();
        // Print area cylinder
        console.log("The area is " + luas);
        // Print volume cylinder
        console.log("The volume of the cylinder is " + this.hitungVolume(luas, length));
    }
    
    private static hitungLuas(radius: number): number {
        return radius * radius * 3.14159;
    }
    
    private static hitungVolume(luas: number, length: number): number {
        return luas * length;
    }
}

