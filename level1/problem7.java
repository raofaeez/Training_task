package level1;

public class problem7 {
    public static void main(String[] args) {

        double radKm = 6378;

        
        double pi = Math.PI;

        
        double volKm = (4.0 / 3.0) * pi * radKm * radKm * radKm;

        double radM = radKm / 1.6;

        // Volume in cubic miles
        double volumeMiles = (4.0 / 3.0) * pi * radM * radM * radM;

        System.out.println(
            "The volume of earth in cubic kilometers is " + volKm +
            " and cubic miles is " + volumeMiles
        );
    }
}
