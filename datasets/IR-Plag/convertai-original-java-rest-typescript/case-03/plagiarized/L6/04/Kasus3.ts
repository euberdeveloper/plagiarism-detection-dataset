import readline from 'readline';

function hitungTinggi(feet: number, inches: number): number {
    return feet * 12 + inches;
}

function hitungBmi(weight: number, feet: number, inches: number): number {
    return weight * 0.45359237 / ((hitungTinggi(feet, inches) * 0.0254) * (hitungTinggi(feet, inches) * 0.0254));
}

function cekBmi(bmi: number): string {
    if (bmi < 18.5) {
        return "Underweight";
    } else if (bmi < 25) {
        return "Normal";
    } else if (bmi < 30) {
        return "Overweight";
    } else {
        return "Obese";
    }
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter weight in pounds: ", (weightStr) => {
    const weight = parseFloat(weightStr);
    rl.question("Enter feet: ", (feetStr) => {
        const feet = parseFloat(feetStr);
        rl.question("Enter inches: ", (inchesStr) => {
            const inches = parseFloat(inchesStr);
            const bmi = hitungBmi(weight, feet, inches);
            console.log("BMI is " + bmi);
            console.log(cekBmi(bmi));
            rl.close();
        });
    });
});

