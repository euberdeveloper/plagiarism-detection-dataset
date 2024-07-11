import { Scanner } from 'readline-sync';

const inp: Scanner = new Scanner();

let matrix: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
let i: number = 0;
let sum: number = 0;

console.log("Enter a 4 by 4 matrix row by row: ");

// input the matrix
while (i < 4) {
    let j: number = 0;
    while (j < 4) {
        matrix[i][j] = inp.nextDouble();
        j++;
    }
    i++;
}

i = 0;
while (i < matrix.length) {
    sum += matrix[i][i];
    i++;
}

console.log(`Sum of the elements in the major diagonal is ${sum}`);

