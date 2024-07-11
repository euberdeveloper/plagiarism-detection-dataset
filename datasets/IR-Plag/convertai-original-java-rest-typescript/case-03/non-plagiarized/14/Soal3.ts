import { Scanner } from 'readline-sync';

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
function main(): void {
    const sc = new Scanner();
    console.log('Enter weight in pounds: ');
    const weight = sc.nextDouble();
    console.log('Enter feet: ');
    const feet = sc.nextDouble();
    console.log('Enter inches: ');
    const inches = sc.nextDouble();
    const height = feet * 12 + inches;
    const bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
    console.log('BMI is ' + bmi.toFixed(2));
    if (bmi < 18.5) {
        console.log('Underweight');
    } else if (bmi >= 18.5 && bmi < 25) {
        console.log('Normal');
    } else if (bmi >= 25 && bmi < 35) {
        console.log('Overweight');
    } else {
        console.log('Obese');
    }
}

main();

