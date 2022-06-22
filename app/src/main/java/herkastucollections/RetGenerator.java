package herkastucollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RetGenerator {

    public static String GYULA_STRING = "Gyula";

    static ArrayList<ArrayList<String>> generaljRetet() {
        ArrayList<String> felsoSor = new ArrayList<>();
        Collections.addAll(felsoSor, "kutyaszar", "pazsit", "e-roller");

        ArrayList<String> kozepsoSor = new ArrayList<>(Arrays.asList("pazsit", "bokor", "soros uveg"));

        ArrayList<String> alsoSor = new ArrayList<>(Arrays.asList("AIDS-es tu", "Gyula", "sor"));

        ArrayList<ArrayList<String>> ret = new ArrayList<>(Arrays.asList(felsoSor, kozepsoSor, alsoSor));

        return ret;
    }
}
