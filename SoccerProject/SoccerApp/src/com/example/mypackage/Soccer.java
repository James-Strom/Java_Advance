package com.example.mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Soccer {

    public static void main(String[] args) {
        // pass the path to the file as a parameter
        File file = new File("C:\\Computer Files\\Code College\\Java_advanced\\Classwork\\SoccerProject\\test.txt");
        Scanner sc = null;
        String match,team1, team2, score1, score2, left, right;
        String [] sides;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            match = sc.nextLine();
            sides = match.split(",");
            left = sides[0];
            right = sides[1];

            System.out.println(left);
            System.out.println(right);

            team1 = left.split();
            team2 = left.split()
        }
    }
}
