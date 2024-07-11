/**
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
function showTable(jumlahData: number): void {
    console.log("Miles\t\tKilometers");
    console.log("-------------------------------");
    for (let i = jumlahData; i >= 1; i--) {
        const temp = jumlahData + 1 - i;
        console.log(`${temp}\t\t${convertMilesToKilo(temp)}`);
    }
}

function convertMilesToKilo(miles: number): number {
    return miles * 1.609;
}

function main(): void {
    showTable(10);
}

main();

