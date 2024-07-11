import { Console } from 'console';

const console = new Console(process.stdout, process.stderr);

console.log("Miles\t\tKilometers");
console.log("-------------------------------");

let miles = 1;

while (miles <= 10) {
    console.log(`${miles}\t\t${miles * 1.609}`);
    miles++;
}

