package arraypart2;

public class FibonacciNumber {
    public static void main(String[] args) {
        int num = 10,firstnum = 0,secondnum = 1;
        System.out.println("fibonacci starting 10 num");
        for(int i =1;i<num;i++){
            System.out.print(firstnum +" " );
            int nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;

        }
    }
}
