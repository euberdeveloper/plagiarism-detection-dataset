import { Scanner } from 'readline-sync';

const in: Scanner = new Scanner();

let matriks: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
let sum: number = 0;

console.log("Enter a 4 by 4 matrix row by row: ");
for (let b: number = 0; b < 4; b++) {
    for (let k: number = 0; k < 4; k++) {
        matriks[b][k] = in.nextDouble();
    }
}

for (let x: number = 0; x < matriks.length; x++) {
    sum += matriks[x][x];
}

console.log(`Sum of the elements in the major diagonal is ${sum}`);

