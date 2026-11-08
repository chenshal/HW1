public class Assignment01Q01 {
    public static void main(String[] args) {
        String user_input = System.console().readLine("Enter a string");
        boolean space = true;
        for (int i = 0; i < user_input.length(); i++) 
        {
            if (user_input.charAt(i) == ' ')
            {
                space = true;
            }
            else
            {
                if (space & user_input.charAt(i) % 5 ==0)
                {
                    System.out.println(user_input.charAt(i));
                    space = false;
                }
            }
        }


    }
}