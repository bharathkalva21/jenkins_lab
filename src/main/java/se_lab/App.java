package se_lab;

import java.io.InputStream;
import java.util.Properties;

public class App {

    public static void main(String[] args) {

        try {
            InputStream input = App.class.getClassLoader()
                    .getResourceAsStream("config.properties");

            Properties properties = new Properties();
            properties.load(input);

            System.out.println("App Name: " + properties.getProperty("app.name"));
            System.out.println("Version: " + properties.getProperty("app.version"));
            System.out.println("Author: " + properties.getProperty("app.author"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}