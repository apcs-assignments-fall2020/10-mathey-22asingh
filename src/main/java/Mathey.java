public class Mathey {
    //find max of two ints
    public static int max(int x, int y){
        if (x > y){
            return x;
        }
        else{
            return y;
        }
    }
    //find max of two doubles
    public static double max(double x, double y){
        if (x > y){
            return x;
        }
        else{
            return y;
        }
    }
    //find max of three ints
    public static int max(int x, int y, int z){
        return max(x,max(y,z));
    }
    //find max of three doubles
    public static double max(double x, double y, double z){
        return max(x,max(y,z));
    }


    //find min of two ints
    public static int min(int x, int y){
        if (x < y){
            return x;
        }
        else{
            return y;
        }
    }
    //find min of two doubles
    public static double min(double x, double y){
        if (x < y){
            return x;
        }
        else{
            return y;
        }
    }
    //find min of three ints
    public static int min(int x, int y, int z){
        return min(x,min(y,z));
    }
    //find min of three doubles
    public static double min(double x, double y, double z){
        return min(x,min(y,z));
    }


    //random int between a and b
    public static int randomInteger(int a, int b){
        return (int) ((b - a + 1) * Math.random()) + a;
    }
    //random int between 0 and a
    public static int randomInteger(int a){
        return (int) ((a + 1) * Math.random());
    }

    public static void main(String[] args){
        //test max methods
        System.out.println(max(3,5));
        System.out.println(max(3.0, 7.0));
        System.out.println(max(1,2,3));
        System.out.println(max(11.0, 6.0, 7.0));
        //test min methods
        System.out.println(min(3,5));
        System.out.println(min(3.0, 7.0));
        System.out.println(min(1,2,3));
        System.out.println(min(11.0, 6.0, 7.0));
        //test random int methods
        System.out.println(randomInteger(40,60));
        System.out.println(randomInteger(30));
    }
}