package investment;

import investment.game.Game;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        new Game(System.out).run();
    }
}
