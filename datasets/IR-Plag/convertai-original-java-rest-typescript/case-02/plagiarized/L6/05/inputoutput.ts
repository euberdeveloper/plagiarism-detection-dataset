import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

class inputoutput {
  static rad: number;
  static panjang: number;

  static input(): void {
    rl.question('Enter the radius and length of a cylinder: ', (input) => {
      const [radius, length] = input.split(' ').map(Number);
      this.rad = radius;
      this.panjang = length;
      this.calculateAndPrint();
      rl.close();
    });
  }

  static hitArea(): number {
    return Math.pow(this.rad, 2) * 3.14159;
  }

  static calculateAndPrint(): void {
    const area = this.hitArea();
    const volume = area * this.panjang;
    console.log(`The area is ${area}`);
    console.log(`The volume of the cylinder is ${volume}`);
  }
}

inputoutput.input();

