package IR;

class L6 {
    static print(mil: number): void {
        for (let i = 10; i > 0; i--) {
            console.log(`${mil}\t\t${mil * 1.609}`);
            mil++;
        }
    }

    static main(args: string[]): void {
        let mil = 1;
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");
        this.print(mil);
    }
}

