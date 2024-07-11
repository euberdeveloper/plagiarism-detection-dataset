// IR/*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
function main(): void {
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");

    // ulang sebanyak 10x
    let mil: number = 1;
    while (mil <= 10) {
        console.log(`${mil}\t\t${mil * 1.609}`);
        mil++;
    }
}

main();

