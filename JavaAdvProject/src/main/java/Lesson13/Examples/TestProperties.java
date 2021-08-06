package Lesson13.Examples;

import java.util.Properties;

public class TestProperties {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.list(System.out);
    }
}