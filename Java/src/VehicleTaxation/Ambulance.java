package VehicleTaxation;

public class Ambulance extends AbstractVehicle{
    int DPS;
    int IL;
    public Ambulance(int CIF, int seatingCapacity, int grossWeight,
                     int engineCapacity, int year_Of_manufacture) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, year_Of_manufacture);
        this.DPS=700000;
        this.IL=calcIL();
    }

    public int calcIL(){
     int n= age_Of_Car>10? (int) (0.15 * this.CIF) :150000;
     return n;
    }

    @Override
    public void printAttributes() {
        super.printAttributes();

    }

    @Override
    public void printTaxes() {
        super.printTaxes();
        System.out.println("DPS: "+this.DPS);
        System.out.println("IL Tax: "+this.IL);
    }
}
