# system-ekspercki
Projekt zaliczeniowy na przedmiot Narzędzia i Metody Sztucznej Inteligencji

Celem systemu jest pomoc uzytkownikowi w wyborze obiektywu spelniajacego podane kryteria.

## Instrukcja obslugi
Aby poprawnie korzystać z programu, należy postępować według poniższej instrukcji.

1. Uruchomienie projektu w programie NetBeans
2. Przygotowanie bazy danych:
  1. Przejście do zakładki „services” i  uruchomienie serwera Java DB
  2. Stworzenie bazy danych: należy prawym przyciskiem myszy kliknąć na ikonę JAVA DB i wybrać: „Create database”, formularz który się pojawi należy wypełnić następującymi danymi:
    - database name: **Obiektyw**
    - user name: **User1**
    - password: **password**
  3. Połączenie się z bazą danych: w menu Services/Databases należy wybrać utworzoną bazę danych ( o nazwie jdbc:derby://localhost:1527/Obiektyw) i wybrać „Connect”
  4. Wczytać plik „dump.sql” znajdujący się w katalogu projektu i uruchomić go. Baza danych zostanie zapełniona rekordami i będzie można korzystać z programu.
3. Wybrać opcję „Run Project” aby uruchomić program
4. Odpowiadać na pytania wybierając cyfrę oznaczającą jedną z opcji odpowiedzi, np. 1, 2 lub 3

## Rozwoj programu
* dodanie gui
* zwiekszenie bazy danych
* stworzenie alternatywnej sciezki wyszukiwania - po kategorii "typ fotografii"
