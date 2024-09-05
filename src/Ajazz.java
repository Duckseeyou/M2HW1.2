public class Ajazz extends Mouse implements Printable{
    private String encoderModel;
    private int weight;

    public Ajazz(String encoderModel, int weight) {
        this.encoderModel = encoderModel;
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println("Encoder: " + encoderModel);
        System.out.println("Weight: " + weight + "g");
    }
}
