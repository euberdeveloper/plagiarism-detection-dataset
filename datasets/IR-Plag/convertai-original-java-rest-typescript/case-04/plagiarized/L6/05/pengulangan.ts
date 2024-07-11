package IR;

import java.util.*;

class inputoutput {
    static hitHasil(a: number): void {
        for (; a <= 10; a++) {
            console.log(`${a}\t\t${a * 1.609}`);
        }
    }

    public static main(args: string[]): void {
        // print seusatu
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");
        // pake pengulangan while
        inputoutput.hitHasil(1);
    }
}

