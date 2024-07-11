package IR;

class Main {
    static main(args: string[]): void {
        // Miles to kilometer
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");

        // Use while loop
        let mil: number = 1;

        while (mil <= 10) {
            console.log(`${mil}\t\t${mil * 1.609}`);
            mil++;
        }
    }
}

