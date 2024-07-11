import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function main() {
  let vol: number = 0;
  let luasAlas: number = 0;

  console.log("Enter the radius and length of a cylinder: ");
  rl.question("Radius: ", (radiusStr) => {
    const radius: number = parseFloat(radiusStr);
    rl.question("Length: ", (lengthStr) => {
      const length: number = parseFloat(lengthStr);

      luasAlas = radius * radius * 3.14159;
      vol = luasAlas * length;

      console.log("The area is " + luasAlas);
      console.log("The volume of the cylinder is " + vol);

      rl.close();
    });
  });
}

main();

