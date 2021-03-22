package nl.sogeti.com;

import nl.sogeti.logo.SogetiLogoDrawer;

public class EasterEggRunner {

    public static void main(String[] args) {
        int phase = 0;

        while (true) {
            EasterEgg.drawEgg(createEggMetrics(phase));

            // Please don't change the following code:
            // Sorry, needed to comment this to make the animation smoother
            // new SogetiLogoDrawer().printSogetiLogo();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // For the star band, 3 star (one set) is 12 steps long.
            // Therefore, there are 12 phases
            phase = (phase + 1) % 12;

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    private static EggMetrics createEggMetrics(int phase) {
        return new EggMetrics(30, 22, 50, 20, Colors.WHITE.getColor(), Colors.GREEN.getColor(), phase);
    }
}
