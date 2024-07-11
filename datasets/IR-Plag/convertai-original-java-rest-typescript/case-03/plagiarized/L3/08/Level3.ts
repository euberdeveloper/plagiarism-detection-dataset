import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let berat: number;
let feet: number;
let inches: number;
let tinggi: number;
let bmi: number;

rl.question('Enter weight in pounds: ', (weightInput) => {
  berat = parseFloat(weightInput);
  rl.question('Enter feet: ', (feetInput) => {
    feet = parseFloat(feetInput);
    rl.question('Enter inches: ', (inchesInput) => {
      inches = parseFloat(inchesInput);
      tinggi = feet * 12 + inches;
      bmi = berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254));
      console.log('BMI is ' + bmi.toFixed(2));
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

