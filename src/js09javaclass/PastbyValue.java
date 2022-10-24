/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package js09javaclass;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class PastbyValue {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        
        test(i);
        System.out.println(i);
    }
    public static void test(int j) {
        j = 33;
    }  
}
