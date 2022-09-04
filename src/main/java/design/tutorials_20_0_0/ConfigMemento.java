package design.tutorials_20_0_0;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 备忘录
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigMemento {

    private ConfigFile configFile;

}
