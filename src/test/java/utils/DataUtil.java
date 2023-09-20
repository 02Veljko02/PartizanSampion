package utils;

import com.google.common.collect.Maps;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class DataUtil {
    public static Object[][] dataProvider(){
        return readYaml("src/main/resources/data1.yaml", "data");
    }
    public static Object[][] readYaml(String filePath, String yamlObject){
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Yaml yaml = new Yaml();
        Map<String, Object> data = yaml.load(inputStream);
        Object[][] dataTest = new Object[1][1];
        dataTest[0][0] = data.get(yamlObject);
        return  dataTest;
    }
}
