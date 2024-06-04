At some point there'll be all tasks listed here.
# LAB01

1. Napisz program który wyświetli wynik następującego działania:
<img src="https://i.imgur.com/MBT6ZrZ.png" width="100%">

----

2. Napisz program, który przekonwertuje podane przez użytkownika stopnie Celsjusza na Fahrenheity według wzoru: `fahrenheit = (9 / 5) * celsius + 32`

----

3. Napisz program, który za pomocą pętli wydrukuje tabelkę (od 1 do 10):
```
Miles Kilometers
1 1.609
2 3.218
...
9 14.481
10 16.090
```

----

4. Napisz program, który pobierze od użytkownika liczbę od 1 do 7 i wypisze, który to dzień tygodnia. Poniedziałek to 1, niedziela to 7.

----

5. Napisz program, który pobiera od użytkownika wielkość tablicy, a następnie uzupełnia ją wpisywanymi przez użytkownika znakami. Na koniec program wyświetla utworzona przez użytkownika tablicę.

----

6. Napisz program, który pobiera od użytkownika wielkość tablicy, wartość pierwszego elementu (int), a następnie uzupełnia pozostałe elementy tablicy kolejnymi liczbami parzystymi większymi od zadanego pierwszego elementu Np. 5,1 -> [1,2,4,6,8].

Następnie :
- Napisz metodę która zwraca najmniejszy element tablicy
- Napisz metodę która zwraca największy element tablicy
- Napisz metodę, która zwraca sumę wszystkich elementów w tablicy
- Napisz metodę, która zwraca wartość średnią dla elementów tablicy
- Napisz metodę, która zwraca medianę dla przekazanej tablicy
- Wykorzystaj napisane w punktach a-e metody i wyświetl na koniec statystyki dotyczące utworzonej tablicy w formie:
```
Min: [liczba]
Max:[liczba]
Suma: [liczba]
Średnia: [liczba typu zmiennoprzecinkowego]
Mediana : [liczba typu zmiennoprzecinkowego]
```

----

7. Napisz metodę, która zwraca największy wspólny dzielnik dla przekazanych dwóch liczb typu int.

----

# LAB01 - Additional

1. Napisz program który wypisze liczby nieparzyste od 1 do 99.

----

2. Napisz program, który sprawdzi czy podana liczba jest parzysta czy nie.

----

3. Napisz program, który przyjmie trzy liczby od użytkownika. Następnie zsumuje dwie z nich i sprawdzi, czy suma jest równa trzeciej liczbie. Niech program wypisze true albo false zależnie od wyniku.

----

4. Napisz program, który zamieni sekundy podane przez użytkownika na godziny, minuty, i sekundy

----

5. Napisz program który sprawdzi czy na początku albo na końcu tablicy znajduje się liczba 10.

----

6. Napisz program który pobierze od użytkownika dwa stringi, połączy je i wypisze.

----

7. Napisz program który pobierze liczbę od użytkownika i wypisze tabliczkę mnożenia do 10 dla tej liczby.

----

# LAB02

1. Napisz program, który wczyta od użytkownika długość promienia.

Następnie na podstawie zadanej wartości wyliczy i wyświetli pole oraz obwód koła.

----

2. Napisz program, który wczyta od użytkownika rozmiar tablicy N, następnie pobierze N elementów tej tablicy i wypisze ją użytkownikowi w odwróconej kolejności.

----

3. Napisz program, który przyjmuje na wejście czas w formacie 24-godzinnym („HH:mm”) i konwertuje go na format 12-godzinny („hh:mm AM/PM”). Pamiętaj o walidacji wejścia programu!

----

4. Napisz program sprawdzający czy wyraz zadany przez użytkownika na wejściu jest palindromem.

----

5. Napisz program obsługujący rezerwacje miejsc w kinie.

Niech program przyjmuje numer rzędu oraz numer miejsca na wejście. W przypadku gdy miejsce pod zadanymi numerami jest wolne dokonujemy rezerwacji, w przeciwnym wypadku otrzymujemy informację, że miejsce jest już zajęte.

Użytkownik może wprowadzać kolejne rezerwacje do momentu wprowadzenia znaku terminalnego ‘x’.

Na zakończenie programu niech zostanie wyrysowany diagram miejsc wolnych i zajętych.

Przyjmujemy, że sala kinowa składa się z N x M miejsc.

----

6. Napisz program, który wczyta od użytkownika liczbę N a następnie wypisze liczbę o N-tym indeksie z ciągu Fibonacciego.

----

# LAB03

1. Napisz program, który pobierze od użytkownika dwie liczby i wypisze wynik dzielenia tych liczb.
Zabezpiecz program, żeby nie dzielić przez 0.

----

2. Napisz program który wypisze liczby parzyste od 2 do 20

-----

3. Stwórz metodę statyczną `compare`, niech przyjmuje jako argumenty dwie liczby całkowite.
Niech metoda zwróci:
- 1 – jeśli druga z nich jest większa
- 0 – jeśli są równe
- -1 – jeśli pierwsza z nich jest większa
Pokaż, że działa.

----

4. Napisz metodę, która przyjmuje w argumencie wyraz `(String)`. Metoda ta wczyta od użytkownika wyraz, a następnie wypisze go od tyłu.
Pokaż, że działa.

----

5. Stwórz tablicę 5 elementową i wypełnij ją liczbami przyjętymi od użytkownika. Następnie wypisz elementy tej tablicy pomnożone przez 3.

----

6. Napisz program, który weźmie od użytkownika rozmiar tablicy iwypełni go liczbami.
- Program ma wypisać “true” jeżeli suma liczb w tej tablicy jest podzielna przez 5, bez reszty.
- W innym wypadku ma wypisać “false”.

----

# LAB04

1. Napisz metodę, która przyjmuje 2 tablice 1wym. o tej samej długości i zwraca nową tablicę stanowiącą sumę przekazanych tablic. W sytuacji, gdy długości tablic się różnią metoda powinna zwrócić pustą tablicę.

----

2. Stwórz klasę Kwadrat. Umieść w niej pole bok, a także metody do obliczania obwodu i pola. Dodaj konstruktor.

Stwórz instancję i wywołaj metody obiektu.

----

3. Stwórz klasę Punkt która reprezentować będzie punkt w przestrzeni x i y. Klasa Punkt ma posiadać:
- pola x i y
- konstruktor bezargumentowy tworzący punkt w koordynatach (0,0)
- konstruktor pozwalający stworzyć punkt o określonych koordynatach
- metodę pozwalającą na obliczenie odległości między tym punktem a innym punktem podanym jako x i y
- metodę pozwalającą na obliczenie odległości między tym punktem a innym punktem podanym jako obiekt typu Punkt

Stwórz dwie instancje klasy Punkt i zweryfikuj poprawność utworzonych metod

----

4. Stwórz klasę MyCircle. Klasa ma posiadać:
- pole radius, które będzie przechowywać promień
- konstruktor który w argumencie przyjmuje promień
- metodę która oblicza obwód koła
- metodę która oblicza pole koła
- metodę która zwraca średnicę koła

Żeby uzyskać PI można użyć `Math.PI`.

----

5. Stwórz klasę Wiatrak. Klasa ma posiadać:
- trzy stałe o nazwie SLOW, MEDIUM i FAST o wartościach 1, 2 i 3 odpowiednio
- pole speed które przechowuje obecną prędkość wiatraka
- pole on które przechowuje stan wiatraka (włączony lub nie)
- pole radius które przechowuje promień wiatraka
- pole color które przechowuje kolor wiatraka
- konstruktor bezargumentowy który tworzy domyślny wiatrak
- konstruktor argumentowy
- metodę „informacje” która wyświetli w jednym Stringu wszystkie informacje o wiatraku

----

# LAB05

1. Napisz grę ‘zgadnij liczbę’. Program powinien składać się z 2 klas: Main z metodą psvm oraz Gra z logiką gry. Na początku gry użytkownik definiuje zakres liczb, następnie komputer losuje jedną liczbę z podanego zakresu i odpytuje użytkownika o liczbę. Jeśli liczba jest inna od wylosowanej przez komputer gracz otrzymuje informację ‘za mała’, ‘za duża’ po 5 nieudanych próbach wyświetla się komunikat o porażce oraz wartość nieodgadniętej liczby.

----

2. Generowanie i wyświetlenie talii Kart. Utwórz klasę Karta z polami typu enum Kolor i Figura. Zdefiniuj oba enumy w osobnych plikach .java. Niech Kolor przyjmuje wartości KIER, KARO, TREFL, PIK, a Figura wartości 2,3,4..,Walet,Dama,Król,As. Nadpisz metodę .toString() klasy Karta, tak aby drukowala opis karty np. ‘As Kier’, możesz też użyć znaków ascii jaki ikon. Na koniec wygeneruj całą talie (przydatne enum.values) i wyświetl ją na ekranie.

----

3. Symulator rzutu monetą. Zdefiniuj klasy Moneta oraz Symulacja. W klasie Symulacja utwórz metodę psvm, w której program odpyta użytkownika o ilość prób i wygeneruje wskazaną liczbę symulacji wyświetlając na koniec procentową szansę na uzyskanie wyniku orzeł i reszka np. 23% orzeł | 77% reszka dla 20 rzutów.

----

4. Symulacja wyścigu. Utwórz klasę Zawodnik o polach imię, predkosc minimalna, maksymalna, pokonana odległość. Dodaj odpowiedni konstruktor, załóż, że pokonany dystans wynosi 0 na etapie tworzenia Zawodnika.
  a) Utwórz następujące metody w klasie Zawodnik
      - przedstawSie():void – wyświetla dane o zawodniku np. „Jestem Robert biegam z prędkością 2-12km /h”
      - biegnij():void – pokonuje losową odległość w zakresie możliwości użytkownika
  b) Utwórz klasę Wyscig wraz z metodą psvm
      - W metodzie psvm utwórz 3 obiekty typu Zawodnik
      - Przeprowadź symulację zawodów – wywołuj metodę biegnij() na każdym z obiektów dopóki nie wyłonisz zwyciężcy (przebiegnięcie 50km)
      - Na koniec program powinien wyświetlić dane zwycięzcy

----

5. Utwórz klasę Ułamek reprezentującą ułamek zwykły. Klasa ma udostępniać operacje dodawania, odejmowania, mnożenia, dzielenia oraz wyświetlania ułamków (w formie licznik/mianownik np. ¾ ). Ułamki powinny składać się z liczb całkowitych zarówno w liczniku jak i mianowniku.

----

# LAB06

1. Stwórz klasę Pies.
   Stwórz w niej metody:
   - szczekaj, która nie przyjmuje argumentów. Pies ma zaszczekać raz. -
   - szczekaj, która przyjmuje jeden argument: ile szczeknięć ma wykonać pies. Pies zaszczeka określoną ilość razy.
Metody mają nazywać się tak samo.W celu weryfikacji w psvm utwórz nowy obiekt klasy Pies i wywołaj obie metody.

----

2. Stwórz klasę Prostokąt o dwóch atrybutach:
- a – długość pierwszego boku
- b – długość drugiego boku
Stwórz dwa konstruktory:
- dwuargumentowy, który ustawi wartości atrybutów a oraz b
- jednoargumentowy, ustawiający tą samą wartość dla a oraz b.
W klasie Prostokąt stwórz bezargumentowe metody obliczające sumę boków oraz pole reprezentowanej figury. Wynik wykonania wypisz do konsoli.

W celu weryfikacji w psvmutwórz dwaobiektyklasy Prostokąt używając różnych konstruktorów i wywołaj na nich obie metody.

----

3. Stwórz klasę Punkt reprezentującą dane punktuw układzie współrzędnych.

Stwórz klasę Okrag posiadającą atrybuty srodek typu Punkt oraz promiena także dwuargumentowy konstruktor inicjalizujący te atrybuty.

W klasie Okrag dodaj metodę zwracającą wartość typu `boolean` zależnie od tego czy punkt zadany na wejściu metody znajduje się wewnątrz okręgu.

W celu weryfikacji w psvmzainicjalizuj obiekty punkty i Okrag oraz wywołaj metodę sprawdzającą odległość. Wynik działania metody wypisz do konsoli.

----

4. Napisz kalkulator cen biletów.
Stwórz klasę Kalkulator, która będzie posiadała:
-  metodę `obliczCene` -Metoda licząca cenę biletu powinna przyjmować na wejście dwie wartości reprezentowane przez utworzone enumy zawierające następujące informacje:
    - rodzaj ulgi: bilet onormalny(100% ceny), ulgowy (50% taniej)
    - czas obowiązywania biletuo: jednorazowy(100% ceny), godzinny(150% ceny), dobowy(450% ceny).
Niech metoda na podstawie otrzymanych na wejściu wartości wyliczy cenę biletu od podstawowej ceny -4,80złi wypisze cenę do konsoli.
W celu weryfikacji w psvm utwórz obiekt klasy Kalkulatori wylicz wartości kilku wariantów biletów.

----

# LAB07

1. Stwórz klasę Animal. Niech ma pola name i color. Stwórz klasy Dog i Cat, obydwie mają dziedziczyć po Animal. W obydwóch utwórz metodę makeSound(), która zwróci string z dźwiękiem jaki wydaje to zwierzę, imieniem i kolorem.

Stwórz instancję i wywołaj metody obiektów.

----

2. Stwórz klasę Shop. Następnie stwórz dwie klasy dziedziczące po niej: Bookshop i Bakery.

Niech Shop ma pola: `address`, `size` i metodę `getInformation()`, która zwróci String z tymi dwoma polami. Stwórz konstruktor. Niech klasy dziedziczące mają pole products (tablica stringów), gdzie zawarte będą przykładowe produkty w sklepie. Stwórz konstruktor, który wywoła również konstruktor klasy nadrzędnej. Nadpisz metodę getInformation(), niech zwraca oprócz address i size również products w sensownym formacie.

---

3. Stwórz klasę Car. Stwórz trzy podklasy tej klasy. Niech każda klasa ma kolor i markę, a każda podklasa coś wyjątkowego. Stwórz obiekty wszystkich klas i umieść je we wspólnej tablicy i wypisz pętlą wspólne pola / metody wszystkich klas.

----

4. Stwórz klasę która przyjmuje przynajmniej 5 argumentów w konstruktorze. Następnie nadpisz metodę toString() i użyj jej żeby wyświetlić informacje o obiekcie.

----

5. Stwórz klasy A, B, C, D, E. Klasa B dziedziczy po A, C po B, D po C, E po D. Niech każda z tych klas ma metodę present(String phrase); Niech klasa A w metodzie present(String phrase) ma drukować argument podany do metody. Z kolei każda z podklas (B,C,D,E) ma w swojej metodzie wywoływać metodę klasy nad nią. (Czyli gdy wywołamy metodę w E, to ma ona wywołać metodę w D, ona zaś w C, która wywoła w B, która wywoła w A, która w końcu wydrukuje co ma wydrukować.)

----

6. Stwórz klasę Calculator. Niech ma trzy metody, każda z nich ma się nazywać calculate ale ma przyjmować inne argumenty: Pierwsza ma przyjmować jedną liczbę i wtedy ją podnieść do potęgi drugiej. Kolejna ma przyjmować dwie liczby i wtedy ma je pomnożyć. Trzecia ma przyjmować trzy liczby i ma je dodać.

----

# LAB08

1. Utwórz program, który pobiera od użytkownika dwie cyfry i zwraca ich sumę. Skorzystaj z `Integer.parseInt()` do sparsowania wprowadzanego przez użytkownika tekstu.

Obsłuż sytuację, gdy użytkownik poda znak zamiast cyfry lub cyfrę z znakiem. W tym celu sprawdź jaki wyjątek jest rzucany przez w/w metodę i dodaj odpowiedni blok try-catch. Poinformuj użytkownika o błędzie i ponownie poproś o cyfrę.
- Przetestuj swoje rozwiązanie
- Rozbuduj program o dodatkowe zapytanie o rodzaj działania:
  - (+) dodawanie
  - (-) odejmowanie
  - (*) mnożenie
  - (/) dzielenie
W przypadku podania niewłaściwego znaku poinformuj użytkownika o błędzie i ponownie poproś o znak

----

2. Utwórz metodę, która każdorazowo rzuca wyjątkiem typu RuntimeException wraz z dowolną wiadomością.
- Następnie wywołaj tą metodę z bloku psvm – zaobserwuj pojawienie się wyjątku w konsoli.
- Dodaj block try-catch wokół wywołania metody, aby przechwycić wyjątek
- W konsoli wyświetl wiadomość, która została przesłana z metody (sout)

----

3. Utwórz metodę, która każdorazowo rzuca wyjątkiem typu Exception np. IOException wraz z dowolną wiadomością.
- Następnie wywołaj tą metodę z bloku psvm – zaobserwuj pojawienie się błędu przy próbie kompilacji
- Rozwiąż błąd dodając odpowiednią adnotację do metody oraz dodająć block try-catch przy jej wywołaniu
- W bloku catch zaloguj wiadomość jako tekst (sout)

----

4. Utwórz klasę Osoba o polach: imie, nazwisko, rok urodzenia. W metodzie konstruktora sprawdź czy imię bądź nazwisko jest przekazane jako pusty String – jeśli tak jest to zwróć wyjątek Exception. 

Dodaj klasę Main, gdzie poprzez Scanner odpytujesz użytkownika o dane potrzebne do utworzenia obiektu a następnie ten obiekt tworzysz. Następnie:
- Nadpisz metodę toString w klasie Osoba, aby zwracała dane osoby
- Dodaj obsługę wyjątku – poinformuj użytkownika gdy nie udało się utworzyć nowego obiektu, z względu na błędne dane
- Zapętl tworzenie użytkownika – dopóki nie zostanie utworzony poprawnie
- W klasie Osoba utwórz metodę
```Java
  sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia):void
```
która sprawdzi poprawność zadanych danych
- Wywołaj metodę już w pierwszej linii konstruktora klasy Osoba
-  Niech metoda zwróci wyjątek wraz z odpowiednią wiadomością gdy:
  - Imię jest pustym stringiem -> „Podano niewłaściwe imię!”
  - Nazwisko jest pustym stringiem -> „Podano niewłaściwe nazwisko!”
  - Rok jest mniejszy od 1900 i większy od 2020 -> „Podano niewłaściwy rok urodzenia!”
- W bloku catch wyświetl otrzymany błąd

----

5. Pobierz klasy `Account` oraz `MainBankException` z platformy MS Teams i dodaj je do projektu. 
Następnie:
- Zidentyfikuj miejsca, gdzie może dojść do pojawienia się wyjątku i w rezultacie awarii 
programu. (Sprawdź kod i/lub samodzielnie uruchom program)
- Obsłuż te zidentyfikowane miejsca poprzez:
- dodanie odpowiedniej klauzuli try-catch
- Wyświetlenie wiadomości o niepoprawnie wprowadzonej wartości
- Rzucenie wyjątkiem, gdy użytkownik próbuje wypłacić większą kwotę niż stan konta
- Obsługa rzuconego wyjątkiem odpowiednim komunikatem
- Utwórz nowy wyjątek InsufficientFundsException, który będzie rzucany zamiast wcześniej zdefiniowanego wyjątku

----

6. Pobierz klasę `Divider` z MS TEAMS i dodaj do projektu (najlepiej w osobnym pakiecie).
Następnie:
- obsłuż sytuację, gdy użytkownik próbuje wprowadzić nie-liczbę np. tekst
- Obsłuż sytuację, gdy użytkownik próbuje podzielić przez zero (dodaj obsługę `ArithmeticException`)
- Zapewnij wykonanie podstawowego scenariusza tj. zebrania przez program 2 liczb i wykonania akcji dzielenia, w sytuacji gdy użytkownik dzielił przez zero wyświetl „Błąd, nie można dzielić przez zero"

----

# LAB09

1. Stwórz abstrakcyjną klasę Animal i trzy klasy (nieabstrakcyjne) które po niej dziedziczą.
Klasa Animal powinna mieć w sobie abstrakcyjną metodę makeSound(), a klasy dziedziczące implementację tej metody.
Stwórz obiekty klas dziedziczących, umieść je we wspólnej tablicy i pokaż, że działają.

----

3. Utwórz klasy Figura, Figura2D i Figura3D.Niech klasa Figura będzie abstrakcyjna i umożliwia obliczenie pola całkowitego (double) oraz obliczenie sumy krawędzi (int). 

Niech klasa Figura posiada konstruktor w postaci tablicy typu int stanowiącej zbiór wszystkich krawędzi.
Klasy Figura2D i Figura3D powinny dziedziczyć po klasie Figura.
Figura3D dodatkowo posiada metodę do obliczenia objetosci figury (double).

Następnie zaimplementuj klasy Prostokąt oraz Kwadrat pamiętając o odpowiednim dziedziczeniu.

Następnie utwórz klasę Prostopadloscian, która będzie dziedziczyć po odpowiedniej klasie zwyżej wymienionych i zaimplementuj wszystkie metody odziedziczone po klasach nadrzędnych.
Na koniec utwórz klasę Szescian i odpowiednio podepnij do łańcucha dziedziczenia. Jeżeli użytkownik przy tworzeniu jakiegokolwiek z obiektów jako argument zostanie podane 0, program powinien rzucić wyjątek i zakończyć działanie.

Przetestuj swoje rozwiązanie w bloku psvm klasy Main.

PodpowiedźW klasie dziedziczącej możesz zmienić konstruktor tak, aby przyjmował np. 1 parametr typuint, a następnie wewnątrz konstruktora przekazać ten parametr w innej formie, tak abyspełnić wymagania konstruktora nadrzędnego np.
```Java
Kwadrat(int bok){
super(new int[]{bok,bok,bok,bok});
}
```

----

3.Napisz klasę StringUtils, która umożliwi użytkownikowi operacje na stringach. 

Program ma wyświetlić menu, z którego użytkownik może wybrać działanie programu:
- odwracanie stringów
- szyfrowanie stringów za pomocą szyfru Cezara (czyli przesuwanie każdego ze znaków o X liter walfabecie, np. litera „b” przesunięta o 3 znaki to „e”; użytkownik podaje o ile liter ma być przesunięte)
- zamiana stringa na małe litery
- zamiana stringa na duże literyProgram ma rzucić wyjątek jeżeli:
  - string po operacji wygląda dokładnie tak samo jak przed operacją
  - użytkownik wpisze pusty string albo pustą opcję w menu
    
----

# LAB10

1. Napisz program, który wczyta dane z pliku tekstowego i zsumuje co drugą linijkę pliku. Plik znajduje się na Teams („Input”).

----

2. Napisz program, który przeanalizuje katalogi w basedir (na Teams - , „basedir.zip”). Program ma wykazać który z katalogów ma najwięcej plików.

----

3. Napisz program, który poda następne 100 roczników przestępnych za pomocą klasy LocalDate.

----

4. Napisz program, który pobierze format daty od użytkownika a następnie wyświetli w zadanym formacie obecną datę i/lub godzinę.

----

5. Przygotuj interfejs Figura który określa dwie metody: „obliczPole” i „obliczObwód”.
Następnie przygotuj trzy różne klasy które implementują ten interfejs na różne sposoby. Pokaż w pętli jak działają.

----

6. Do istniejących klas z zadania 5 zaimplementuj interfejs Comparable, w taki sposób aby sortował figury od tej z najmniejszym polem do tej z największym polem powierzchni.

----

7. Stwórz klasę Student - niech ma imię, nazwisko i numer indeksu. Niech implementuje interfejs Comparable. Stwórz tablice takich Studentów i posortuj ich za pomocą Arrays.sort().
Studenci mają być posortowani według indeksu. (indeks ma mieć format PJATK, np. s12345)

----

# LAB11

1. Lista – utwórz dwie następujące metody statyczne :
- Metoda do wyświetlania zduplikowanych elementów w liście.
- Metoda usuwająca zduplikowane elementy w liście.

Obie metody powinny na wejściu przyjmować argument typu interfejs Listy z dowolnym zbiorem elementów (List<>).
Przetestuj swoje rozwiązanie.

----

2. Napisz program do losowania gry w lotto przy pomocy kolekcji Set.

Oba zbiory – wybrane przez użytkownika liczby w zakresie 1-49 oraz wylosowane przez komputer 1-49 powinny zawierać się w kolekcji typu Set (6 wybranych liczb oraz 6 wylosowanych liczb). Program powinien odpytać użytkownika o 6 liczb – w sytuacji gdy użytkownik podaje nie-liczbę, lub liczbę spoza zakresu program prosi o ponowne wybranie liczby. Po wykonaniu losowania program wyświetla liczbę trafień.

----

3. Napisz metodę do zliczania wystąpień słów w tekście zliczWystapieniaSlow(String tekst):Map<String, Integer> :
- Metoda powinna utworzyć mapę ‘słowo’ -> ilość wystąpień
- Przetestuj działanie programu wyświetlając utworzoną mapę.

----

4. Napisz metodę do tworzenia skorowidzu liter : skorowidzLiterowy(String tekst):Map<String, Set<Integer>> :
- Metoda rozdziela zadany tekst na pojedyncze litery (.split(„”);) b) Iteruje przez wszystkie litery
- Aktualizuje indeksy wystąpień dla każdej litery
- Zwraca mapę w postaci: litera -> [indeksy wystąpień]

----

5. Napisz program, która przyjmie dowolny tekst przesłany przez użytkownika, a następnie obliczy liczbę wystąpień spółgłosek i samogłosek.

----

6. Napisz program pobierający od użytkownika 10 unikatowych liczb (użyj Seta) i wyświetlający ich sumę.
          
----

7. Napisz metodę przyjmującą Listę typu String i zwracającą kopię oryginalnej listy, lecz zawierającą jedynie elementy o parzystej długości.

----

8. Napisz metodę, która przyjmuje dowolny tekst (String) i zwraca liczbę unikatowych znaków

----
