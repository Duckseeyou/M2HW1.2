public class Darmoshark extends Mouse implements Printable{
    private String SwitchesModel = "TTC Gold";
    private int batteryCapacity = 500;

    public Darmoshark(String switchesModel, int batteryCapacity) {
        SwitchesModel = switchesModel;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void print() {
        System.out.println("Switches: " + SwitchesModel);
        System.out.println("Battery: " + batteryCapacity + "mAh");
    }
}
