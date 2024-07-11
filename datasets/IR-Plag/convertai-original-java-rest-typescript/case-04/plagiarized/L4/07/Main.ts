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
    let jarak: number;
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");
    // Di sini mengulang perhitungan jarak dalam mil dan kilometer
    jarak = 1;
    printJarakDalamMilDanKilo(jarak);
}

function printJarakDalamMilDanKilo(jarak: number): void {
    while (jarak <= 10) {
        // Print hasil di sini sebanyak 10 kali
        console.log(`${jarak}\t\t${jarak * 1.609}`);
        jarak++;
    }
}

main();

