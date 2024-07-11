import { DecimalFormat } from 'java.text';

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
function main(): void {
    const arr: number[][] = new Array(11).fill(0).map(() => new Array(2));
    const df: DecimalFormat = new DecimalFormat('#.###');
    for (let i = 0; i < 11; i++) {
        if (i === 0) {
            console.log('Miles \t Kilometers');
        } else {
            console.log(`${i}\t${df.format(i * 1.609)}`);
        }
    }
}

main();

