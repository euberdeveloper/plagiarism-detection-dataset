/**
 * Converts miles to kilometers.
 * @param mile The number of miles to convert.
 */
function konversi(mile: number): void {
    if (mile !== 11) {
        console.log(`${mile}\t\t${mile * 1.609}`);
        konversi(++mile);
    }
}

function main(): void {
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");
    konversi(1);
}

main();

