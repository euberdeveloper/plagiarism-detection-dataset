import { Scanner } from 'readline-sync';

function jumlahDiagonal(m: number[][]): number {
    let sum = 0;
    for (let i = 0; i < m.length; i++) {
        sum += m[i][i];
    }
    return sum;
}

function main(): void {
    const sc = new Scanner();
    const m: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
    console.log('Enter a 4 by 4 matrix row by row: ');

    for (let i = 0; i < 4; i++) {
        for (let j = 0; j < 4; j++) {
            m[i][j] = sc.nextDouble();
        }
    }
    console.log(`Sum of the elements in the major diagonal is ${jumlahDiagonal(m)}`);
}

main();

