/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
function Konversi(): void {
    for (let miles = 1; miles <= 10; miles++) {
        console.log(`${miles}\t\t${miles * 1.609}`);
    }
}

console.log("Miles\t\tKilometers");
console.log("-------------------------------");
// Use while loop
Konversi();

