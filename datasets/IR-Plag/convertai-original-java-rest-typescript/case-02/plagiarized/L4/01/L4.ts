import * as readline from 'readline';

function hitLuas(jari2: number): number {
    return jari2 * jari2 * 3.14159;
}

function total(luas: number, panjang: number): number {
    return luas * panjang;
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter the radius and length of a cylinder: ", (answer) => {
    const [jari2, panjang] = answer.split(' ').map(Number);
    const luas = hitLuas(jari2);
    const totalVolume = total(luas, panjang);

    console.log(`The area is ${luas}, The volume of the cylinder is ${totalVolume}`);
    rl.close();
});

