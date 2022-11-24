public class Cargo {
    private final Dimensions dimensions; // габариты
    private final double weight; // масса
    private final String address;
    private boolean turnOver; // переворачиваемый или нет
    private boolean fragile; // хрупкий или нет
    private final String regNumber; // буквы
    private final double lendt;
    private final double wight;
    private final double hight;

    public Cargo(double weight, String address,
                 boolean turnOver, boolean fragile, String regNumber, Dimensions dimensions, double lendt, double wight, double hight){
        this.dimensions = dimensions;
        this.weight = weight;
        this.fragile = fragile;
        this.address = address;
        this.regNumber = regNumber;
        this.turnOver = turnOver;
        this.lendt = lendt;
        this.wight = wight;
        this.hight = hight;
    }

    //public Cargo(double weight, String address, boolean turnOver, String regNumber,
//                 boolean fragile, Dimensions dimensions, double lendt, double wight, double hight) {
//    }

    public double getWeight(){
        return weight;
    }
    public String getAddress(){
        return address;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
    public boolean isFragile(){
        return fragile;
    }

    public boolean isTurnOver() {
        return turnOver;
    }


    public Cargo setWeight(double weight){
        return new Cargo(weight, address, fragile, turnOver, regNumber, dimensions, lendt, wight, hight);
    }

    public Cargo setAddress(String address){
        return new Cargo(weight,address,fragile, turnOver, regNumber, dimensions, lendt, wight, hight);
    }
    public Cargo setRegNumber(String regNumber){
        return new Cargo(weight, address, fragile, turnOver, regNumber, dimensions, lendt, wight, hight);
    }
    public Cargo setDimensions(Dimensions dimensions){
        return  new Cargo(weight, address, fragile, turnOver, regNumber, dimensions, lendt, wight, hight);
    }
    public Cargo setTurnOver(boolean turnOver){
        return new Cargo(weight, address, fragile, turnOver, regNumber, dimensions, lendt, wight, hight);
    }
    public Cargo setFragile(boolean fragile){
        return new Cargo(weight, address, fragile, turnOver, regNumber, dimensions, lendt, wight, hight);
    }
    public Cargo setLendt(double lendt){
        return new Cargo(weight, address, fragile, turnOver, regNumber, dimensions, lendt, wight, hight);
    }
    public Cargo setWight(double wight){
        return new Cargo(weight, address, fragile, turnOver, regNumber, dimensions, lendt, wight, hight);
    }
    public Cargo setHight(double hight){
        return new Cargo(weight, address, fragile, turnOver, regNumber, dimensions, lendt, wight, hight);
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "dimensions=" + dimensions +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                ", turnOver=" + turnOver +
                ", fragile=" + fragile +
                ", regNumber='" + regNumber + '\'' +
                ", lendt=" + lendt +
                ", wight=" + wight +
                ", hight=" + hight +
                '}';
    }
}
