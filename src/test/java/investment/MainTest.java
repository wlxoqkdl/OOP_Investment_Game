package investment;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class MainTest {
    @Test
    void mainStartsGameAndReturns() {
        var buffer = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try (var capturedOutput = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
            try {
                System.setOut(capturedOutput);
                Main.main(new String[0]);
            } finally {
                System.setOut(originalOutput);
            }
        }

        assertLinesMatch(
                java.util.List.of("OOP 모의투자 게임", "프로젝트 골격 실행 완료"),
                buffer.toString(StandardCharsets.UTF_8).lines().toList()
        );
    }
}
