public class Assignment01Q01 {
    public static void main(String[] args) {
        if (args.length == 0)
        {
            System.out.println("No input");
            return;
        }
        for (int i = 0; i < args.length; i++) 
        {
              String str = args[i];

            if (str.charAt(0)%5 == 0)
            {
                System.out.println(str.charAt(0));
            }
        }


    }
}