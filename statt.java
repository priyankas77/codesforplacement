
public class statt{
    static int j=num();

    static {
        System.out.println("inside static block");
    }
    static int num(){
        System.out.println("from n static method");
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("value of j" +j);
        System.out.println("inside this main method");
    }
}