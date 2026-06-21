import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Medicine> inventory=new ArrayList<Medicine>();

       Syrup s1=new Syrup("Acamol","Teva","teav@teav.co.il",43.5,80,2030, Medicine.MedicineType.SYRUP,75);
       Syrup s2=new Syrup();
       Syrup s3=new Syrup("Nurofen","Teva","teav@teav.co.il",62.4,90,2032, Medicine.MedicineType.SYRUP,40);

       Pills p1=new Pills("Advil","Azurew","azurew@zurew.co.il",45.3,158,2029, Medicine.MedicineType.PILLS,100);
       Pills p2=new Pills();
       Pills p3=new Pills("Tams","Azurew","azurew@zurew.co.il",35.9,100,2028, Medicine.MedicineType.PILLS,80);

       Inhaler i1=new Inhaler("Ventolin","Fizer","fizer@fizer.co.il",30.9,200,2033, Medicine.MedicineType.INHALER,50 );
       Inhaler i2=new Inhaler();
       Inhaler i3=new Inhaler("Diskus","Fizer","fizer@fizer.co.il",60.9,150,2032, Medicine.MedicineType.INHALER,50);

       inventory.add(s1);
       inventory.add(s2);
       inventory.add(s3);
       inventory.add(p1);
       inventory.add(p2);
       inventory.add(p3);
       inventory.add(i1);
       inventory.add(i2);
       inventory.add(i3);

        for (Medicine the_medicine:inventory) {
            the_medicine.printMedicine();

        }

        s1.totalInventory();
        s2.totalInventory();
        s3.totalInventory();

        p1.totalInventory();
        p2.totalInventory();
        p3.totalInventory();

        i1.totalInventory();
        i2.totalInventory();
        i3.totalInventory();







        }




    }


