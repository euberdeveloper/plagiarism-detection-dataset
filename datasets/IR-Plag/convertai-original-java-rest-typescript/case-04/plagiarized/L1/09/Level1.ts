// To change this license header, choose License Headers in Project Properties.
// To change this template file, choose Tools | Templates
// and open the template in the editor.

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
function main(): void {
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");

    let miles: number = 1;
    while (miles <= 10) {
        console.log(`${miles}\t\t${miles * 1.609}`);
        miles++;
    }
}

main();

