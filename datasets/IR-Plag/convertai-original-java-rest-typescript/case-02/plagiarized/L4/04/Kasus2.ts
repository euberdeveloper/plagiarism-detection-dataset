import * as readline from 'readline';

function hitungArea(r: number): number {
    return r * r * Math.PI;
}

function hitungVolume(r: number, l: number): number {
    return hitungArea(r) * l;
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter the radius and length of a cylinder: ', (input) => {
    const [r, l] = input.split(' ').map(Number);
    console.log('The area is ' + hitungArea(r));
    console.log('The volume of the cylinder is ' + hitungVolume(r, l));
    rl.close();
});

