package IR;

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        
        //Use while loop
        int miles = 1;
        while (miles <= 10) {
                System.out.println(miles + "\t\t" + miles * 1.609);
                miles++;
        }
    }
}
