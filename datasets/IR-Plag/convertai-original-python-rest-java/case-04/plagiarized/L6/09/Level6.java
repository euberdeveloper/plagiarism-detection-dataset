package IR/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
public class Level6 {

    public static void konversi(int mile) {
        if (mile != 11) {
            System.out.println(mile + "\t\t" + mile * 1.609);
            mile++;
            konversi(mile);
        }
    }
    
    public static void main(String[] args) {
        int mile = 1;
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");

        konversi(mile);
    }
}
