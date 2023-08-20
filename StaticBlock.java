public class StaticBlock{
    static {
        System.out.println("This is exicuted before the main method");
    }

public static void main(String[] args) {
    System.out.println("This is exicuted the main method");
}
}