import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function countHeightUser(feet: number, inches: number): number {
  return feet * 12 + inches;
}

function countBmi(height: number, weight: number): number {
  return (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254));
}

function printBmi(bmi: number): void {
  if (bmi < 18.5) {
    console.log('Underweight');
  } else if (bmi < 25) {
    console.log('Normal');
  } else if (bmi < 30) {
    console.log('Overweight');
  } else {
    console.log('Obese');
  }
}

rl.question('Enter inches: ', (inchesUser) => {
  rl.question('Enter weight in pounds: ', (weightUser) => {
    rl.question('Enter feet: ', (feetUser) => {
      const heightUser = countHeightUser(parseFloat(feetUser), parseFloat(inchesUser));
      const bmi = countBmi(heightUser, parseFloat(weightUser));
      console.log('BMI is ' + bmi);
      printBmi(bmi);
      rl.close();
    });
  });
});

