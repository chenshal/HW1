public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x>=3){
            System.out.println("The first " + x + " Fibonacci numbers are:");
            int fib = 1;
            int prevFib = 0;
            int numOdd = 1;
            System.out.print("1 ");
            for (int i = 1; i < x; i++) {
                fib = fib + prevFib;
                prevFib = fib - prevFib;
                if (i < x-1) 
                    System.out.print(fib +" "); 
                else
                    System.out.println(fib); 
                if (fib % 2 != 0)
                    numOdd++;
            }
            System.out.println("The number of odd numbers is: " + numOdd);

        }
    }
}
