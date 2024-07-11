import * as readline from 'readline';

function simpanArray(arr: number[], n: number): void {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    for (let i = 0; i < n; i++) {
        rl.question("Read a number: ", (input) => {
            arr[i] = parseInt(input);
            if (i === n - 1) {
                rl.close();
            }
        });
    }
}

function tampilArray(arr: number[], i: number): void {
    console.log(arr[i]);
}

function main(): void {
    const n = 10;
    const arr: number[] = new Array(n);
    simpanArray(arr, n);
    for (let i = n - 1; i >= 0; i--) {
        tampilArray(arr, i);
    }
}

main();

