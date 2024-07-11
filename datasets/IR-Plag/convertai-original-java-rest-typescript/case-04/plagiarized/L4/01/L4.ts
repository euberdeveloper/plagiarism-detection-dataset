package IR;

class L4 {
    static print(mil: number): void {
        while (mil <= 10) {
            console.log(`${mil}\t\t${mil * 1.609}`);
            mil++;
        }
    }

    static main(args: string[]): void {
        let mil: number = 1;
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");
        this.print(mil);
    }
}

