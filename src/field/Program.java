package field;

public class Program {
    public static void main(String[] args) {


        Field field1 = new Field();

        field1.buildGame();
        field1.printGame();
        System.out.println("##############");
        field1.buildField();
        System.out.println("##############");

    }
}
