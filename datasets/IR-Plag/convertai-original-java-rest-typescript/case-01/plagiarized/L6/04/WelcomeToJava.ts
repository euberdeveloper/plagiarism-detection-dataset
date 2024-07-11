import { Console } from 'console';

function test(i: number): string {
  if (i > 0) {
    Console.log('Welcome To Java');
    return test(--i);
  } else {
    return '';
  }
}

function main(args: string[]): void {
  const i = 5;
  test(i);
}

main(process.argv.slice(2));

