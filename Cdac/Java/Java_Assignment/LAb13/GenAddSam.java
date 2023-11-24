

public class GenSample {

    // Existing generic method show
    public <T> void show(T param) {
        System.out.println("The param is: " + param);
    }

    // Existing generic method display
    public <T1, T2> void display(T1 param1, T2 param2) {
        System.out.println("display is called with: " + param1 + " & " + param2);
    }

    // New generic method
    public <T1, T2> void genericMethod(T1 param1, T2 param2) {
        System.out.println("Generic method is called with: " + param1 + " & " + param2);
    }

    public void normal() {
        System.out.println("I'm normal");
    }
}