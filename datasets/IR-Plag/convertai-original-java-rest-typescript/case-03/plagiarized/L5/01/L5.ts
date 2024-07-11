import readline from 'readline';

function hitBmi(berat: number, tinggi: number): number {
    return berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254));
}

async function main() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    const berat = await new Promise<number>((resolve) => {
        rl.question('Enter weight in pounds: ', (answer) => {
            resolve(parseFloat(answer));
        });
    });

    const feet = await new Promise<number>((resolve) => {
        rl.question('Enter feet: ', (answer) => {
            resolve(parseFloat(answer));
        });
    });

    const inci = await new Promise<number>((resolve) => {
        rl.question('Enter inches: ', (answer) => {
            resolve(parseFloat(answer));
        });
    });

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
}

main();

