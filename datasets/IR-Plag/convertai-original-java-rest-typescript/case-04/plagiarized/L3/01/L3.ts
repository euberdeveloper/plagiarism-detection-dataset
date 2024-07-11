package IR;

class L3 {
    public static main(args: string[]): void {
        let mil: number = 0;
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");
        mil = 1;
        while (mil <= 10) {
            console.log(`${mil}\t\t${mil * 1.609}`);
            mil++;
        }
    }
}

