package design.test.tutorials_25_0_0;

import design.tutorials_25_0_0.DataView;
import design.tutorials_25_0_0.visitor.impl.Parent;
import design.tutorials_25_0_0.visitor.impl.Principal;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_show(){
        DataView dataView = new DataView();

        logger.info("\r\n家长视角访问：");
        dataView.show(new Parent());

        logger.info("\r\n校长视角访问：");
        dataView.show(new Principal());
    }

}
