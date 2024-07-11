import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function main() {
  rl.question('Enter weight in pounds: ', (weightStr) => {
    const weight = parseFloat(weightStr);
    rl.question('Enter feet: ', (feetStr) => {
      const feet = parseFloat(feetStr);
      rl.question('Enter Inches: ', (inchesStr) => {
        const inches = parseFloat(inchesStr);
        const height = feet * 12 + inches;
        const bmi = weight * 0.45359237 / Math.pow((height * 0.0254), 2);
        console.log(`BMI is ${bmi}`);
        if (bmi < 18.5) {
          console.log('underweight');
        } else if (bmi < 25) {
          console.log('normal');
        } else if (bmi < 35) {
          console.log('overweight');
        } else {
          console.log('obese');
        }
        rl.close();
      });
    });
  });
}

main();

