/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
function main(args: string[]): void {
    const input: string = "Welcome to Java\n";
    keluaran(input);
}

function keluaran(kal: string): void {
    let limit: number = 0; //batas perulangan
    while (limit !== 5) { //perulangan sebanyak 5x
        console.log(kal);
        limit++;
    }
}

main(process.argv.slice(2));

