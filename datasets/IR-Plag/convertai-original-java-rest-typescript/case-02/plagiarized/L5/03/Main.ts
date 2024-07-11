import * as readline from 'readline';

let radius: number, length: number, areas: number, volumes: number;

function main() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question("Enter the radius and length of a cylinder: ", (answer) => {
        const input = answer.split(" ");
        radius = parseFloat(input[0]);
        length = parseFloat(input[1]);
        areas = radius * radius * 3.14159;
        volumes = areas * length;
        cetak();
        rl.close();
    });
}

function cetak() {
    console.log("The area is " + areas);
    console.log("The volume of the cylinder is " + volumes);
}

main();

