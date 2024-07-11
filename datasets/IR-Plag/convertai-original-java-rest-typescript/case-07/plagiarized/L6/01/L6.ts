import { Scanner } from 'readline-sync';

function jumlahDiagonal(m: number[][]): number {
    let sum = 0;
    let hit = m.length - 1;

    while (hit >= 0) {
        sum += m[hit][hit];
        hit--;
    }
    return sum;
}

function print(m: number[][]): void {
    console.log(`Sum of the elements in the major diagonal is ${jumlahDiagonal(m)}`);
}

function main(): void {
    const sc = new Scanner();
    const m: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
    console.log('Enter a 4 by 4 matrix row by row: ');

    for (let i = 3; i >= 0; i--) {
        for (let j = 3; j >= 0; j--) {
            m[i][j] = sc.nextDouble();
        }
    }
    print(m);
}

main();

