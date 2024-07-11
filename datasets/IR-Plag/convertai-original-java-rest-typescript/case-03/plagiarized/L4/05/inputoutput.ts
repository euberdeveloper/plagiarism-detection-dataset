import readline from 'readline';

function hitHeight(kaki: number, inc: number): number {
  return kaki * 12 + inc;
}

function hitBmi(bobot: number, height: number): number {
  return bobot * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
}

async function main() {
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  console.log('Enter weight in pounds: ');
  const bobot = await new Promise<number>((resolve) => {
    rl.question('', (answer) => {
      resolve(parseFloat(answer));
    });
  });

  console.log('Enter feet: ');
  const kaki = await new Promise<number>((resolve) => {
    rl.question('', (answer) => {
      resolve(parseFloat(answer));
    });
  });

  console.log('Enter inches: ');
  const inc = await new Promise<number>((resolve) => {
    rl.question('', (answer) => {
      resolve(parseFloat(answer));
    });
  });

  const height = hitHeight(kaki, inc);
  const bmi = hitBmi(bobot, height);

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
}

main();

