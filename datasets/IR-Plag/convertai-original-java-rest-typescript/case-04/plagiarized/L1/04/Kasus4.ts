// Import any needed libraries here

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
class Kasus4 {
    public static main(args: string[]): void {
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");

        // Use while loop
        let miles: number = 1;
        while (miles <= 10) {
            console.log(`${miles}\t\t${miles * 1.609}`);
            miles++;
        }
    }
}

