package Klausuren.ListenfilterFebruar2021_AndereLösung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listenfilter {
    public static void main(String[] args) {

        List<String> onlyM = filter(Arrays.asList(
                "Annaaaaaaaaaaa",
                "Jan",
                "Katarzyna",
                "Piotr",
                "Magdalena",
                "Tomasz",
                "Agnieszka",
                "Krzysztof",
                "Maria",
                "Michał",
                "Zofia",
                "Jakub",
                "Barbara",
                "Paweł",
                "Ewa"
        ), new LaengerFilter(8));

        for (String element : onlyM) {
            System.out.println(element);
        }
    }

    public static List<String> filter(List<String> elemente, Filterkriterium kriterium) {
        ArrayList<String> gefilterteElemente = new ArrayList<>();
            for (String element : elemente) {
                if (kriterium.kommtDurch(element)) {
                    gefilterteElemente.add(element);
                }
            }
        return gefilterteElemente;
    }
}