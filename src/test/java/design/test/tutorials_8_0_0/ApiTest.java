package design.test.tutorials_8_0_0;

import design.tutorials_7_0_1.QuestionBankController;
import design.tutorials_8_0_0.Singleton_07;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test() {
        Singleton_07 instance = Singleton_07.INSTANCE;
        instance.test();
    }
}
