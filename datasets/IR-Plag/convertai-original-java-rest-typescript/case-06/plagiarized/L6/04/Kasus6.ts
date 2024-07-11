import { Scanner } from 'readline-sync';

function simpanArray(arr: number[], i: number): void {
    const sc = new Scanner();

    if (i > 0) {
        simpanArray(arr, --i);
        console.log('Read a number: ');
        arr[i] = sc.nextInt();
    }
}

function tampilArray(arr: number[], i: number): void {
    if (i >= 0) {
        console.log(arr[i]);
        tampilArray(arr, --i);
    }
}

function main(): void {
    const n = 10;
    const arr: number[] = new Array(n);
    simpanArray(arr, n);
    tampilArray(arr, n - 1);
}

main();

