import * as readline from 'readline';

let rad: number;
let panjang: number;

function input(): void {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question('Enter the radius and length of a cylinder: ', (input) => {
        const [radiusInput, lengthInput] = input.split(' ');
        rad = parseFloat(radiusInput);
        panjang = parseFloat(lengthInput);
        rl.close();
    });
}

function hitArea(): number {
    return rad * rad * 3.14159;
}

function main(): void {
    input();

    const a = hitArea();
    const vol = a * panjang;

    console.log('The area is ' + a);
    console.log('The volume of the cylinder is ' + vol);
}

main();

