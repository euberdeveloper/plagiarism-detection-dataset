package IR;

class L5 {
    static print(mil: number): void {
        for (let i = 0; i < 10; i++) {
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

