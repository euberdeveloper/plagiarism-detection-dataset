package IR;

class Main {
    static printMil(mil: number): void {
        while (mil <= 10) {
            console.log(`${mil}\t\t${mil * 1.609}`);
            mil++;
        }
    }

    static main(args: string[]): void {
        // declare MIL
        let mil: number = 1;
        // Miles to kilometer
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");

        // Use while loop
        Main.printMil(mil);
    }
}

