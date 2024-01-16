import java.util.*;
class Intro
{
    public int intro()
    {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("\t\t\t\t\t\t   W.E.L.C.O.M.E\n\t\t\t\t\t\t   -------------");
        System.out.println("\t\t\t\t\t\t      Press \n\t\t\t\t\t\t     1-Start\n       \t\t\t\t\t\t     2-Exit");
        try
        {
        
             x=sc.nextInt();
        }
        catch(InputMismatchException nfe)
        {
            x=3;
        }
        return x;
    }
}