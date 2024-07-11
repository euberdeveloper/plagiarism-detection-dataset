/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
function main(): void {
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");
    // Here we repeat the distance calculation in miles and kilometers
    let jarak: number = 1;
    while (jarak <= 10) {
        // Print the results here 10 times
        console.log(`${jarak}\t\t${jarak * 1.609}`);
        jarak++;
    }
}

main();

