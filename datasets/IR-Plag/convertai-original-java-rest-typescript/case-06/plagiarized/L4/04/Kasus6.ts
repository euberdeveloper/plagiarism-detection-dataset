import * as readline from 'readline';

function simpanArray(arr: number[], n: number): void {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    for (let i = 0; i < n; i++) {
        rl.question("Read a number: ", (input) => {
            arr[i] = parseInt(input);
        });
    }

    rl.close();
}

function tampilArray(arr: number[], n: number): void {
    for (let i = n - 1; i >= 0; i--) {
        console.log(arr[i]);
    }
}

function main(): void {
    const n = 10;
    const arr: number[] = new Array(n);
    simpanArray(arr, n);
    tampilArray(arr, n);
}

main();

