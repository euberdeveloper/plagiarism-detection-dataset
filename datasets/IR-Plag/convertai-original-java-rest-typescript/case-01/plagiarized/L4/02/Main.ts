import { console } from 'console';

function printOut(): void {
  console.log('Welcome to Java');
}

function main(args: string[]): void {
  // print 5x "Welcome To Java"
  printOut();
  printOut();
  printOut();
  printOut();
  printOut();
}

main(process.argv.slice(2));

