import * as readline from 'readline';

/**
 * 
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
function hitungArea(r: number): number {
    return r * r * Math.PI;
}

function hitungVolume(area: number, l: number): number {
    return area * l;
}

function main(): void {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question("Enter the radius and length of a cylinder: ", (input) => {
        const [r, l] = input.split(" ").map(Number);
        const area = hitungArea(r);
        const volume = hitungVolume(area, l);
        console.log("The area is " + area);
        console.log("The volume of the cylinder is " + volume);
        rl.close();
    });
}

main();

