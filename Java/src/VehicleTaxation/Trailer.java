package VehicleTaxation;

public class Trailer extends AbstractVehicle {
    double WHT;
    double ID;
    double VAT;
    double IL;
    int APS;
    double EngineCapacityTax;
    double AgeOfCarTax;
    double GrossWeightTax;

    public Trailer(int CIF, int seatingCapacity, int grossWeight, int engineCapacity, int year_Of_manufacture) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, year_Of_manufacture);
        this.APS=300000;
        this.ID=0.25*this.CIF;
        this.VAT=0.18*this.CIF;
        this.WHT=0.06*this.CIF;
        this.IL=150000;
        this.EngineCapacityTax=getEngineCapacityTax();
        this.AgeOfCarTax=getAgeOfCarTax();
        this.GrossWeightTax=getGrossWeightTax();

    }

    public double getGrossWeightTax() {
        GrossWeightTax=grossWeight>15000&&grossWeight<20000?(15*CIF)/100
                :grossWeight>20000?(25*CIF)/100:grossWeight<15000?(5*CIF)/100:0;
        return GrossWeightTax;
//        GrossWeightTax=grossWeight>5000?(15*CIF)/100:0;
//        return GrossWeightTax;
    }

    public double getAgeOfCarTax() {
//        AgeOfCarTax=age_Of_Car>1&&age_Of_Car<5?IL+(1*CIF)/100:
//                age_Of_Car>5&&age_Of_Car<10?IL+(15*CIF)/100:
//                        age_Of_Car>10?IL+(25*CIF)/100:0;
        AgeOfCarTax=age_Of_Car<15&&age_Of_Car>10?IL+(10*CIF)/100:age_Of_Car>5&&age_Of_Car<10?
                IL+(5*CIF)/100:age_Of_Car<5?IL+(1.5*CIF)/100:0;
        return AgeOfCarTax;
    }
    public double getEngineCapacityTax() {
        EngineCapacityTax=engineCapacity>20000?(10*CIF)/100:
                engineCapacity>15000&&engineCapacity<20000?(5*CIF)/100:
                        engineCapacity<1500?(2.5*CIF)/100:0;
        return EngineCapacityTax;
    }
    @Override
    public void printAttributes() {
        super.printAttributes();
    }

    @Override
    public void printTaxes() {
        super.printTaxes();

        System.out.println("AgeOfCarTax :" + getAgeOfCarTax());
        System.out.println("EngineCapacityTax:" + getEngineCapacityTax()+"CC");
        System.out.println("GrossWeightTax: " + getGrossWeightTax()+" tons");
        System.out.println("WHT: " + WHT + "\n" +
                "ID " + ID + "\n" +
                "VAT:" + VAT + "\n" +
                "IL:" + IL + "\n" +
                "APS:" + this.APS);

    }

}
