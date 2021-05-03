package comp370.emailChecker;

public class EmailChecker {
    static String password;

    public static void main (String[] args)
    {
        System.out.println(EmailChecker1("~hello!3234?23"));
    }


    public static boolean EmailChecker1(String password1 )
    {
        password = password1;
        Character[] symbols = {'~','!', '#','$','%' ,'^' ,'*' ,'-' ,'_' ,'=' ,'+', '[' ,'{', ']', '}' ,'/' ,';' , ':' , '.', '?'};



        if (password.length() <= 9)
        {
            System.out.println("Email needs more then 9 characters");
            return false;
        }

        for(int e = 0; e < password.length(); e++)
        {
            if(password.charAt(e) == ' ') {
                System.out.println("No spaces allowed in the email address.");
                return false; }
        }

        int num = 0;
        for(int i = 0; i < password.length(); i++)
        {
            for(int m = 0; m < symbols.length; m++)
            {
                if(symbols[m] == password.charAt(i))
                {
                    num++;

                }
            }
        }
        if(num <= 2)
        {
            System.out.println("You need more unique characters for this email");
            return false;
        }
        return true;
    }
}


