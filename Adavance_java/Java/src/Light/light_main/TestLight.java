package Light.light_main;

import Light.lightApp_java.*;

import java.util.Scanner;

public class TestLight {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Light");
        String val = scanner.nextLine();
        Iswich sw = Light_Factory.getLight(val);
        if(sw!= null){
            sw.on();
            sw.off();
        }
    }

}
