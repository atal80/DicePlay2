package LegionQA.AdvancedJava.DicePlay2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game2 {

    static int diceside;

    public ArrayList<Integer> listOfWinners;

    private static final Logger logger = LogManager.getLogger(Game2.class);

    public static void playGame() throws IOException {

        Scanner scan1 = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.print("Please enter number of dice edges (6,8,10, or 12) ");

            while (!scan1.hasNextInt()) {
                System.out.println("");
                System.out.println("--------------------------------------");
                System.out.println("E R R O R!!!  you entered not a number");
                System.out.println("--------------------------------------");
                System.out.print("Please enter number of dice edges (6,8,10, or 12) ");
                scan1.next();
            }
            diceside = scan1.nextInt();

        } while (diceside != 6 && diceside != 8 && diceside != 10 && diceside != 12);

        Players2 players2 = new Players2();
        int numberOfPlayers = players2.inputPlayersNumber();

        ArrayList<String> allPlayers;
        allPlayers = players2.listOfPlayers();
        System.out.println(allPlayers);

        Dice2 dice2 = new Dice2();
        ArrayList<Integer> listRandomNumbers;
        listRandomNumbers = dice2.roll(numberOfPlayers, diceside);
        System.out.println(listRandomNumbers);

        int placeOfMaxElement = listRandomNumbers.indexOf(Collections.max(listRandomNumbers)) + 1; // place of max element in Array
        int maxDiceNumber = Collections.max(listRandomNumbers);
        System.out.println("-------------------------------------");
        System.out.println("The winner is: " + allPlayers.get(placeOfMaxElement - 1));
        System.out.println("His score is: " + maxDiceNumber);
        System.out.println("-------------------------------------");

    }
}









