import { Scanner } from 'java-scanner';

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
function main(): void {
    let arr: number[][] = [];
    const input: Scanner = new Scanner(System.in);
    // Input angka ke dalam array n x n pada bagian ini
    console.log("Enter a 4 by 4 matrix row by row: ");
    arr = new Array(4).fill(0).map(() => new Array(4).fill(0));
    for (let i = 0; i < 4; i++) {
        for (let j = 0; j < 4; j++) {
            arr[i][j] = input.nextDouble();
        }
    }
    // Menjumlahkan angka yang terdapat di dalam array
    let sum: number = 0;
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i][i];
    }
    // Menampilkan hasil dari pemanggilan fungsi sumMajorDiagonal
    console.log("Sum of the elements in the major diagonal is " + sum);
}

main();

