package innerClass;


/* Klasy wewn�trzne , zagnie�d�one , lokalne,  anonimowe
 * 
 */

public class Car {
    private Engine engine;
    private int fuel;
     
    public Car() {
        engine = new Engine("Ferrari");
        System.out.println("Utworzono samoch�d z silnikiem " + engine.engineType);
    }
     
    public void go() throws InterruptedException {
        while(fuel > 0) {
            engine.consumeFuel();
            System.out.println("Pozosta�o " + fuel + " litr�w paliwa");
            Thread.sleep(1000);
        }
        System.out.println("Brak paliwa");
    }
     
    public void refuel(int liters) {
        fuel = fuel + liters;
    }
     
    public class Engine {
         
        private String engineType;
        private static final int fuelConsumption = 20;
         
        public Engine(String type) {
            engineType = type;
        }
         
        public void consumeFuel() {
            fuel = fuel - fuelConsumption;
        }
    }
}


/*
 Klasy zagnie�d�one : 
 
  
  public class Car {
 
    
    public static class Engine {
        int fuel;
         
        void consumeFuel() {
            this.fuel = 5;
        }
    }
}
Obiekt powy�szej klasy zagnie�d�onej utworzymy w nast�puj�cy spos�b:


Car.Engine eng = new Car.Engine();

*/

/* Klasy lokalne 
 * 
 * Mo�na je zagnie�dzi� nawet w metodach i w takich sytuacjach nazywa� b�dziemy je klasami lokalnymi. 
 * W odr�nieniu od klas wewn�trznych maj� one jednak du�o wi�cej ogranicze�. 
 * S� one raczej niespotykane, jednak jest to jedno z zagadnie� certyfikuj�cych , 
 * wi�c dla samej �wiadomo�ci ich istnienia wypada o tym wspomnie�.

klasy lokalne nie mog� mie� specyfikator�w dost�pu (public, private protected), 
nie mog� by� statyczne (static). 
Mog� by� jednak abstrakcyjne (abstract) i finalne (final), 
jednak nie mog� ��czy� tych dw�ch s��w kluczowych w deklaracji
klasy lokalne mog� korzysta� z p�l klasy otaczaj�cej, 
ale je�li korzystaj� z p�l lokalnych metody to zmienne te musz� by� oznaczone 
jako final. 
Od Javy w wersji 8 mo�liwe jest tak�e stosowanie zmiennych efektywnie finalnych - 
tzn. zmiennych, kt�re s� raz zainicjowane i nie zmieniaj� p�niej swojej warto�ci, a w szczeg�lno�ci nie zmieniaj� swojej warto�ci wewn�trz klasy lokalnej.

public class Outer {
    private int x;
     
    public void doSometing() {
        int localVar = 5;
         
        class Inner {
            public void innerMethod() {
                x = 5;
                System.out.println(localVar);
            }
        }
    }
}


 * 
 */


/* Klasy anonimowe
 * 
 * 
 */

