// Import any needed libraries here

// Declare the Main class
class Main {
    // Define the main function
    public static main(args: string[]): void {
        console.log("Miles\t\tKilometers");
        console.log("-------------------------------");
        
        // Repeat the calculation of distance in miles and kilometers
        let miles: number = 1;
        while (miles <= 10) {
            // Print the results here 10 times
            console.log(`${miles}\t\t${miles * 1.609}`);
            miles++;
        }
    }
}

