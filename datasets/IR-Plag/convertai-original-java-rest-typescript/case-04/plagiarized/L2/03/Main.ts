package IR;

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
class Main {
    static main(args: string[]): void {
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");
        
        // Use while loop
        let mile: number = 1;
        while (mile <= 10) {
            console.log(`${mile}\t\t${mile * 1.609}`);
            mile++;
        }
    }
}

