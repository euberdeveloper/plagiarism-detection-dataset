import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const array: number[] = new Array(10);

const readNumbers = () => {
  rl.question('Read a number: ', (num) => {
    array.push(parseInt(num));
    if (array.length === 10) {
      rl.close();
      console.log(array[9]);
      console.log(array[8]);
      console.log(array[7]);
      console.log(array[6]);
      console.log(array[5]);
      console.log(array[4]);
      console.log(array[3]);
      console.log(array[2]);
      console.log(array[1]);
      console.log(array[0]);
    } else {
      readNumbers();
    }
  });
};

readNumbers();

