package Light.lightApp_java;

public class LEDLight implements Iswich{
    @Override
    public void on() {
        System.out.println("TubeLight ON");
    }

    @Override
    public void off() {
        System.out.println("TubeLight OFF");
    }
}
