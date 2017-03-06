package rekurencja;

import java.io.File;
/*
 * Przyk�ad listowania drzewa katalog�w

*/
public class DirectoryLister {
    public static void main(String[] args) {
        DirectoryLister dl = new DirectoryLister();
        File file = new File("C:/JAVAPR/workspace");
        dl.showDirectories(file);
    }
 
    public void showDirectories(File file) {
        File[] files = file.listFiles();
 
        if (files != null)
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println("folder " + f.getAbsolutePath());
                   // showDirectories(f); pokazuje pliki w folderze
                } else {
                    System.out.println("  plik " + f.getAbsolutePath());
                }
            }
    }

}

/*Rekurencja bywa przydatna w sytuacji, gdy przegl�damy zbiory drzewiaste lub oczywist� 
 * implementacj� algorytmu jest w�a�nie wywo�ywanie metody przez sam� siebie. 
 * Nale�y jednak uwa�a� przede wszystkim na fakt mocno ograniczonej pami�ci stosu. 
 * Wi�kszo�� metod rekurencyjnych mo�na zapisa� w formie wykorzystuj�cej rekurencj� ogonow� lub te� przerobi� na zwyk�� form� iteracyjn� (z wykorzystaniem p�tli).
 

Je�eli wiesz, �e mo�esz unikn�� rekurencji, to dobrym pomys�em jest to zrobi�, nawet je�li kod b�dzie przez to sporo d�u�szy.

*/