import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log('Enter weight in pounds: ');
rl.question('', (weightStr: string) => {
  const weights: number = parseFloat(weightStr);

  console.log('Enter feet: ');
  rl.question('', (feetStr: string) => {
    const feets: number = parseFloat(feetStr);

    console.log('Enter inches: ');
    rl.question('', (inchesStr: string) => {
      const inches: number = parseFloat(inchesStr);

      const heights: number = feets * 12 + inches;
      const bmi: number = weights * 0.45359237 / ((heights * 0.0254) * (heights * 0.0254));

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

