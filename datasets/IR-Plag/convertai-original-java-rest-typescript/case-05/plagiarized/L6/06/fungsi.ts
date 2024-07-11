import { ArrayList, List } from 'typescript-collections';

function terbalik(angka: number): void {
  const arr: List<number> = new ArrayList<number>();
  while (angka > 0) {
    const sisa: number = angka % 10;
    arr.add(sisa);
    angka = Math.floor(angka / 10);
  }
  for (let i = 0; i < arr.size(); i++) {
    console.log(arr.get(i));
  }
  console.log();
}

function main(): void {
  console.log('Enter an integer: ');
  const sc: Scanner = new Scanner(System.in);
  const input: number = sc.nextInt();
  terbalik(input);
}

main();

