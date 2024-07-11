import * as readline from 'readline';

function hitungTinggi(feet: number, inches: number): number {
    return feet * 12 + inches;
}

function hitungBmi(weight: number, feet: number, inches: number): number {
    return weight * 0.45359237 / ((hitungTinggi(feet, inches) * 0.0254) * (hitungTinggi(feet, inches) * 0.0254));
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter weight in pounds: ', (weightStr) => {
    const weight = parseFloat(weightStr);
    rl.question('Enter feet: ', (feetStr) => {
        const feet = parseFloat(feetStr);
        rl.question('Enter inches: ', (inchesStr) => {
            const inches = parseFloat(inchesStr);
            const bmi = hitungBmi(weight, feet, inches);
            console.log(`BMI is ${bmi}`);
            if (bmi < 18.5) {
                console.log('Underweight');
            } else if (bmi < 25) {
                console.log('Normal');
            } else if (bmi < 30) {
                console.log('Overweight');
            } else {
                console.log('Obese');
            }
            rl.close();
        });
    });
});
