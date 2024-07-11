/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
function Konversi(n: number): void {
    let miles: number = 1;
    while (miles <= n) {
        console.log(`${miles}\t\t${miles * 1.609}`);
        miles++;
    }
}

console.log("Miles\t\tKilometers");
console.log("-------------------------------");
// Use while loop
Konversi(10);

