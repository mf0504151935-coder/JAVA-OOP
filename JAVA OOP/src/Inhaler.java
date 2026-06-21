public class Inhaler extends Medicine{

    private int amountOfClick;

    //setters
    public void setAmountOfClick(int amountOfClick) {
        this.amountOfClick = amountOfClick;
    }
    //getters
    public int getAmountOfClick() {
        return amountOfClick;
    }
    //contractor

    public Inhaler() {
    }
    public Inhaler(String medicineName, String companyName, String companyEmail, double price, int quantity, int expirationYear, MedicineType type, int amountOfClick) {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear, type);
        setAmountOfClick(amountOfClick);
    }

    //methode
    public void printInhaler(){
        super.printMedicine();
        System.out.println("amountOfClick-"+" "+amountOfClick);
    }

    @Override
    public void totalInventory() {
        int totalAmountI=getQuantity()*getAmountOfClick();
        System.out.println("totalAmountOfInhalers-"+" "+totalAmountI);

    }

    @Override
    public void inStock() {

    }


}

