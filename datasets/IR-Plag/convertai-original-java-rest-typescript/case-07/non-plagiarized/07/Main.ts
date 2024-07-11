import { DecimalFormat } from 'java.text';
import { Scanner } from 'java.util';

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
class Main {

    /**
     * @param args the command line arguments
     */
    static main(args: string[]): void {
        
        const sc = new Scanner(System.in);
        const a: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
        for (let i = 0; i < 4; i++)
        {
            for (let j = 0; j < 4; j++)
            {
                 a[i][j] = sc.nextDouble();
            }
          }
        
        
        for (let i = 0; i < 4; i++)
        {
            for (let j = 0; j < 4; j++)
            {   if(a[i][j] % 1 === 0){
                    const decimalFormat = new DecimalFormat("#");
                    const numberAsString = decimalFormat.format(a[i][j]);
                    console.log(numberAsString, " ");
                }
                else{
                        console.log(a[i][j], " ");
                }
            }
              console.log("");
        }
        
        
         
        console.log("Sum of the elements in the major diagonal is " + this.sumMajorDiagonal(a));
    }
    
static sumMajorDiagonal(array: number[][]): number
{
    let total = 0;

    for (let index = 0; index < array.length; index++)
    {
            total += array[index][index];
    }

    return total;
}
}

