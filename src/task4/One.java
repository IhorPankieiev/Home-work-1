package task4;

public class One {
    public static void main(String[] args) {
        Computer obj1 = new Computer();
        Computer obj2 = new Computer();
        Computer obj3 = new Computer();
        Computer obj4 = new Computer();
        Computer obj5 = new Computer();

        for (int i = 0; i < obj1.Computers.length; i++){
            System.out.print(" " + obj1.Computers[i]);
        }
        System.out.println();

        for (int i = 0; i < obj2.Computers.length; i++){
            System.out.print(" " + obj2.Computers[i]);
        }
        System.out.println();

        for (int i = 0; i < obj3.Computers.length; i++){
            System.out.print(" " + obj3.Computers[i]);
        }
        System.out.println();

        for (int i = 0; i < obj4.Computers.length; i++){
            System.out.print(" " + obj4.Computers[i]);
        }
        System.out.println();

        for (int i = 0; i < obj5.Computers.length; i++){
            System.out.print(" " + obj5.Computers[i]);
        }
        System.out.println();

    }
}
