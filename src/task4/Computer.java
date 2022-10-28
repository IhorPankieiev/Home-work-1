package task4;


public class Computer {

    int[] computers = new int[5];

    void computer (){
        for (int i = 0; i < computers.length; i++){
            computers[i] = (int)((Math.random() * 30) - 10);
            System.out.print(" " + computers[i]);
        }
        System.out.println();
    }

}
