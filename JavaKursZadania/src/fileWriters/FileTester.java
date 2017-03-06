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
            System.err.println("B³¹d zapisu do pliku"); 
        }
    }

}


/*Pocz¹tek kodu jest skopiowany z poprzedniego listingu, dalej jednak wykorzystana jest konstrukcja try-with-resources z Javy 7. Jest ona podobna do zwyk³ego try-catch, ale zwróæ uwagê, ¿e najpierw wykorzystujemy w niej nawiasy okr¹g³e, a miedzy nimi umieszczamy deklaracjê i inicjalizacjê obiektów, które musz¹ byæ zamkniête za pomoc¹ metody close(). Poniewa¿ w Javie 7 klasa BufferedWriter, a tak¿e FileWriter implementuj¹ interfejs AutoCloseable, to dziêki konstrukcji try-with-resources metoda close() wykona siê samodzielnie, po wykonaniu kodu z bloku try.

Przy tworzeniu pliku BufferedWriter warto zauwa¿yæ, ¿e wywo³aliœmy wersjê konstruktora FileWriter z opcjonalnym parametrem true. Bez tego parametru plik zosta³by nadpisany, w przypadku, gdy ustawimy wartoœæ tego argumentu na true, to na koñcu zostan¹ dopisane nowe rzeczy.

Pomiêdzy nawiasami klamrowymi bloku try umieszczamy kod, który mo¿e generowaæ wyj¹tki - czyli metodê write(), która równie¿ mo¿e zapisywaæ zarówno Stringi jak i pojedyncze znaki. Metoda newLine() powoduje dodanie znaku nowej linii specyficznego dla danej platformy - nie zawsze jest to "\n", warto wiêc korzystaæ z tej opcji.*/