import * as readline from 'readline';

function balik(nomor: number): void {
    let sisa: number = 0;
    while (nomor !== 0) {
        sisa = nomor % 10;
        console.log(sisa);
        nomor = Math.floor(nomor / 10);
    }
    console.log();
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter an integer: ', (input) => {
    const nomor: number = parseInt(input);
    balik(nomor);
    rl.close();
});

