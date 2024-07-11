import { DecimalFormat } from 'java.text';
import { Scanner } from 'java.util';

function main(args: string[]): void {
    const s: Scanner = new Scanner(System.in);
    console.log("Enter the radius and length of a cylinder :");
    const radius: number = s.nextDouble();
    const length: number = s.nextDouble();
    const area: number = radius * radius * 3.14159;

    const df: DecimalFormat = new DecimalFormat(".####");
    const df2: DecimalFormat = new DecimalFormat(".#");
    const volume: number = area * length;
    console.log("The area is " + df.format(area));
    console.log("The volume is " + df2.format(volume));
}

