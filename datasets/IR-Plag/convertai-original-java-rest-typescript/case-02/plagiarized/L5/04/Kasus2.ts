import * as readline from 'readline';

function hitungArea(r: number): number {
    return r * r * Math.PI;
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter the radius and length of a cylinder: ', (input) => {
    const [r, l] = input.split(' ').map(Number);
    console.log('The area is', hitungArea(r));
    console.log('The volume of the cylinder is', hitungArea(r) * l);
    rl.close();
});

