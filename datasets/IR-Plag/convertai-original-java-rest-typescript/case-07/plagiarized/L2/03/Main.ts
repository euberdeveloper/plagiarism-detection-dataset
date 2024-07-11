import * as readline from 'readline';

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
function main(): void {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    console.log("Enter a 4 by 4 matrix row by row: ");
    rl.question('', (input: string) => {
        const n: number[][] = [];
        const rows = input.trim().split('\n');
        for (const row of rows) {
            n.push(row.trim().split(' ').map(Number));
        }

        console.log(`Sum of the elements in the major diagonal is ${hasilPertambahanDiagonal(n)}`);
        rl.close();
    });
}

function hasilPertambahanDiagonal(m: number[][]): number {
    let sum = 0;
    for (let i = 0; i < m.length; i++) {
        sum += m[i][i];
    }
    return sum;
}

main();

