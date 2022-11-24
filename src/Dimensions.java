public class Dimensions {

    private final double hight; // высота
    private final double lendt; // длина
    private final double wight; // ширина
    // ширина высота и длина
    public Dimensions(double hight, double lendt, double wight){
        this.hight = hight;
        this.lendt = lendt;
        this.wight = wight;
    }
    public double getHight(){
        return hight;
    }

    public double getLendt() {
        return lendt;
    }

    public double getWight() {
        return wight;
    }

    @Override
    public String toString() {
        return "Dimensions{" +
                "hight=" + hight +
                ", lendt=" + lendt +
                ", wight=" + wight +
                '}';
    }
    public Dimensions setLendt(double lendt){
        return new Dimensions(hight,lendt,wight);
    }
    public Dimensions setHight(double hight){
        return new Dimensions(hight,lendt,wight);
    }
    public Dimensions setWight(double wight){
        return new Dimensions(hight,lendt,wight);
    }

    public double volume(){
        return(hight * lendt * wight);
    }
}
