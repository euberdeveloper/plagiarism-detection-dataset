/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
function Konversi(miles: number): void {
    console.log(`${miles}\t\t${miles * 1.609}`);
}

function main(): void {
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");
    // Use for loop
    for (let miles = 1; miles <= 10; miles++) {
        Konversi(miles);
    }
}

main();

