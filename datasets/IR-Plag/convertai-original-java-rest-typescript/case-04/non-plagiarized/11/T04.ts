import { DecimalFormat } from 'java.text';

function main(): void {
    const d: DecimalFormat = new DecimalFormat('0.000');

    console.log('Miles\tKilometers');
    for (let i = 1; i <= 10; i++) {
        console.log(`${i}\t${d.format(i * 1.609)}`);
    }
}

main();

