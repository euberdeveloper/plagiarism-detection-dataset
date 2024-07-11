/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
function main(): void {
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");

    convert();
}

// Use for loop
function convert(): void {
    for (let mill = 1; mill <= 10; mill++) {
        console.log(`${mill}\t\t${mill * 1.609}`);
    }
}

main();

