import * as readline from 'readline';

function area(r: number): number {
    let area: number;
    area = r * r * 3.14159;
    return area;
}

function volume(len: number, a: number): number {
    let volume: number;
    volume = len * a;
    return volume;
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter the radius and length of a cylinder: ', (input) => {
    const [r, len] = input.split(' ').map(Number);
    const a = area(r);

    console.log('The area is ' + area(r));
    console.log('The volume of the cylinder is ' + volume(len, a));

    rl.close();
});

