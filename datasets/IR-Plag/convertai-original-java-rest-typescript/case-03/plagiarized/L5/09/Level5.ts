import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function bmi(weight: number, height: number): void {
  const bmi = weight * 0.45359237 / Math.pow((height * 0.0254), 2);

  console.log(`BMI is ${bmi}`);

  if (bmi < 18.5) {
    console.log("Underweight");
  } else if (bmi < 25) {
    console.log("Normal");
  } else if (bmi < 30) {
    console.log("Overweight");
  } else {
    console.log("Obese");
  }
}

rl.question("Enter weight in pounds: ", (weightStr) => {
  const weight = parseFloat(weightStr);

  rl.question("Enter feet: ", (feetStr) => {
    const feet = parseFloat(feetStr);

    rl.question("Enter inches: ", (inchesStr) => {
      const inches = parseFloat(inchesStr);
      const height = feet * 12 + inches;

      bmi(weight, height);
      rl.close();
    });
  });
});

