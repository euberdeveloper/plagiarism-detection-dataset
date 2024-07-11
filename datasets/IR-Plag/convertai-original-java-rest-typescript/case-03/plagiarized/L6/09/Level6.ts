import readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function fungsiBmi(berat: number, feet: number, inches: number): number {
  const tinggi = feet * 12 + inches;
  return berat * 0.45359237 / Math.pow((tinggi * 0.0254), 2);
}

function result(res: number): void {
  console.log(`BMI is ${res}`);
  if (res < 18.5) {
    console.log("Underweight");
  } else if (res >= 18.5 && res < 25) {
    console.log("Normal");
  } else if (res >= 25 && res < 30) {
    console.log("Overweight");
  } else {
    console.log("Obese");
  }
}

rl.question("Enter weight in pounds: ", (weightStr) => {
  const berat = parseFloat(weightStr);
  rl.question("Enter feet: ", (feetStr) => {
    const feet = parseFloat(feetStr);
    rl.question("Enter inches: ", (inchesStr) => {
      const inches = parseFloat(inchesStr);
      result(fungsiBmi(berat, feet, inches));
      rl.close();
    });
  });
});

