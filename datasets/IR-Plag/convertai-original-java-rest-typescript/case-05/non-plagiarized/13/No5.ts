import { Scanner } from 'readline-sync';

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
function main(args: string[]): void {
    const sc = new Scanner();
    console.log("Enter an integer: ");
    const inp = sc.next();
    reverse(inp);
}

function reverse(a: string): void {
    for (let i = a.length - 1; i >= 0; i--) {
        console.log(a.charAt(i));
    }
}

main(process.argv.slice(2));

