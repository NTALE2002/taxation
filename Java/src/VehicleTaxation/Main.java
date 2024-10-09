package VehicleTaxation;

public class Main {
    public static void main(String[] args) {
        Ambulance ambulance=new Ambulance(500000,12,54,
                65,2014);


        Estate estate=new Estate(900000,7,700,
                67,2020);

        Sedan sedan=new Sedan(1000000,6,600,
                1600,2012);


        SUV suv=new SUV(8900000,6,5000,678,2010);
       Trailer trailer=new Trailer(990000,6,450,1900,1997);

        ambulance.printAttributes();
        ambulance.printTaxes();
        System.out.println("\n");

        estate.printAttributes();
        estate.printTaxes();
        System.out.println("\n");

        suv.printAttributes();
        suv.printTaxes();
        System.out.println("\n");

        trailer.printAttributes();
        trailer.printTaxes();
        System.out.println("\n");

        estate.printAttributes();
        estate.printTaxes();
        System.out.println("\n");

















    }

}
