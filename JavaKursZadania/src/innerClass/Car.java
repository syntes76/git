package innerClass;


/* Klasy wewnêtrzne , zagnie¿d¿one , lokalne,  anonimowe
 * 
 */

public class Car {
    private Engine engine;
    private int fuel;
     
    public Car() {
        engine = new Engine("Ferrari");
        System.out.println("Utworzono samochód z silnikiem " + engine.engineType);
    }
     
    public void go() throws InterruptedException {
        while(fuel > 0) {
            engine.consumeFuel();
            System.out.println("Pozosta³o " + fuel + " litrów paliwa");
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
 Klasy zagnie¿d¿one : 
 
  
  public class Car {
 
    
    public static class Engine {
        int fuel;
         
        void consumeFuel() {
            this.fuel = 5;
        }
    }
}
Obiekt powy¿szej klasy zagnie¿d¿onej utworzymy w nastêpuj¹cy sposób:


Car.Engine eng = new Car.Engine();

*/

/* Klasy lokalne 
 * 
 * Mo¿na je zagnieŸdziæ nawet w metodach i w takich sytuacjach nazywaæ bêdziemy je klasami lokalnymi. 
 * W odró¿nieniu od klas wewnêtrznych maj¹ one jednak du¿o wiêcej ograniczeñ. 
 * S¹ one raczej niespotykane, jednak jest to jedno z zagadnieñ certyfikuj¹cych , 
 * wiêc dla samej œwiadomoœci ich istnienia wypada o tym wspomnieæ.

klasy lokalne nie mog¹ mieæ specyfikatorów dostêpu (public, private protected), 
nie mog¹ byæ statyczne (static). 
Mog¹ byæ jednak abstrakcyjne (abstract) i finalne (final), 
jednak nie mog¹ ³¹czyæ tych dwóch s³ów kluczowych w deklaracji
klasy lokalne mog¹ korzystaæ z pól klasy otaczaj¹cej, 
ale jeœli korzystaj¹ z pól lokalnych metody to zmienne te musz¹ byæ oznaczone 
jako final. 
Od Javy w wersji 8 mo¿liwe jest tak¿e stosowanie zmiennych efektywnie finalnych - 
tzn. zmiennych, które s¹ raz zainicjowane i nie zmieniaj¹ póŸniej swojej wartoœci, a w szczególnoœci nie zmieniaj¹ swojej wartoœci wewn¹trz klasy lokalnej.

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

