package org.example;
import com.google.common.base.Strings;
public class TestClass {
    public static void main(String[] args) {
        String output = Strings.padEnd("bongo", 100, '!');
        System.out.println(output);
    }
}
