import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function hitBMI(w: number, h: number): number {
  return w * 0.45359237 / ((h * 0.0254) * (h * 0.0254));
}

function result(totalBmi: number): void {
  if (totalBmi < 18.5) {
    console.log("Underweight");
  } else if (totalBmi < 25) {
    console.log("Normal");
  } else if (totalBmi < 30) {
    console.log("Overweight");
  } else {
    console.log("Obese");
  }
}

rl.question("Enter weight in pounds: ", (weightStr) => {
  const w = parseFloat(weightStr);
  rl.question("Enter feet: ", (feetStr) => {
    const f = parseFloat(feetStr);
    rl.question("Enter inches: ", (inchesStr) => {
      const i = parseFloat(inchesStr);
      const h = f * 12 + i;
      const totalBmi = hitBMI(w, h);
      console.log("BMI is " + totalBmi);
      result(totalBmi);
      rl.close();
    });
  });
});

