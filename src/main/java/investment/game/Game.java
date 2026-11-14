package investment.game;

import java.io.PrintStream;

public final class Game {
    private final PrintStream output;

    public Game(PrintStream output) {
        this.output = output;
    }

    public void run() {
        output.println("OOP 모의투자 게임");
        output.println("프로젝트 골격 실행 완료");
    }
}
