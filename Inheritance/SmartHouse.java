class Device{
int deviceId;
String status;
    Device(int d,String s){
        deviceId=d;
        status=s;
    }
    void displayStatus(){
        System.out.println(deviceId+" "+status);
    }
}
class Thermostat extends Device{
    int temperatureSetting;
    Thermostat(int d,String s,int t){
        super(d,s);
        temperatureSetting=t;
    }
    void displayStatus(){
        System.out.println(deviceId+" "+status+" "+temperatureSetting);
    }
}
public class SmartHouse{
    public static void main(String[]args){
        Thermostat t=new Thermostat(101,"ON",24);
        t.displayStatus();
    }
}
