package ed3s6_ejemplo2;


public class ED3S6_Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public void suma(){
    int a=6;
    int b=1;
    int c=a+b;
    System.out.println("la suma de a+b es: " + c);
    mensaje();
    }
    
    private void mensaje(){
    System.out.println("Bienvenido, Programando ED");
    }
    
    public static void main(String[] args) {
        ED3S6_Ejemplo2 obj = new ED3S6_Ejemplo2();
        obj.suma();
        obj.mensaje();
    }
    
}
