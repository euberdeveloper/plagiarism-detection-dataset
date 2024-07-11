import { Scanner } from 'readline-sync';

/**
 * 
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D Afiany 2451041557A22145B3701B0184109CAB035
 */
function main(): void {
    const sc: Scanner = new Scanner();

    const m: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
    console.log("Enter a 4-by-4 matrix row by row: ");
    for (let i = 0; i < m.length; i++) {
        for (let j = 0; j < m.length; j++) {
            m[i][j] = sc.nextDouble();
        }
    }
    console.log("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
}

function sumMajorDiagonal(m: number[][]): number {
    let tambah: number = m[0][0] + m[1][1] + m[2][2] + m[3][3];
    return tambah;
}

main();

