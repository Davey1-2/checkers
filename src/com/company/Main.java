package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         0 = empty
         1 = black
         2 = white
         */

        String white = "⬜";
        String black = "⬛";
        String whiteF = "○";
        String blackF = "⬤";
        boolean boo;

        int i1 = 0;
        int j1 = 0;
        int i2 = 0;
        int j2 = 0;

        int[][] sachovnice = {
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {3, 0, 3, 0, 3, 0, 3, 0},
                {0, 3, 0, 3, 0, 3, 0, 3},
                {3, 0, 3, 0, 3, 0, 3, 0},
                {0, 3, 0, 3, 0, 3, 0, 3},
                {2, 0, 2, 0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0, 2, 0, 2},
        };


        while (boo = true) {

            while (boo = true) {
                System.out.println("Checkers");
                System.out.println("--------");
                System.out.println("Black's move");
                System.out.println();
                for (int i = 0; i < sachovnice.length; i++) {
                    for (int j = 0; j < sachovnice[i].length; j++) {
                        if (sachovnice[i][j] == 1)
                            System.out.print(whiteF);

                        else if (sachovnice[i][j] == 2)
                            System.out.print(blackF);

                        else {
                            if ((i + j) % 2 == 0)
                                System.out.print(black);
                            else
                                System.out.print(white);
                        }
                        System.out.print(" ");
                    }
                    System.out.println();
                }

                System.out.println("Zadej vstup s kým chceš hýbat");
                i1 = sc.nextInt();
                if (i1 == 69) {
                    System.exit(0);
                }
                j1 = sc.nextInt();
                if (j1 == 69) {
                    System.exit(0);
                }

                if (sachovnice[i1][j1] == 2) {
                    System.out.println("Zadej vstup kam chceš jít");
                    i2 = sc.nextInt();
                    if (i2 == 69) {
                        System.exit(0);
                    }
                    j2 = sc.nextInt();
                    if (j2 == 69) {
                        System.exit(0);
                    }
                    if (sachovnice[i2][j2] == 0) {
                        System.out.println("-----------------------------");
                        System.out.println("TAM NEMUZES ZKUS TO ZNOVU");
                        System.out.println("-----------------------------");
                        System.out.println();
                    }
                    if (sachovnice[i1 - 1][j1 + 1] == 1 && sachovnice[i1 - 2][j1 + 2] == 3){
                        sachovnice[i1 - 2][j1 + 2] = 2;
                        sachovnice[i1 - 1][j1 + 1] = 3;
                        sachovnice[i1][j1] = 3;
                        break;
                    }
                    if (sachovnice[i1 + 1][j1 - 1] == 1 && sachovnice[i1 + 2][j1 - 2] == 3){
                        sachovnice[i1 + 2][j1 - 2] = 2;
                        sachovnice[i1 + 1][j1 - 1] = 3;
                        sachovnice[i1][j1] = 3;
                        break;
                    }
                    if (sachovnice[i2][j2] == 3){
                        sachovnice[i1][j1] = 3;
                        sachovnice[i2][j2] = 2;
                        break;
                    }

                } else {
                    System.out.println("Invalid vstup");
                }
            }
            while (boo = true) {
                System.out.println("Checkers");
                System.out.println("--------");
                System.out.println("White's move");
                System.out.println();

                for (int i = 0; i < sachovnice.length; i++) {
                    for (int j = 0; j < sachovnice[i].length; j++) {
                        if (sachovnice[i][j] == 1)
                            System.out.print(whiteF);

                        else if (sachovnice[i][j] == 2)
                            System.out.print(blackF);

                        else {
                            if ((i + j) % 2 == 0)
                                System.out.print(black);
                            else
                                System.out.print(white);
                        }
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println("Zadej vstup s kým chceš hýbat");
                i1 = sc.nextInt();
                if (i1 == 69) {
                    System.exit(0);
                }
                j1 = sc.nextInt();
                if (j1 == 69) {
                    System.exit(0);
                }

                if (sachovnice[i1][j1] == 1) {
                    System.out.println("Zadej vstup kam chceš jít");
                    i2 = sc.nextInt();
                    if (i2 == 69) {
                        System.exit(0);
                    }
                    j2 = sc.nextInt();
                    if (j2 == 69) {
                        System.exit(0);
                    }
                    if (sachovnice[i2][j2] == 0) {
                        System.out.println("-----------------------------");
                        System.out.println("TAM NEMUZES ZKUS TO ZNOVU");
                        System.out.println("-----------------------------");
                        System.out.println();

                    }
                    if (sachovnice[i1 + 1][j1 + 1] == 1 && sachovnice[i1 + 2][j1 + 2] == 3){
                        sachovnice[i1 + 2][j1 + 2] = 2;
                        sachovnice[i1 + 1][j1 + 1] = 3;
                        sachovnice[i1][j1] = 3;
                        break;
                    }
                    if (sachovnice[i1 + 1][j1 - 1] == 1 && sachovnice[i1 + 2][j1 - 2] == 3){
                        sachovnice[i1 + 2][j1 - 2] = 2;
                        sachovnice[i1 + 1][j1 - 1] = 3;
                        sachovnice[i1][j1] = 3;
                        break;
                    }
                    if (sachovnice[i2][j2] == 3){
                        sachovnice[i1][j1] = 3;
                        sachovnice[i2][j2] = 1;
                        break;
                    }


                } else {
                    System.out.println("Invalid vstup");
                }


            }

        }

    }
}