package design.tutorials_20_0_0;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 记录者
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigOriginator {

    private ConfigFile configFile;

    public ConfigMemento saveMemento(){
        return new ConfigMemento(this.configFile);
    }

    public void getMemento(ConfigMemento configMemento){
        this.configFile = configMemento.getConfigFile();
    }
}
