import readline from 'readline';

function hitungTinggi(feet: number, inches: number): number {
    return feet * 12 + inches;
}

function hitungBmi(weight: number, height: number): number {
    return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
}

function cekBmi(bmi: number): void {
    if (bmi < 18.5) {
        console.log("Underweight");
    } else if (bmi < 25) {
        console.log("Normal");
    } else if (bmi < 30) {
        console.log("Overweight");
    } else {
        console.log("Obese");
    }
}

async function main(): Promise<void> {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    const weightPrompt = await new Promise<number>((resolve) => {
        rl.question("Enter weight in pounds: ", (weight) => {
            resolve(parseFloat(weight));
        });
    });

    const feetPrompt = await new Promise<number>((resolve) => {
        rl.question("Enter feet: ", (feet) => {
            resolve(parseFloat(feet));
        });
    });

    const inchesPrompt = await new Promise<number>((resolve) => {
        rl.question("Enter inches: ", (inches) => {
            resolve(parseFloat(inches));
        });
    });

    rl.close();

    const bmi = hitungBmi(weightPrompt, hitungTinggi(feetPrompt, inchesPrompt));
    console.log("BMI is " + bmi);
    cekBmi(bmi);
}

main();

