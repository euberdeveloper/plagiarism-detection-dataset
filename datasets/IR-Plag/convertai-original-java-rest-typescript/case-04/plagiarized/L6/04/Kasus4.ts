/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
function konversi(miles: number): number {
    if (miles <= 10) {
        console.log(`${miles}\t\t${miles * 1.609}`);
        return konversi(++miles);
    }
    return 0;
}

function main(): void {
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");
    // Use while loop
    konversi(1);
}

main();

