import java.util.Scanner;

public class MyMain {

    public static int someMethod() {
        return 1;
    }

    public static int[] threeNums(){
        int[] random = new int[3];
        for (int i = 0; i < 3; i++){
            random[i] = (int)(Math.random()*11)+10;
        }
        return random;
    }
    public static void main(String[] args) {
        int[] random = threeNums();
        System.out.println("The three random numbers are " + random[0] + ", " + random[1] + ", " + random[2]);
        System.out.println("The largest number is " + Math.max(random[2],Math.max(random[0],random[1])));
        System.out.println("The smallest number is " + Math.min(random[2],Math.min(random[0],random[1])));
    }

}


