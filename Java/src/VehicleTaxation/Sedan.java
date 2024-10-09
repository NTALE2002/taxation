package VehicleTaxation;

public class Sedan extends AbstractVehicle{
    double WHT;
    double ID;
    double VAT;
    double IL;
    int DPS;
    double EngineCapacityTax;
    double AgeOfCarTax;
    double GrossWeightTax;
    public Sedan(int CIF, int seatingCapacity, int grossWeight, int engineCapacity, int year_Of_manufacture) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, year_Of_manufacture);
        this.DPS=700000;
        this.ID=0.25*this.CIF;
        this.VAT=0.18*this.CIF;
        this.WHT=0.06*this.CIF;
        this.IL=150000;
        this.EngineCapacityTax=getEngineCapacityTax();
        this.AgeOfCarTax=getAgeOfCarTax();
        this.GrossWeightTax=getGrossWeightTax();

    }

    public double getGrossWeightTax() {
        GrossWeightTax=grossWeight>1500&&grossWeight<2000?(10*CIF)/100
                :grossWeight>2000?(15*CIF)/100:grossWeight<1500?(2*CIF)/100:0;
        return GrossWeightTax;
    }

    public double getAgeOfCarTax() {
        AgeOfCarTax=age_Of_Car<15&&age_Of_Car>10?(10*CIF)/100+IL:
                age_Of_Car<10&& age_Of_Car>5?(5*CIF)/100+IL:age_Of_Car<5?IL+(1.5*CIF)*100:0;


        return AgeOfCarTax;
    }

    public double getEngineCapacityTax() {
        EngineCapacityTax=engineCapacity>2000?(10*CIF)/100:
                engineCapacity>1500&&engineCapacity<2000?(5*CIF)/100:
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
        System.out.println("GrossWeightTax: " + getGrossWeightTax()+ "tons");
        System.out.println("WHT: " + WHT + "\n" +
                "ID " + ID + "\n" +
                "VAT:" + VAT + "\n" +
                "IL +" + IL + "\n" +
                "DPS:" + this.DPS);

    }

}
