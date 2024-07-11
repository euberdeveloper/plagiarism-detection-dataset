import { Scanner } from 'readline-sync';
import { DecimalFormat } from 'decimal-format';

function main(): void {
    const sc = new Scanner();
    let radius: number, length: number, area: number, volume: number;

    console.log('Enter the radius and length of a cylinder: ');
    radius = sc.nextDouble();
    length = sc.nextDouble();

    area = radius * radius * 3.14159;
    volume = area * length;

    const a = new DecimalFormat('0.0000');
    const v = new DecimalFormat('0.0');

    console.log(`The area is ${a.format(area)}`);
    console.log(`The volume is ${v.format(volume)}`);
}

main();

