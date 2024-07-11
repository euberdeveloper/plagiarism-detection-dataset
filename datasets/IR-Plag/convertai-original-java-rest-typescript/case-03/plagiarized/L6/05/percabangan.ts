import readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let kaki: number, bobot: number, bmi: number, inc: number, height: number;

function hitHeight(kaki: number, inc: number): number {
  return kaki * 12 + inc;
}

function hitBmi(bobot: number, height: number): number {
  return bobot * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
}

rl.question('Enter weight in pounds: ', (weightInput) => {
  bobot = parseFloat(weightInput);
  rl.question('Enter feet: ', (feetInput) => {
    kaki = parseFloat(feetInput);
    rl.question('Enter inches: ', (inchesInput) => {
      inc = parseFloat(inchesInput);
      height = hitHeight(kaki, inc);
      bmi = hitBmi(bobot, height);
      console.log(`BMI is ${bmi}`);
      if (bmi >= 30) {
        console.log('Obese');
      } else if (bmi >= 25) {
        console.log('Overweight');
      } else if (bmi >= 18.5) {
        console.log('Normal');
      } else {
        console.log('Underweight');
      }
      rl.close();
    });
  });
});

