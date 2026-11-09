public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0.0;
        boolean minus = false; 
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i<n; i++)
        {
            if (minus == false)
            {
                approxPi += (double)(1.0/(2*i+1));
                minus = true;
            }
            else
                if (minus == true)
                {
                    approxPi -= (double)(1.0/(2*i+1));
                    minus = false;
                }
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
