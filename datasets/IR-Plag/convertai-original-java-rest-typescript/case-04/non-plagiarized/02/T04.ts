package IR;

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
class T04 {
    public static main(args: string[]): void {
        console.log("Miles       Kilometers");
        for (let i = 1; i <= 10; i++) {
            if (i === 10) {
                console.log(`${i}          ${i * 1609}`);
            } else {
                console.log(`${i}           ${i * 1609}`);
            }
        }
    }
}

