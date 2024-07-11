import * as readline from 'readline';

/**
 *
 * @author 2645BB47F923271FA1FC06C04E9691EA
 */
function sumMajorDiagonal(m: number[][]): number {
    let hasil = 0;
    for (let i = 0; i < 4; i++) {
        for (let j = 0; j < 4; j++) {
            if (i === j) {
                hasil += m[i][j];
            }
        }
    }
    return hasil;
}

async function main() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    const m: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
    for (let i = 0; i < 4; i++) {
        for (let j = 0; j < 4; j++) {
            m[i][j] = parseFloat(await new Promise<string>((resolve) => rl.question(`Enter element at (${i}, ${j}): `, resolve)));
        }
    }
    rl.close();

    console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}`);
}

main();

