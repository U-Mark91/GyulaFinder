package herkastucollections;

import java.util.ArrayList;

public class GyulaFinder {

    static String talaldMegGyulust(ArrayList<ArrayList<String>> ret) {
        final int KEZDO_SOR = 1;
        final int KEZDO_OSZLOP = 1;

        boolean megtalaltukEGyulust = false;
        int gyulaSora = KEZDO_SOR;
        int gyulaOszlopa = KEZDO_OSZLOP;

        for (ArrayList<String> sor : ret) {
            for (String mezo : sor) {
                if (!mezo.contains(RetGenerator.GYULA_STRING)) {
                    gyulaOszlopa++;
                } else {
                    megtalaltukEGyulust = true;
                    break;
                }
            }

            if (megtalaltukEGyulust == true) {
                break;
            }
            gyulaSora++; // ugyanaz mintha ez a sor else blockban lenne (mivel a break miatt nem fut le amugy sem)
            gyulaOszlopa = KEZDO_OSZLOP;
        }

        StringBuilder builder = new StringBuilder();
        builder.append("A(z) ");
        builder.append(gyulaSora);
        builder.append(". sor ");
        builder.append(gyulaOszlopa);
        builder.append(". oszlopban van a ");
        builder.append(RetGenerator.GYULA_STRING);
        return builder.toString();
    }
}
