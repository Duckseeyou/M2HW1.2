public class Main {
    public static void main(String[] args) {
        Mouse mouse1 = createObject("Zaopin");
        Mouse mouse2 = createObject("Ajazz");
        Mouse mouse3 = createObject("Darmoshark");
        Mouse[] mice = {mouse1, mouse2, mouse3};
        for (int i = 0; i < mice.length; i++) {
            mice[i].print();
        }
    }
    public static Mouse createObject(String className){
        Mouse mouse = new Mouse();
        switch (className){
            case "Zaopin":
                mouse = new Zaopin("PAW3395", 26000);
                break;
            case "Ajazz":
                mouse = new Ajazz("TTC Gold", 59);
                break;
            case "Darmoshark":
                mouse = new Darmoshark("TTC Gold", 500);
                break;
        }
        return mouse;
    }
}