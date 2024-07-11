import * as readline from 'readline';

function countHeightUser(feet: number, inches: number): number {
    return feet * 12 + inches;
}

function countBmi(height: number, weight: number): number {
    return weight * 0.45359237 / Math.pow((height * 0.0254), 2);
}

function printBmi(bmi: number): void {
    if (bmi < 18.5) {
        console.log("Underweight");
    } else if (bmi > 18.5 && bmi < 25) {
        console.log("Normal");
    } else if (bmi > 25 && bmi < 30) {
        console.log("Overweight");
    } else if (bmi > 30) {
        console.log("Obese");
    }
}

async function main(): Promise<void> {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    let inchesUser: number, weightUser: number, feetUser: number, heightUser: number, bmi: number;

    console.log("Enter inches: ");
    inchesUser = await new Promise<number>((resolve) => {
        rl.question('', (answer) => {
            resolve(parseFloat(answer));
        });
    });

    console.log("Enter weight in pounds: ");
    weightUser = await new Promise<number>((resolve) => {
        rl.question('', (answer) => {
            resolve(parseFloat(answer));
        });
    });

    console.log("Enter feet: ");
    feetUser = await new Promise<number>((resolve) => {
        rl.question('', (answer) => {
            resolve(parseFloat(answer));
        });
    });

    heightUser = countHeightUser(feetUser, inchesUser);
    bmi = countBmi(heightUser, weightUser);

    console.log(`BMI is ${bmi}`);
    printBmi(bmi);

    rl.close();
}

main();

