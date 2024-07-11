import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter weight in pounds: ', (weightInPounds) => {
  const bobot = parseFloat(weightInPounds);

  rl.question('Enter feet: ', (feetStr) => {
    const kaki = parseFloat(feetStr);

    rl.question('Enter inches: ', (inchesStr) => {
      const inc = parseFloat(inchesStr);
      const height = kaki * 12 + inc;
      const bmi = bobot * 0.45359237 / ((height * 0.0254) * (height * 0.0254));

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

