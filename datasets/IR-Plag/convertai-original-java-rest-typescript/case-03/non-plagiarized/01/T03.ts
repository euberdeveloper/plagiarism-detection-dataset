import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function main() {
  rl.question('Enter weight in pounds: ', (weightStr) => {
    const weight = parseInt(weightStr);
    rl.question('Enter feet: ', (feetStr) => {
      const feet = parseInt(feetStr);
      rl.question('Enter inches: ', (inchesStr) => {
        const inches = parseInt(inchesStr);
        const height = feet * 12 + inches;
        const bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
        console.log(`BMI is ${bmi}`);
        if (bmi < 18.5) {
          console.log('Underweight');
        } else if (bmi >= 18.5 && bmi < 25) {
          console.log('Normal');
        } else if (bmi >= 35) {
          console.log('Obese');
        }
        rl.close();
      });
    });
  });
}

main();

