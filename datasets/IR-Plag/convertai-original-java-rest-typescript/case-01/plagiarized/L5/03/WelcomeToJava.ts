import { Console } from 'console';

function test(i: number): void {
  while (i > 0) {
    Console.log('Welcome To Java');
    i--;
  }
}

function main(args: string[]): void {
  test(5);
}

main(process.argv.slice(2));

