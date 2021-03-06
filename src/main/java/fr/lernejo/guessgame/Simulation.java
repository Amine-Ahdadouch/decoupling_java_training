package fr.lernejo.guessgame;

import fr.lernejo.logger.*;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;
  
    public Simulation(Player player) {
        this.player = player;
    }
  
    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }
  
    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        logger.log("Guess a number");
        long playerguess = this.player.askNextGuess();
        if (playerguess == this.numberToGuess){
            return true;
        }
        boolean lowerOrGreater = (playerguess > this.numberToGuess);
        this.player.respond(lowerOrGreater);
        return false;
    }
  
    public void loopUntilPlayerSucceed() {
        while(Boolean.FALSE.equals(nextRound())){
        }
    }
  }