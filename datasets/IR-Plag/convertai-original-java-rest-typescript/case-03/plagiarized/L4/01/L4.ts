import * as readline from 'readline';

function hitBmi(berat: number, tinggi: number): number {
    return berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254));
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter weight in pounds: ', (weightStr) => {
    const berat = parseFloat(weightStr);

    rl.question('Enter feet: ', (feetStr) => {
        const feet = parseFloat(feetStr);

        rl.question('Enter inches: ', (inchesStr) => {
            const inci = parseFloat(inchesStr);
            const tinggi = feet * 12 + inci;

            const bmi = hitBmi(berat, tinggi);
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

