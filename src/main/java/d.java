import java.util.ArrayList;

class Print {
    int x = 10;

    public int getX() {
        return x;
    }
}

public class d {
    public static void main(String[] args) {


        Print myPrint = new Print();
        System.out.println(Print.class.getName());
        System.out.println(myPrint.getClass().getName());
    }
}
