import { Scanner } from 'readline-sync';
import { DecimalFormat } from 'decimal-format';

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
function main(): void {
    const sc = new Scanner();
    const dfArea = new DecimalFormat('#.####');
    const dfVolume = new DecimalFormat('#.#');

    console.log('Enter the radius and length of a cylinder: ');
    const radius = sc.nextDouble();
    const panjang = sc.nextDouble();
    console.log('The area is ' + dfArea.format(radius * radius * 3.14159));
    console.log('The volume is ' + dfVolume.format((radius * radius * 3.14159) * panjang));
}

main();

