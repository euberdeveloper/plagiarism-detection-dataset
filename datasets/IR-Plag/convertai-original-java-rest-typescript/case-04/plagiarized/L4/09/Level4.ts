/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
function tabelKonversi(): void {
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");

    let mil: number = 1;
    while (mil <= 10) {
        console.log(`${mil}\t\t${mil * 1.609}`);
        mil++;
    }
}

tabelKonversi();

