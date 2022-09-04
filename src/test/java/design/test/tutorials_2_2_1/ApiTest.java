package design.test.tutorials_2_2_1;

import design.tutorials_2_2_0.ICalculationArea;
import design.tutorials_2_2_0.impl.CalculationArea;
import design.tutorials_2_2_0.impl.CalculationAreaExt;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CalulationAreaExt(){
        ICalculationArea area = new CalculationAreaExt();
        double circular = area.circular(10);
        System.out.println(circular);
    }

}
