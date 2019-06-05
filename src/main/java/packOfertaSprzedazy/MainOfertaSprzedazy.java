package packOfertaSprzedazy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainOfertaSprzedazy {
    public static void main(String[] args) {
        System.out.println();

        OfertaSprzedazy os1 = new OfertaSprzedazy("naz1", 12.0);
        OfertaSprzedazy os2 = new OfertaSprzedazy("naz4", 2.0);
        OfertaSprzedazy os3 = new OfertaSprzedazy("naz2", 22.0);
        OfertaSprzedazy os4 = new OfertaSprzedazy("naz15", 112.0);
        List<OfertaSprzedazy> listaOfertSprzedaży = new ArrayList<OfertaSprzedazy>();
        listaOfertSprzedaży.add(os4);
        listaOfertSprzedaży.add(os2);
        listaOfertSprzedaży.add(os1);
        listaOfertSprzedaży.add(os3);

        Collections.sort(listaOfertSprzedaży, new OfertaComparator(true));
        // System.out.println(listaOfertSprzedaży);
        for (OfertaSprzedazy ofertaSprzedazy : listaOfertSprzedaży) {
            System.out.println(ofertaSprzedazy);
        }


        System.out.println();
        System.out.println();
        Collections.sort(listaOfertSprzedaży, new OfertaComparator(false));
        for (OfertaSprzedazy ofertaSprzedazy : listaOfertSprzedaży) {
            System.out.println(ofertaSprzedazy);
        }

        System.out.println();
        Collections.sort(listaOfertSprzedaży, new Comparator<OfertaSprzedazy>() {
            public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {
                boolean flag = false;
                if (flag) {
                    if (o1.getCena() > o2.getCena()){
                        return -1;
                    } else if (o1.getCena() < o2.getCena()) {
                        return 1;
                    }
                    return 0;
                } else {
                    if (o1.getCena() > o2.getCena()) {
                        return 1;
                    } else  if (o1.getCena() < o2.getCena()) {
                        return -1;
                    }
                    return 0;
                }

            }
        });
        listaOfertSprzedaży.forEach(System.out::println);
    }
}
