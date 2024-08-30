package Light.lightApp_java;

public class TubeLight implements Iswich{
    @Override
    public void on() {
        System.out.println("LED Light ON");
    }

    @Override
    public void off() {
        System.out.println("LED Light OFF");
    }

}
