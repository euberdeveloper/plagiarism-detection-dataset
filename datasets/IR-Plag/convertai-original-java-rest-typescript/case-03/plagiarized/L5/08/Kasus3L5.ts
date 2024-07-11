import { Scanner } from 'readline-sync';

function hitungBMI(weight: number, height: number): number {
  return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
}

function BMIKategori(BMI: number): void {
  console.log(`BMI is ${BMI}`);
  if (BMI < 18.5) {
    console.log('Underweight');
  } else if (BMI < 25) {
    console.log('Normal');
  } else if (BMI < 30) {
    console.log('Overweight');
  } else {
    console.log('Obese');
  }
}

function main(): void {
  const inp = new Scanner();
  console.log('Enter weight in pounds: ');
  const berat = inp.nextDouble();

  console.log('Enter feet: ');
  const kaki = inp.nextDouble();
  console.log('Enter inches: ');
  const inch = inp.nextDouble();

  BMIKategori(hitungBMI(berat, kaki * 12 + inch));
}

main();

