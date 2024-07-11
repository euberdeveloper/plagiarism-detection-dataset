package IR;

class L2 {
    public static main(args: string[]): void {
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");

        let mil: number = 1;
        while (mil <= 10) {
            console.log(`${mil}\t\t${mil * 1.609}`);
            mil++;
        }
    }
}

