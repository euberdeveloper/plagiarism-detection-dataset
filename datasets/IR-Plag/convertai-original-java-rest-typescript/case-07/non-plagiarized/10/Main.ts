import * as readline from 'readline';

function sumMajorDiagonal(m: number[][]): number {
    let hasil: number = 0;
    for (let i: number = 0; i < 4; i++) {
        hasil += m[i][i];
    }
    return hasil;
}

const rl: readline.Interface = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log("Enter a 4-by-4 matrix row by row:");

const m: number[][] = [];
for (let i: number = 0; i < 4; i++) {
    m[i] = [];
    for (let j: number = 0; j < 4; j++) {
        rl.question(`Enter element (${i}, ${j}): `, (input: string) => {
            m[i][j] = parseFloat(input);
            if (i === 3 && j === 3) {
                rl.close();
                console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}`);
            }
        });
    }
}

