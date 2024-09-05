public class Zaopin extends Mouse implements Printable{
    private String sensorModel;
    private int maxDPI;

    public Zaopin(String sensorModel, int maxDPI) {
        this.sensorModel = sensorModel;
        this.maxDPI = maxDPI;
    }

    @Override
    public void print() {
        System.out.println("Sensor: " + sensorModel);
        System.out.println("Max DPI: " + maxDPI );
    }
}
