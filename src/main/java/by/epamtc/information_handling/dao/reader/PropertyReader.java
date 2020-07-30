package by.epamtc.information_handling.dao.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertyReader {
    private static PropertyReader instance;

    private Properties properties = new Properties();

    public static PropertyReader getInstance() {
        if (instance == null) {
            instance = new PropertyReader();
        }
        return instance;
    }

    public Properties getProperties() {

        return properties;
    }


    private PropertyReader() {
    }

    {
        try {
            File file = new File(Objects.requireNonNull(getClass()
                    .getClassLoader()
                    .getResource("regex.properties"))
                    .getFile());
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
