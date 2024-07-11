/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
function main(args: string[]): void {
    //Print Welcome to java 5 kali
    cetakTeks("Welcome to Java");
}

function cetakTeks(teks: string): void {
    let i: number = 5;
    while (i > 0) {
        console.log(teks);
        i--;
    }
}

main(process.argv.slice(2));

