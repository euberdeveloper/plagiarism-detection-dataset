import { Scanner } from 'readline-sync';

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
function main(): void {
    const s = new Scanner();
    console.log('Enter a integer: ');
    const a: number = s.nextInt();
    reverse(a);
}

function reverse(number: number): void {
    const temp: string = number.toString();
    for (let i = temp.length; i > 0; i--) {
        console.log(temp.charAt(i - 1));
    }
}

main();

