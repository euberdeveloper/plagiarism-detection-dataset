import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function main() {
  // Prompt the user to enter weight in pounds
  rl.question('Enter weight in pounds: ', (weightStr) => {
    const weight = parseFloat(weightStr);

    // Prompt the user to enter height
    rl.question('Enter feet: ', (feetStr) => {
      const feet = parseFloat(feetStr);
      rl.question('Enter inches: ', (inchesStr) => {
        const inches = parseFloat(inchesStr);

        const height = feet * 12 + inches;

        // Compute BMI
        const bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));

        // Display result
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
}

main();

