import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter weight in pounds: ', (weightUserInput) => {
  const weightUser = parseFloat(weightUserInput);

  rl.question('Enter feet: ', (feetUserInput) => {
    const feetUser = parseFloat(feetUserInput);

    rl.question('Enter inches: ', (inchesUserInput) => {
      const inchesUser = parseFloat(inchesUserInput);

      const heightUser = feetUser * 12 + inchesUser;
      const bmi = weightUser * 0.45359237 / ((heightUser * 0.0254) * (heightUser * 0.0254));

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

