package typyEnum;

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);
     
    private boolean tomatoSauce;
    private boolean cheese;
    private boolean mushrooms;
    private boolean ham;
    
    public boolean getTomatoSauce() {
        return tomatoSauce;
    }
     
    public boolean getCheese() {
        return cheese;
    }
     
    public boolean getMushrooms() {
        return mushrooms;
    }
     
    public boolean getHam() {
        return ham;
    }
     
    Pizza(boolean ts, boolean ch, boolean m, boolean h) {
        tomatoSauce =ts;
        cheese = ch;
        mushrooms = m;
        ham = h;
    }
     
    @Override
    public String toString() {
        //przypisanie nazwy pizzy
        String result = this.name() + "(";
        //informacja o sk³adnikach
        if(tomatoSauce) {
            result = result + "sos pomidorowy";
        }
        if(cheese) {
            result = result + ", ser";
        }
        if(mushrooms) {
            result = result + ", pieczarki";
        }
        if(ham) {
            result = result + ", szynka";
        }
        result = result + ")";
         
        return result;
    }

    

	
	

}
