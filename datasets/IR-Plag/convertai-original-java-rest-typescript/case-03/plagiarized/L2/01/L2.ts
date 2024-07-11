import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter weight in pounds: ', (berat) => {
  rl.question('Enter feet: ', (feet) => {
    rl.question('Enter inches: ', (inci) => {
      const tinggi = parseFloat(feet) * 12 + parseFloat(inci);
      const bmi = parseFloat(berat) * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254));

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

