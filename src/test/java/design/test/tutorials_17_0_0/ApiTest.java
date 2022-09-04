package design.test.tutorials_17_0_0;

import com.alibaba.fastjson.JSON;
import design.tutorials_16_0_0.AuthService;
import design.tutorials_16_0_2.AuthLink;
import design.tutorials_16_0_2.impl.Level1AuthLink;
import design.tutorials_16_0_2.impl.Level2AuthLink;
import design.tutorials_16_0_2.impl.Level3AuthLink;
import design.tutorials_17_0_0.Cmd;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApiTest {

    public static void main(String[] args) {
        Cmd cmd = Cmd.parse(args);
        if (!cmd.ok || cmd.helpFlag) {
            System.out.println("Usage: <main class> [-options] class [args...]");
            return;
        }
        if (cmd.versionFlag) {
            System.out.println("java version \"1.8.0\"");
        }
    }

}
