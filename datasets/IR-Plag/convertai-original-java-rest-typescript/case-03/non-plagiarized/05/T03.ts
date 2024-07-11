import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter weight in pounds: ', (weightStr) => {
  const w = parseInt(weightStr);
  rl.question('Enter feet: ', (feetStr) => {
    const f = parseInt(feetStr);
    rl.question('Enter inches: ', (inchesStr) => {
      const i = parseInt(inchesStr);
      const bmi = ((w * 0.45359237) / (((f * 12 + i) * 0.0254) * ((f * 12 + i) * 0.0254)));
      console.log(`BMI is ${bmi}`);
      if (bmi < 18.5) {
        console.log('Underweight');
      } else if (bmi >= 18.5 && bmi < 25) {
        console.log('Normal');
      } else if (bmi >= 25 && bmi < 35) {
        console.log('Overweight');
      } else if (bmi >= 35) {
        console.log('Obese');
      }
      rl.close();
    });
  });
});

