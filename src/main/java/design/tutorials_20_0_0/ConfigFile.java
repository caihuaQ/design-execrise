package design.tutorials_20_0_0;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 配置文件
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigFile {

    //版本号
    private String versionNo;
    //内容
    private String content;
    //时间
    private Date dateTime;
    //操作人
    private String operator;

}
