package com.example.mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


        public class Soccer {

            public static void main(String[] args) {
                // pass the path to the file as a parameter
                File file = new File("C:\\Computer Files\\Code College\\Java_advanced\\Classwork\\SoccerProject\\test.txt");
                Scanner sc = null;
                String match, team1, team2, score1, score2;
                int leagueTotal;

                String [] sides, l1,l2;
                try {
                    sc = new Scanner(file);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                while (sc.hasNextLine()) {
                    match = sc.nextLine();
                    sides = match.split(",");
                    l1 = sides[0].split(" ");
                    team1 = l1[0];
                    score1 = l1[1];

                    l2 = sides[1].split(" ");
                    team2 = l2[0];
                    score2 = l2[1];

                    int teamScore1 = Integer.parseInt(score1);
                    int teamScore2 = Integer.parseInt(score2);
                    // update the scoreboard
                               if (teamScore1 > teamScore2) {
                                    leagueTotal+=3

                               }
                }
            }
        }


