package IR;

class Main {
    static printMil(): void {
        for (let i = 1; i <= 10; i++) {
            console.log(`${i}\t\t${i * 1.609}`);
        }
    }

    static main(args: string[]): void {
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");
        Main.printMil();
    }
}

