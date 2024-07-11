package IR;

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
class Main {
    private static mile: number;
    public static main(args: string[]): void {
        Main.mile = 1;
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");
        Main.loops();
    }
    
    public static loops(): void {
        //Use while loop
        while (Main.mile <= 10) {
                console.log(`${Main.mile}\t\t${Main.mile * 1.609}`);
                Main.mile++;
        }
    }
}

