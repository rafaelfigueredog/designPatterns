public class Singleton {
 
    private static Singleton uniqueInstance;
    private static int countChamadas = 0; 
 
    private Singleton() {
        
    }
 
    public static synchronized Singleton getInstance() {
        System.out.println(++countChamadas); 
        if (uniqueInstance == null)
            uniqueInstance = new Singleton(); 
        return uniqueInstance;
    }


    // Driver Programm 

    public static void main(String[] args) {
        Singleton[] arr = new Singleton[10]; 
        for(int i = 0; i < 10; i++) {
            arr[i] = Singleton.getInstance(); 
        }
    }

}

