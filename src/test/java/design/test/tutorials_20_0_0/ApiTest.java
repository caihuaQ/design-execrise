package design.test.tutorials_20_0_0;

import com.alibaba.fastjson.JSON;
import design.tutorials_19_0_2.mediator.SqlSession;
import design.tutorials_19_0_2.mediator.SqlSessionFactory;
import design.tutorials_19_0_2.mediator.SqlSessionFactoryBuilder;
import design.tutorials_19_0_2.po.User;
import design.tutorials_20_0_0.Admin;
import design.tutorials_20_0_0.ConfigFile;
import design.tutorials_20_0_0.ConfigOriginator;
import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Reader;
import java.util.Date;
import java.util.List;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        Admin admin = new Admin();

        ConfigOriginator configOriginator = new ConfigOriginator();

        configOriginator.setConfigFile(new ConfigFile("1000001", "配置内容A=哈哈", new Date(), "小傅哥"));
        admin.append(configOriginator.saveMemento()); // 保存配置

        configOriginator.setConfigFile(new ConfigFile("1000002", "配置内容A=嘻嘻", new Date(), "小傅哥"));
        admin.append(configOriginator.saveMemento()); // 保存配置

        configOriginator.setConfigFile(new ConfigFile("1000003", "配置内容A=么么", new Date(), "小傅哥"));
        admin.append(configOriginator.saveMemento()); // 保存配置

        configOriginator.setConfigFile(new ConfigFile("1000004", "配置内容A=嘿嘿", new Date(), "小傅哥"));
        admin.append(configOriginator.saveMemento()); // 保存配置

        // 历史配置(回滚)
        configOriginator.getMemento(admin.undo());
        logger.info("历史配置(回滚)undo：{}", JSON.toJSONString(configOriginator.getConfigFile()));

        // 历史配置(回滚)
        configOriginator.getMemento(admin.undo());
        logger.info("历史配置(回滚)undo：{}", JSON.toJSONString(configOriginator.getConfigFile()));

        // 历史配置(前进)
        configOriginator.getMemento(admin.redo());
        logger.info("历史配置(前进)redo：{}", JSON.toJSONString(configOriginator.getConfigFile()));

        // 历史配置(获取)
        configOriginator.getMemento(admin.get("1000002"));
        logger.info("历史配置(获取)get：{}", JSON.toJSONString(configOriginator.getConfigFile()));

    }
}
