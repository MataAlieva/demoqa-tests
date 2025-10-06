import org.junit.jupiter.api.*;

import java.util.Stack;
import java.util.function.BooleanSupplier;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.platform.commons.util.Preconditions.condition;

public class SimpleJUnitTest {
    int result;

    @BeforeAll
    static void beforeAll() {
        System.out.println("\n### beforeAll\n()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###    beforeEach()");
        result = qetResult();
    }
    @AfterEach
    void AfterEach() {
        System.out.println("###    AfterEach()\n");
        result = 0;
    }

    @AfterAll
    static void afterall() {
        System.out.println("\n###  AfterAll()\n");
    }

    @Test
    void firstTest() {
        int result = qetResult();
        System.out.println("###    firstTest()");
        Assertions.assertTrue(result> 2);
    }

    @Test
    void secondTest() {
        int result = qetResult();
        System.out.println("###    secondTest()");
        Assertions.assertTrue( result>2);
    }
    @Test
    void thirdTest() {
        int result = qetResult();
        System.out.println("###    thirdTest()");
        Assertions.assertTrue( result>2);
    }
private int qetResult() {
    return  0;

}
}
