package Light.lightApp_java;

public class Light_Factory  {

   public static Iswich getLight(String type){

       if(type.equalsIgnoreCase("TubeLight")){
           return new TubeLight();
       }else if(type.equalsIgnoreCase("LEDLight")){
           return new LEDLight();
       }else{
           System.out.println("NO Such light Found");
           return null;
       }
   }

}
