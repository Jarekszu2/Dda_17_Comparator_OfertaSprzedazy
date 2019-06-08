package packOfertaSprzedazyComparator;

import java.util.Comparator;

public class OfertaComparator implements Comparator<OfertaSprzedazy> {

    boolean flag;

    public OfertaComparator(boolean flag) {
        this.flag = flag;
    }

    public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {
       if (flag) {
           return Double.compare(o1.getCena(), o2.getCena());
       } else {
           return Double.compare(o2.getCena(), o1.getCena());
       }
    }
}
