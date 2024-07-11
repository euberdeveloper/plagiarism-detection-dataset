import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function main() {
  rl.question('Enter inches: ', (inchesUser: string) => {
    rl.question('Enter weight in pounds: ', (weightUser: string) => {
      rl.question('Enter feet: ', (feetUser: string) => {
        const heightUser = parseFloat(feetUser) * 12 + parseFloat(inchesUser);
        const bmi = parseFloat(weightUser) * 0.45359237 / ((heightUser * 0.0254) * (heightUser * 0.0254));
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

