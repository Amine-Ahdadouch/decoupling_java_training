package fr.lernejo.guessgame;


import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private Logger log = LoggerFactory.getLogger("player");
    public long askNextGuess(){
        Scanner sc = new Scanner(System.in);
        long guess = sc.nextLong();
        return guess;
    }
    public void respond(boolean lowerOrGreater){
        if (lowerOrGreater == true){
            log.log("Your number is greater");
        }
        else{
            log.log("Your number is lesser");
        }
    }
}
