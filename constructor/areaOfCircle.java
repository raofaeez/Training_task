public class areaOfCircle {
    static class area{
        double rad;
        area(double r){
            rad=r;
        }
        public double ar(double rad){
            return 3.14*rad*rad;
        }
        public double circum(double rad){
            return (2*(3.14)*rad);
        }
    }
    public static void main(String[] args) {
        area c1=new area(5);
        System.out.println(c1.ar(c1.rad));
        System.out.println(c1.circum(c1.rad));
    }
}
