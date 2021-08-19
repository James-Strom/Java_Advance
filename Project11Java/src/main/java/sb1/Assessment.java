/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb1;

/**
 *
 * @author james
 */
public class Assessment {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

    }
}
