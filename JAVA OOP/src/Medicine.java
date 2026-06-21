public abstract class Medicine {
    private String medicineName;

    private String companyName;

    private String companyEmail;

    private double price;

    private int quantity;

    private int expirationYear;

    private MedicineType type;


    enum MedicineType {
        PILLS, SYRUP, INHALER
    }

    //setters

    public void setMedicineName(String medicineName) {
        if (medicineName!=null)
        this.medicineName = medicineName.toUpperCase();
        else
            this.medicineName=null;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setType(MedicineType type) {
        this.type = type;
    }


    //getters


    public String getMedicineName() {
        return medicineName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public MedicineType getType() {
        return type;
    }

    //constructors


    public Medicine() {
    }

    public Medicine(String medicineName, String companyName, String companyEmail, double price, int quantity, int expirationYear, MedicineType type) {
        setMedicineName(medicineName);
        setCompanyName(companyName);
        setCompanyEmail(companyEmail);
        setPrice(price);
        setQuantity(quantity);
        setExpirationYear(expirationYear);
        setType(type);


    }

    //print(),

    public void printMedicine(){
        System.out.println("medicineName-"+" "+medicineName+" "+"companyName-"+" "+companyName+" "+"companyEmail-"+companyEmail+" "+"price-"+price+" "+"quantity-"+quantity+" "+"expirationYear-"+expirationYear+" "+"medicine type-"+type);
    }

    public abstract void totalInventory();

    public abstract void inStock();


    }












