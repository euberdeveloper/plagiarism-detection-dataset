import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let weights: number;
let feets: number;
let inches: number;
let heights: number;
let bmi: number;

function cetak(): void {
  // Display result
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

rl.question("Enter weight in pounds: ", (weightInput) => {
  weights = parseFloat(weightInput);

  rl.question("Enter feet: ", (feetInput) => {
    feets = parseFloat(feetInput);

    rl.question("Enter inches: ", (inchInput) => {
      inches = parseFloat(inchInput);

      // Compute BMI
      heights = feets * 12 + inches;
      bmi = weights * 0.45359237 / ((heights * 0.0254) * (heights * 0.0254));
      cetak();
      rl.close();
    });
  });
});

