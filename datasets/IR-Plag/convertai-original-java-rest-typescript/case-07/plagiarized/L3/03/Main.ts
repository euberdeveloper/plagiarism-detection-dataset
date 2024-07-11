import * as readline from 'readline';

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
function hasilPertambahanDiagonal(m: number[][]): number {
    let sum = 0;
    
    for (let i = 0; i < m.length; i++)
        sum += m[i][i];
    
    return sum;
}

function main(): void {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    console.log("Enter a 4 by 4 matrix row by row: ");
    const n: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));

    let rowIndex = 0;
    rl.on('line', (line) => {
        const values = line.split(' ').map(parseFloat);
        n[rowIndex] = values;
        rowIndex++;
        if (rowIndex === 4) {
            rl.close();
            console.log(`Sum of the elements in the major diagonal is ${hasilPertambahanDiagonal(n)}`);
        }
    });
}

main();

