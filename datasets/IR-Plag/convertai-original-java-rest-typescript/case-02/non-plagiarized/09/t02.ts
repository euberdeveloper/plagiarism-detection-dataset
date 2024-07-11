import { Scanner } from 'readline-sync';

const sc = new Scanner();

console.log('Enter the radius and length of a cylinder : ');
const radius = sc.nextDouble();
const length = sc.nextDouble();

const area = radius * radius * 3.14159;
const volume = (radius * radius * 3.14159) * length;

const areaFormat = new Intl.NumberFormat('en-US', { minimumFractionDigits: 5, maximumFractionDigits: 5 });
const volumeFormat = new Intl.NumberFormat('en-US', { minimumFractionDigits: 1, maximumFractionDigits: 1 });

console.log(`The area is ${areaFormat.format(area)}`);
console.log(`The volume is ${volumeFormat.format(volume)}`);

