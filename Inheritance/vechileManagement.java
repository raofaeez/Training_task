interface Refuelable{
void refuel();
}
class Vehicle{
    int maxSpeed;
    String model;
    Vehicle(int m,String mo){
        maxSpeed=m;
        model=mo;
    }
}
class ElectricVehicle extends Vehicle{

    ElectricVehicle(int m,String mo){super(m,mo);}
        void charge(){
            System.out.println("Charging");
        }
    }
    class PetrolVehicle extends Vehicle implements Refuelable{
        PetrolVehicle(int m,String mo){
            super(m,mo);
        }
        public void refuel(){
            System.out.println("Refueling");
        }
}
public class vechileManagement{
    public static void main(String[]args){
        Refuelable v=new PetrolVehicle(180,"Sedan");
        v.refuel();
    }
}
