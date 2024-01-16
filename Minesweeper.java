import java.util.*;
class Minesweeper
{
    public void play2()throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int abc;
        Title ob=new Title();
        Intro obj=new Intro();
        Setup obj1=new Setup();
        while (true)
        {
            ob.title();
            abc=obj.intro();
            if(abc==2)
            {
                System.out.println("\t\t\t\t\t\t  Are You Sure?(y/n)");
                char b=sc.next().charAt(0);
                if (b=='y'||b=='Y')
                {
                    System.out.println("\t\t\t\t\t\tTHANK YOU FOR PLAYING.");
                    break;
                }
                else if (b!='n'||b!='N')
                {
                    System.out.println("\t\t\t\t\t   Wrong Choice...\n\t\t\t\t\t   Please enter correct option\n\n\n");
                    Thread.sleep(2000);
                    System.out.print("\f");
                }
            }
            else if(abc==1)
                obj1.start();
            else if(abc==3)
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