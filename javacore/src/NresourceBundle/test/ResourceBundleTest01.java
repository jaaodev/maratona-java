package NresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle boundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(boundle.getString("hello"));
        System.out.println(boundle.getString("good.morning"));
        // Locale("fr","CA");
        //messages_fr_CA.properties
        //messages_fr.properties
        //messages_en_US.properties
        //messages_en.properties
        //messages.properties
    }
}
