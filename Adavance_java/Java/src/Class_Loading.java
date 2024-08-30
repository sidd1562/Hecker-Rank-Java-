import static java.lang.Class.forName;

public class Class_Loading {

    public static void main(String[] args) {
        try{
            Class.forName("Light.light_main.TestLight");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
