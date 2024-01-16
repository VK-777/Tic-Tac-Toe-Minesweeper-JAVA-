import java.util.*;
class Game_Hub
{
    public static void main()throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int c,n=0;char a;
        _Tic_tac_toe_ obj=new _Tic_tac_toe_();
        Minesweeper obj2=new Minesweeper();
        while(true)
        {
            System.out.println("\f");
            System.out.println("\t\t\t  ________                        .__         ___.");    
            System.out.println("\t\t\t /  _____/_____    _____   ____   |  |__  __ _\\_ |__"); 
            Thread.sleep(500); 
            System.out.println("\t\t\t/   \\  ___\\__  \\  /     \\_/ __ \\  |  |  \\|  |  \\ __ \\ ");
            Thread.sleep(500);
            System.out.println("\t\t\t\\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  |   Y  \\  |  / \\_\\ \\");
            Thread.sleep(500);
            System.out.println("\t\t\t \\______  (____  /__|_|  /\\___  > |___|  /____/|___  /");
            System.out.println("\t\t\t        \\/     \\/      \\/     \\/       \\/          \\/ ");
            System.out.println("\t\t\t\t\t\tW.E.L.C.O.M.E\n\t\t\t\t\t\t   Press\n\t\t\t\t\t\t1-Minesweeper\n\t\t\t\t\t\t2-Tic Tac Toe\n\t\t\t\t\t\t3-Exit");
            try
            {
                c=sc.nextInt();
            }
            catch(InputMismatchException nfe)
            {
                c=0;
            }
            if(c==1)
            {
                System.out.println("\f");
                obj2.play2();
            }
            else if(c==2)
            {
                System.out.println("\f");
                obj.play1();
            }
            else if(c==3)
            {
                System.out.println("\t\t\t\t\t\tAre you sure(y/n)?");
                a=sc.next().charAt(0);
                if(a=='y'||a=='Y')
                    n++;
                else if(a=='n'||a=='N')
                {
                    System.out.println("\t\t\t\t\t\tRestarting program.....");
                    Thread.sleep(2000);
                }
                else
                {
                    System.out.println("\t\t\t\t\t\t\tWrong choice.....try again");
                    Thread.sleep(2000);
                }
            }
            else
            {
                System.out.println("\t\t\t\t\t\t\tWrong choice.....try again");
                Thread.sleep(2000);
            }
            if(n!=0)
            {
                System.out.println("\f\n\n");
                System.out.println("                                                                                                                                           ");
                System.out.println("TTTTTTTTTTTTTTTTTTTTTTThhhhhhh                                                kkkkkkkk                YYYYYYY       YYYYYYY                                ");
                System.out.println("T:::::::::::::::::::::Th:::::h                                                k::::::k                Y:::::Y       Y:::::Y                                ");
                System.out.println("T:::::::::::::::::::::Th:::::h                                                k::::::k                Y:::::Y       Y:::::Y                                ");
                System.out.println("T:::::TT:::::::TT:::::Th:::::h                                                k::::::k                Y::::::Y     Y::::::Y                                ");
                System.out.println("TTTTTT  T:::::T  TTTTTT h::::h hhhhh         aaaaaaaaaaaaa  nnnn  nnnnnnnn     k:::::k    kkkkkkk     YYY:::::Y   Y:::::YYYooooooooooo   uuuuuu    uuuuuu  ");
                System.out.println("        T:::::T         h::::hh:::::hhh      a::::::::::::a n:::nn::::::::nn   k:::::k   k:::::k         Y:::::Y Y:::::Y oo:::::::::::oo u::::u    u::::u  ");
                System.out.println("        T:::::T         h::::::::::::::hh    aaaaaaaaa:::::an::::::::::::::nn  k:::::k  k:::::k           Y:::::Y:::::Y o:::::::::::::::ou::::u    u::::u  ");
                System.out.println("        T:::::T         h:::::::hhh::::::h            a::::ann:::::::::::::::n k:::::k k:::::k             Y:::::::::Y  o:::::ooooo:::::ou::::u    u::::u  ");
                System.out.println("        T:::::T         h::::::h   h::::::h    aaaaaaa:::::a  n:::::nnnn:::::n k::::::k:::::k               Y:::::::Y   o::::o     o::::ou::::u    u::::u  ");
                System.out.println("        T:::::T         h:::::h     h:::::h  aa::::::::::::a  n::::n    n::::n k:::::::::::k                 Y:::::Y    o::::o     o::::ou::::u    u::::u  ");
                System.out.println("       T:::::T         h:::::h     h:::::h a::::aaaa::::::a  n::::n    n::::n k:::::::::::k                 Y:::::Y    o::::o     o::::ou::::u    u::::u  ");
                System.out.println("        T:::::T         h:::::h     h:::::ha::::a    a:::::a  n::::n    n::::n k::::::k:::::k                Y:::::Y    o::::o     o::::ou:::::uuuu:::::u  ");
                System.out.println("      TT:::::::TT       h:::::h     h:::::ha::::a    a:::::a  n::::n    n::::nk::::::k k:::::k               Y:::::Y    o:::::ooooo:::::ou:::::::::::::::uu");
                System.out.println("      T:::::::::T       h:::::h     h:::::ha:::::aaaa::::::a  n::::n    n::::nk::::::k  k:::::k           YYYY:::::YYYY o:::::::::::::::o u:::::::::::::::u");
                System.out.println("     T:::::::::T       h:::::h     h:::::h a::::::::::aa:::a n::::n    n::::nk::::::k   k:::::k          Y:::::::::::Y  oo:::::::::::oo   uu::::::::uu:::u");
                System.out.println("      TTTTTTTTTTT       hhhhhhh     hhhhhhh  aaaaaaaaaa  aaaa nnnnnn    nnnnnnkkkkkkkk    kkkkkkk         YYYYYYYYYYYYY    ooooooooooo       uuuuuuuu  uuuu   ");
                Thread.sleep(3000);
                System.exit(0);
                break;
            }
        }
    }
}