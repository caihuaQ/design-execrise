package design.test.tutorials_7_0_1;

import design.tutorials_6_0_2.Builder;
import design.tutorials_7_0_1.QuestionBankController;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_QuestionBankController(){
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花","1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆","1000001921051"));
        System.out.println(questionBankController.createPaper("大宝","1000001921987"));
    }
}
