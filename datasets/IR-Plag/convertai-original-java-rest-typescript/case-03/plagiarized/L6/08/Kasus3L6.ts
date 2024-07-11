import { Scanner } from 'readline-sync';

function hitungBMI(weight: number, height: number): number {
  const temp = height * 0.0254;
  return weight * 0.45359237 / (temp * temp);
}

function BMIKategori(BMI: number): void {
  console.log(`BMI is ${BMI}`);
  if (BMI > 30) {
    console.log('Obese');
  } else if (BMI > 25) {
    console.log('Overweight');
  } else if (BMI > 18.5) {
    console.log('Normal');
  } else {
    console.log('Underweight');
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

  // Print Hasil perhitungan
  BMIKategori(hitungBMI(berat, kaki * 12 + inch));
}

main();

