import * as readline from 'readline';

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
function main(): void {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    console.log("Enter a 4-by-4 matrix row by row:");

    rl.on('line', (input: string) => {
        const m: number[][] = [];
        const rows = input.trim().split('\n');
        for (const row of rows) {
            m.push(row.trim().split(' ').map(Number));
        }

        console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}`);
        rl.close();
    });
}

function sumMajorDiagonal(m: number[][]): number {
    let temp = 0;
    for (let i = 0; i < 4; i++) {
        for (let j = 0; j < 4; j++) {
            if (i === j) {
                temp += m[i][j];
            }
        }
    }
    return temp;
}

main();

