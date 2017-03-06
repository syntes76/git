package fileWriters;


// TWORZENIE I ZAPIS DO PLIKU 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTester {
    public static void main(String[] args) {
        String fileName = "C:/JAVAPR/teksty_do_szkolenia2.txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String tmp = null;
            while ((tmp = reader.readLine()) != null) {
                System.out.println(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
 
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        ) {
            writer.write("Bartek");
            writer.newLine();
            writer.write("Wojtek");
        } catch(IOException e) {
            System.err.println("B��d zapisu do pliku"); 
        }
    }

}


/*Pocz�tek kodu jest skopiowany z poprzedniego listingu, dalej jednak wykorzystana jest konstrukcja try-with-resources z Javy 7. Jest ona podobna do zwyk�ego try-catch, ale zwr�� uwag�, �e najpierw wykorzystujemy w niej nawiasy okr�g�e, a miedzy nimi umieszczamy deklaracj� i inicjalizacj� obiekt�w, kt�re musz� by� zamkni�te za pomoc� metody close(). Poniewa� w Javie 7 klasa BufferedWriter, a tak�e FileWriter implementuj� interfejs AutoCloseable, to dzi�ki konstrukcji try-with-resources metoda close() wykona si� samodzielnie, po wykonaniu kodu z bloku try.

Przy tworzeniu pliku BufferedWriter warto zauwa�y�, �e wywo�ali�my wersj� konstruktora FileWriter z opcjonalnym parametrem true. Bez tego parametru plik zosta�by nadpisany, w przypadku, gdy ustawimy warto�� tego argumentu na true, to na ko�cu zostan� dopisane nowe rzeczy.

Pomi�dzy nawiasami klamrowymi bloku try umieszczamy kod, kt�ry mo�e generowa� wyj�tki - czyli metod� write(), kt�ra r�wnie� mo�e zapisywa� zar�wno Stringi jak i pojedyncze znaki. Metoda newLine() powoduje dodanie znaku nowej linii specyficznego dla danej platformy - nie zawsze jest to "\n", warto wi�c korzysta� z tej opcji.*/