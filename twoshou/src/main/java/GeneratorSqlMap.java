/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorSqlMap {

    public void generator() throws Exception {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定逆向工程配置文件
        File configFile = new File("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

    }

    public static void main(String[] args) throws Exception {
        // System.setProperty("illegal-access", "deny");
        //try {
        GeneratorSqlMap generatorSqlMap = new GeneratorSqlMap();
        generatorSqlMap.generator();


    }

}