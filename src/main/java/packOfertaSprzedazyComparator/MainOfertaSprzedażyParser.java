package packOfertaSprzedazyComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainOfertaSprzedażyParser {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Program obsługuje oferty sprzedaży.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        List<OfertaSprzedazy> listaOfertSprzedaży = new ArrayList<>();
        char warunekKomendy = 'w';
        do {
            System.out.println();
            System.out.println("Wybierz komendę:\na: dodaj ofertę\nb: listuj\nc: sortuj rosnąco\nd: sortuj malejąso\nw: wyjście");
            warunekKomendy = scanner.next().charAt(0);

            switch (warunekKomendy){
                case 'a':
                    char warunekProduktu = 'w';
                    do {
                        System.out.println();
                        System.out.println("Dodawanie oferty do listy.\nDodaj ofertę na produkt:\na: mleko\nb: chleb\nc: ser\nd: dżem\nw: wyjście");
                        warunekProduktu = scanner.next().charAt(0);

                        switch (warunekProduktu){
                            case 'a':
                                String mleko = "mleko";
                                double cenaMleka = podajCeneProduktu();
                                OfertaSprzedazy osm = new OfertaSprzedazy(mleko, cenaMleka);
                                listaOfertSprzedaży.add(osm);
                                break;
                            case 'b':
                                String chleb = "chleb";
                                double cenaChleba = podajCeneProduktu();
                                OfertaSprzedazy osc = new OfertaSprzedazy(chleb, cenaChleba);
                                listaOfertSprzedaży.add(osc);
                                break;
                            case 'c':
                                String ser = "ser";
                                double cenaSera = podajCeneProduktu();
                                OfertaSprzedazy oss = new OfertaSprzedazy(ser, cenaSera);
                                listaOfertSprzedaży.add(oss);
                                break;
                            case 'd':
                                String dzem = "dżem";
                                double cenaDzemu = podajCeneProduktu();
                                OfertaSprzedazy osd = new OfertaSprzedazy(dzem, cenaDzemu);
                                listaOfertSprzedaży.add(osd);
                                break;
                        }
                    } while (warunekProduktu != 'w');
                    break;
                case 'b':
                    System.out.println("Oferta sprzedaży produktów:");
                    listaOfertSprzedaży.forEach(System.out::println);
                    break;
                case 'c':
                    System.out.println("Sortowanie listy rosnąco.");
                    Collections.sort(listaOfertSprzedaży,new OfertaComparator(true));
                    listaOfertSprzedaży.forEach(System.out::println);
                    break;
                case 'd':
                    System.out.println("Sortowanie listy malejąco.");
                    Collections.sort(listaOfertSprzedaży,new OfertaComparator(false));
                    listaOfertSprzedaży.forEach(System.out::println);
                    break;
            }
        } while (warunekKomendy != 'w');

        System.out.println();
    }

    public static double podajCeneProduktu() {
        Scanner scanner = new Scanner(System.in);
        double cenaProduktu = 0.0;
        double wprowadzonaWartosc = 0.0;
        boolean flag = true;
        do {
            System.out.println("Podaj cenę produktu:");
            while (!scanner.hasNextDouble()) {
                System.out.println("To nie jest liczba!");
                scanner.next();
            }
            // if (!scanner.hasNextDouble()) {
            //     System.out.println("To nie jest liczba!");
            // }

            wprowadzonaWartosc = scanner.nextDouble();
            if (wprowadzonaWartosc <= 0.0) {
                System.out.println("Wprowadź liczbę dodatnią!");
            } else {
                cenaProduktu = wprowadzonaWartosc;
                flag = false;
            }
        }while (flag);
        return cenaProduktu;

        // projekt przerzucono do katalogu Gda/17 i utworzono repo Gda_17
    }
}
