import { NumberFormat, DecimalFormat } from 'typescript-decimal-format';

function main(): void {
    const formatter: NumberFormat = new DecimalFormat('#0');
    console.log('Miles\tKilometers');
    console.log('1\t' + (1 * 1.609));
    console.log('2\t' + (2 * 1.609));
    console.log('3\t' + (3 * 1.609));
    console.log('4\t' + (4 * 1.609));
    console.log('5\t' + (5 * 1.609));
    console.log('6\t' + (6 * 1.609));
    console.log('7\t' + (7 * 1.609));
    console.log('8\t' + (8 * 1.609));
    console.log('9\t' + (9 * 1.609));
    console.log('10\t' + (10 * 1.609) + formatter.format(0.0));
}

main();

