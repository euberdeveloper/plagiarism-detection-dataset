import { Scanner } from 'readline-sync';

function diagonal(x: number[][]): number {
    let jumlah = 0;
    for (let i = 0; i < x.length; i++) {
        jumlah += x[i][i];
    }
    return jumlah;
}

function main(): void {
    const scan = new Scanner();
    const matriks: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));

    console.log('Enter a 4 by 4 matrix row by row: ');
    for (let bar = 0; bar < 4; bar++) {
        for (let kol = 0; kol < 4; kol++) {
            matriks[bar][kol] = scan.nextDouble();
        }
    }
    console.log(`Sum of the elements in the major diagonal is ${diagonal(matriks)}`);
}

main();

