import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// program menghitung luas alas dan volume
rl.question("Enter the radius and length of a cylinder: ", (input) => {
  const [rad, panjang] = input.split(' ').map(Number);

  const luas = rad * rad * 3.14159;
  const vol = luas * panjang;
  console.log("The area is " + luas);
  console.log("The volume of the cylinder is " + vol);

  rl.close();
});

