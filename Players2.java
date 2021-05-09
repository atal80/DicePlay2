//package LegionQA.AdvancedJava.DicePlay2;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;
//
//public class Players2 {
//
//    private static final Logger logger = LogManager.getLogger(Players2.class);
//
//    public int scannumber;
//    public String[] listOfAllPlayers;
//
//    public int inputPlayersNumber() {
//
//        Scanner scan1 = new Scanner(System.in);
//        do {
//            System.out.println("");
//            System.out.print("Enter quantity of players from 2 to 10: ");
//            while (!scan1.hasNextInt()) {
//                System.out.println("");
//                System.out.println("--------------------------------------");
//                System.out.println("E R R O R!!!  you entered not a number");
//                System.out.println("--------------------------------------");
//                System.out.print("Enter quantity of players from 2 to 10: ");
//                scan1.next();
//            }
//            scannumber = scan1.nextInt();
//        } while (scannumber < 2 || scannumber > 10);
//        return scannumber;
//
//    }
//
//    public ArrayList<String> listOfPlayers() {
//
//        ArrayList<String> players = new ArrayList<String>();
//
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("");
//        for (int i = 1; i <= scannumber; i++) {
//            System.out.print("Enter the " + i + " name of player: ");
//            players.add(scan2.next());
//
//        }
//        return players;
//    }
//}
//
//
//
//
