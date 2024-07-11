import * as readline from 'readline';

let weights: number, feets: number, inches: number, heights: number, bmi: number;

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function cetak() {
  // Display result
  console.log(`BMI is ${bmi}`);
  if (bmi >= 30) {
    console.log("Obese");
  } else if (bmi >= 25) {
    console.log("Overweight");
  } else if (bmi >= 18.5) {
    console.log("Normal");
  } else {
    console.log("Underweight");
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

