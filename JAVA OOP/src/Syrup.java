public class Syrup extends Medicine {

    private int bottleContent;
    //setters

    public void setBottleContent(int bottleContent) {
        this.bottleContent = bottleContent;
    }



    //getters
    public double getBottleContent() {
        return bottleContent;
    }

    //contractor


    public Syrup() {
    }

    public Syrup(String medicineName, String companyName, String companyEmail, double price, int quantity, int expirationYear, MedicineType type, double bottleContent) {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear, type);
        setBottleContent((int) bottleContent);
    }

    //methode
    public void printSyrup() {
        super.printMedicine();
        System.out.println("bottleContent-" + " " + bottleContent);
    }

    @Override
    public void totalInventory() {
        int totalAmountS = getQuantity() * bottleContent;
        System.out.println("totalAmountOfSyrup-"+" "+totalAmountS);
    }

    @Override
    public void inStock() {

    }
}
