package packOfertaSprzedazyComparator;

/*
Stwórz klasę OfertaSprzedaży(String nazwaProduktu, double cena) a następnie stwórz komparator który sortuje OfertySprzedaży po cenie rosnąco lub malejąco. Wskazówka : dodaj do klasy komparatora dodatkowe pole (np. typu boolean) które w zależności od wartości inaczej sortuje obiekty.
W mainie stwórz kilka instancji klasy OfertaSprzedaży i dodaj je do Listy. Po dodaniu posortuj listę i na ekran wypisz  wynik przed sortowaniem, oraz po sortowaniu. Spróbuj również sortowania 'w drugą stronę'.
*Stwórz parser komend. Pozwól użytkownikowi w konsoli kontrolować aplikację. Parser powinien obsługiwać komendy:
dodaj mleko 2.3
listuj
sortuj rosnaco (komenda nie listuje, tylko sortuje)
sortuj malejaco (komenda nie listuje, tylko sortuje)
 */

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OfertaSprzedazy {

    String nazwaProduktu;
    double cena;
}
