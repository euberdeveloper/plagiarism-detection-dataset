// To change this license header, choose License Headers in Project Properties.
// To change this template file, choose Tools | Templates
// and open the template in the editor.

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
function main(): void {
    // inisialisasi
    let mile: number = 1;
    
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");

    while (mile <= 10) {
        console.log(`${mile}\t\t${mile * 1.609}`);
        mile++;
    }
}

main();

