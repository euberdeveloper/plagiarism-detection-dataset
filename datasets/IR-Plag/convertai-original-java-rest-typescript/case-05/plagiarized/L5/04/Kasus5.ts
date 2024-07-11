import { Scanner } from 'readline-sync';

function reverse(number: number): number {
    return number % 10;
}

function main(): void {
    console.log('Enter an integer: ');
    const input: Scanner = new Scanner();
    const number: number = input.nextInt();

    while (number > 0) {
        console.log(reverse(number));
        number /= 10;
    }
    console.log('');
}

main();

