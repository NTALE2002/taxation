package VehicleTaxation;

import java.time.Year;

abstract public class AbstractVehicle {
    int CIF;
    int seatingCapacity;
    int grossWeight; //in Tons
    int engineCapacity; //Measure in CC
    int age_Of_Car; //derived from year of manufactures
    int year_Of_manufacture;


    int SD;
    int FF;
    int ED;

    public AbstractVehicle(int CIF, int seatingCapacity, int grossWeight,
                           int engineCapacity,
                           int year_Of_manufacture) {
        this.CIF = CIF;
        this.seatingCapacity = seatingCapacity;
        this.grossWeight = grossWeight;
        this.engineCapacity = engineCapacity;
        this.year_Of_manufacture = year_Of_manufacture;
        this.SD = 35000;
        this.FF = 20000;
        this.ED = 200000;
        this.age_Of_Car = calcCarAge();
    }

  public int calcCarAge(){
        return Year.now().getValue()-this.year_Of_manufacture;
    }

public void printAttributes(){
    System.out.println(getClass().getName());
    System.out.println( "CIF: "+this.CIF);
    System.out.println( "SeatCapacity: "+this.seatingCapacity);
    System.out.println( "GrossWeight: "+this.grossWeight);
    System.out.println( "EngineCapacity: "+this.engineCapacity);
    System.out.println( "AgeOfCar: "+this.age_Of_Car);


}
    public void printTaxes() {
        System.out.println("SD Tax: "+this.SD);
        System.out.println("FF Tax: "+this.FF);
        System.out.println("SD Tax: "+this.ED);

    }

}
