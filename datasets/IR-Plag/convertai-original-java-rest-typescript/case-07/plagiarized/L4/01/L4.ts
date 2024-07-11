import * as readline from 'readline';

class L4 {
    static jumlahDiagonal(m: number[][]): number {
        let sum = 0;
        for (let i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    static print(m: number[][]): void {
        console.log(`Sum of the elements in the major diagonal is ${this.jumlahDiagonal(m)}`);
    }

    static main(): void {
        const rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });

        const m: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));

        console.log("Enter a 4 by 4 matrix row by row: ");

        rl.on('line', (input) => {
            for (let i = 0; i < 4; i++) {
                for (let j = 0; j < 4; j++) {
                    m[i][j] = parseFloat(input.split(' ')[j]);
                }
            }
            this.print(m);
            rl.close();
        });
    }
}

L4.main();

