import java.util.*;
class Start_up
{
    public int start()
    {
        Scanner sc=new Scanner(System.in);
        int w;
        System.out.println("\t\t\t\t\t\t   W.E.L.C.O.M.E\n\t\t\t\t\t\t   -------------");
        System.out.println("\t\t\t\t\t\t      Press \n\t\t\t\t\t\t     1-Start\n       \t\t\t\t\t\t     2-Exit");
        try
        {
            w=sc.nextInt();
        }
        catch(InputMismatchException nfe)
        {
            w=3;
        }
        return w;
    }
}
