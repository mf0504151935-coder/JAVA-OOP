public class Pills extends Medicine{

    private int numOfPillsInBox;

    //setter

    public void setNumOfPillsInBox(int numOfPillsInBox) {
        this.numOfPillsInBox = numOfPillsInBox;
    }

    //getters

    public int getNumOfPillsInBox() {
        return numOfPillsInBox;
    }

    @Override
    public void totalInventory() {
        int totalAmountP=getQuantity()*getNumOfPillsInBox();
        System.out.println("totalAmountOfPills-"+" "+totalAmountP);

    }

    @Override
    public void inStock() {}

    //contractor

    public Pills() {}

    public Pills(String medicineName, String companyName, String companyEmail, double price, int quantity, int expirationYear, MedicineType type, int numOfPillsInBox) {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear, type);
        setNumOfPillsInBox(numOfPillsInBox);
    }

    //methods
    public void printPills(){
        super.printMedicine();
        System.out.println("numOfPillsInBox-"+" "+numOfPillsInBox);
    }
}
