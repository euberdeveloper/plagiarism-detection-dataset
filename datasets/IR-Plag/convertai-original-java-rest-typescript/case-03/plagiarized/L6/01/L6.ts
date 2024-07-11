import * as readline from 'readline';

function hitBmi(berat: number, tinggi: number): number {
    return berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254));
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter weight in pounds: ', (weightInput) => {
    const berat = parseFloat(weightInput);

    rl.question('Enter feet: ', (feetInput) => {
        const feet = parseFloat(feetInput);
        rl.question('Enter inches: ', (inchesInput) => {
            const inci = parseFloat(inchesInput);
            const tinggi = feet * 12 + inci;

            const bmi = hitBmi(berat, tinggi);
            console.log(`BMI is ${bmi}`);

            if (bmi < 25 && bmi > 18.5) {
                console.log('Normal');
            } else if (bmi < 30 && bmi > 25) {
                console.log('Overweight');
            } else if (bmi > 30) {
                console.log('Obese');
            } else {
                console.log('Underweight');
            }

            rl.close();
        });
    });
});

