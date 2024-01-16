import java.util.*;
class _Tic_tac_toe_
{
    public void play1()throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int a;
        Display ob=new Display();
        Start_up obj=new Start_up();
        Setup2 obj1=new Setup2();
        while (true)
        {
            ob.display();
            a=obj.start();
            if(a==2)
            {
                System.out.println("\t\t\t\t\t\t  Are You Sure?(y/n)");
                char b=sc.next().charAt(0);
                if (b=='y'||b=='Y')
                {
                    System.out.println("\t\t\t\t\t\tTHANK YOU FOR PLAYING.");
                    break;
                }
                else if(b=='n'||b=='N')
                {
                    System.out.println("\t\t\t\t\t\t    Restarting the Program.....");
                }
                else if (b!='n'||b!='N')
                {
                    System.out.println("\t\t\t\t\t   Wrong Choice...\n\t\t\t\t\t   Please enter correct option\n\n\n");
                }
            }
            else if(a==1)
                {
                    obj1.startgame();
                }
            else if(a==3)
            {
                System.out.println("\t\t\t\t\t\t   Wrong Choice...\n\t\t\t\t\t   Please enter correct option\n\n\n");
                Thread.sleep(2000);
                System.out.print("\f");
            }
            else 
            {
                System.out.println("\t\t\t\t\t\t   Wrong Choice...\n\t\t\t\t\t   Please enter correct option\n\n\n");
                Thread.sleep(2000);
                System.out.print("\f");         
            } 
        }
    }
}