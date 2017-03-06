package rekurencja;

import java.io.File;
/*
 * Przyk³ad listowania drzewa katalogów

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

/*Rekurencja bywa przydatna w sytuacji, gdy przegl¹damy zbiory drzewiaste lub oczywist¹ 
 * implementacj¹ algorytmu jest w³aœnie wywo³ywanie metody przez sam¹ siebie. 
 * Nale¿y jednak uwa¿aæ przede wszystkim na fakt mocno ograniczonej pamiêci stosu. 
 * Wiêkszoœæ metod rekurencyjnych mo¿na zapisaæ w formie wykorzystuj¹cej rekurencjê ogonow¹ lub te¿ przerobiæ na zwyk³¹ formê iteracyjn¹ (z wykorzystaniem pêtli).
 

Je¿eli wiesz, ¿e mo¿esz unikn¹æ rekurencji, to dobrym pomys³em jest to zrobiæ, nawet jeœli kod bêdzie przez to sporo d³u¿szy.

*/