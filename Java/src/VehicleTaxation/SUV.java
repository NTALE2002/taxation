package VehicleTaxation;

public class SUV extends AbstractVehicle{
    double WHT;
    double ID;
    double VAT;
    double IL;
    int APS;
    double SeatingCapacityTax;
    double AgeOfCarTax;
    double GrossWeightTax;

    public SUV(int CIF, int seatingCapacity, int grossWeight, int engineCapacity, int year_Of_manufacture) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, year_Of_manufacture);
        this.APS=300000;
        this.ID=0.25*this.CIF;
        this.VAT=0.18*this.CIF;
        this.WHT=0.06*this.CIF;
        this.IL=150000;
        this.SeatingCapacityTax=getSeatingCapacityTax();
        this.AgeOfCarTax=getAgeOfCarTax();
        this.GrossWeightTax=getGrossWeightTax();

    }
    public double getSeatingCapacityTax() {
        SeatingCapacityTax=seatingCapacity>5?(seatingCapacity-5)*350000:0;
        return SeatingCapacityTax;
    }
    public double getGrossWeightTax() {
        GrossWeightTax=grossWeight>5000?(15*CIF)/100:0;
        return GrossWeightTax;
    }

    public double getAgeOfCarTax() {
        AgeOfCarTax=age_Of_Car>1&&age_Of_Car<5?IL+(1*CIF)/100:
                age_Of_Car>5&&age_Of_Car<10?IL+(15*CIF)/100:
                        age_Of_Car>10?IL+(25*CIF)/100:0;

        return AgeOfCarTax;
    }
    @Override
    public void printAttributes() {
        super.printAttributes();
    }

    @Override
    public void printTaxes() {
        super.printTaxes();
        System.out.println("AgeOfCarTax :" + getAgeOfCarTax());
        System.out.println("EngineCapacityTax:" + getSeatingCapacityTax()+"CC");
        System.out.println("GrossWeightTax: " + getGrossWeightTax()+ "tons");
        System.out.println("WHT: " + WHT + "\n" +
                "ID " + ID + "\n" +
                "VAT:" + VAT + "\n" +
                "IL +" + IL + "\n" +
                "APS:" + this.APS);

    }


}
