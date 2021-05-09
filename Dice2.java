package LegionQA.AdvancedJava.DicePlay2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Dice2 {

    private static final Logger logger = LogManager.getLogger(Dice2.class);


    public static  ArrayList<Integer> roll(int numberOfPlayers, int diceside) {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();

        for (int i = 1; i <= numberOfPlayers; i++) {
            int dice1 = (int) (Math.random() * diceside + 1);
          int dice2 = (int) (Math.random() * diceside + 1);

          randomNumbers.add(dice1 + dice2);
        //    randomNumbers.add(dice1);
        }

        return randomNumbers;
    }
}



