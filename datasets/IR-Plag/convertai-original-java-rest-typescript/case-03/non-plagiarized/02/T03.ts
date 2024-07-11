import * as readline from 'readline';

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter weight in pounds: ', (weightStr) => {
  const w = parseFloat(weightStr);
  rl.question('Enter feet: ', (feetStr) => {
    const f = parseFloat(feetStr);
    rl.question('Enter inches: ', (inchesStr) => {
      const i = parseFloat(inchesStr);
      const h = f * 12 + i;
      const bmi = (w * 0.45359237) / ((h * 0.0254) * (h * 0.0254));
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

