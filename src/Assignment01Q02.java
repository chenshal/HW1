public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        boolean minus = false; 
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i<n/2; i++)
        {
            if (! minus)
            {
                approxPi += 1/(2*i+1);
                minus = true;
            }
            else
            {
                approxPi -= 1/(2*i+1);
                minus = false;
            }
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
