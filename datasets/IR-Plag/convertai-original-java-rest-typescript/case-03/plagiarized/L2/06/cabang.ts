import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function calculateBMI(): void {
  rl.question('Enter weight in pounds: ', (weightStr) => {
    const weight = parseFloat(weightStr);
    rl.question('Enter feet: ', (feetStr) => {
      const feet = parseFloat(feetStr);
      rl.question('Enter inches: ', (inchesStr) => {
        const inches = parseFloat(inchesStr);
        const height = feet * 12 + inches;
        const totalBMI = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
        console.log(`BMI is ${totalBMI}`);
        if (totalBMI < 18.5) {
          console.log('Underweight');
        } else if (totalBMI < 25) {
          console.log('Normal');
        } else if (totalBMI < 30) {
          console.log('Overweight');
        } else {
          console.log('Obese');
        }
        rl.close();
      });
    });
  });
}

calculateBMI();

