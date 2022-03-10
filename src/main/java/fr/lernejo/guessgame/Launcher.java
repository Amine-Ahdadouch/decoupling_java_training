package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        HumanPlayer hm = new HumanPlayer();
        Simulation simulation = new Simulation(hm);
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100);
        simulation.initialize(randomNumber);
        simulation.loopUntilPlayerSucceed();
    }
}
