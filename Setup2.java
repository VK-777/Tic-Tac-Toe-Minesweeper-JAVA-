import java.util.*;
class Setup2
{
    public void startgame()throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int ar[][]={{0,0,0},{0,0,0},{0,0,0}};
        int a2[][]={{0,0,0},{0,0,0},{0,0,0}};
        String n1,n2; int r=10,c=10,i,j,co=0,c1=0,x,c2=0,y,c3=0,c4=0;
        char z;
        while(true)
        {

            System.out.print("Player 1, Enter your name: ");
            n1=sc.next().toUpperCase();
            for(i=0;i<n1.trim().length();i++)
            {
                z=n1.charAt(i);
                if(Character.isLetter(z)||z==' ')
                    co++;
                else
                {
                    co=0;
                    break;
                }
            }
            if(co==0)
                System.out.println("ERROR.....\nInvalid name");
            else
                break;
        }
        co=0;
        while(true)
        {

            System.out.print("Player 2, Enter your name: ");
            n2=sc.next().toUpperCase();
            for(i=0;i<n2.trim().length();i++)
            {
                z=n2.charAt(i);
                if(Character.isLetter(z)||z==' ')
                    co++;
                else
                {
                    co=0;
                    break;
                }
            }
            if(co==0)
                System.out.println("\n ERROR.....\nInvalid name");
            else
                break;
        }
        co=0;
        Display obj=new Display();
        obj.display2();

        while (true)
        {
            if(c4==0)
            {
                while(true)
                {
                    c1=0;
                    System.out.println(n1+", enter no. of row and column");

                    r=sc.nextInt();
                    c=sc.nextInt();

                    if(r>3||c>3)
                    {c1++;}
                    else if(a2[r-1][c-1]==1||a2[r-1][c-1]==2)
                    {
                        c1++;
                    }
                    if(c1!=0)
                    {
                        break;
                    }

                    ar[r-1][c-1]=1;
                    a2[r-1][c-1]=1;
                    break;

                }
            }
            if(c1!=0)
            {
                System.out.println("\t\t\t\twrong choice....try again");
                Thread.sleep(1000);
            }
            System.out.print("\f\n\n\n\n");
            System.out.println("\t\t\t** * * * * ** * * * * ** * * * * **");
            for(i=0;i<=2;i++)
            {
                for(x=1;x<=5;x++)
                {
                    System.out.print("\t\t\t**"); 
                    for(j=0;j<=2;j++)
                    {

                        if(ar[i][j]==1)
                        {
                            if(x==1)
                                System.out.print("   \\  /  **");
                            else if (x==2)
                                System.out.print("    \\/   **");
                            else if (x==3)
                                System.out.print("    /\\   **");
                            else if (x==4)
                                System.out.print("   /  \\  **");
                            else if (x==5)
                                System.out.print(" * * * * **");
                        }

                        else if(ar[i][j]==2)
                        {
                            if(x==1)
                                System.out.print("   ---   **");
                            else if (x==2)
                                System.out.print("  /   \\  **");
                            else if (x==3)
                                System.out.print("  \\   /  **");
                            else if (x==4)
                                System.out.print("   ---   **");
                            else if (x==5)
                                System.out.print(" * * * * **");                                
                        }

                        else if(ar[i][j]==0)
                        {
                            if(x!=5)
                                System.out.print("         **");
                            else
                                System.out.print(" * * * * **");    
                        }
                    }
                    System.out.println();
                }
            }
            if(ar[0][0]==1&&ar[1][0]==1&&ar[2][0]==1)
                co++;
            else if(ar[0][1]==1&&ar[1][1]==1&&ar[2][1]==1)
                co++;
            else if(ar[0][2]==1&&ar[1][2]==1&&ar[2][2]==1)
                co++;
            else if(ar[0][0]==1&&ar[0][1]==1&&ar[0][2]==1)
                co++;
            else if(ar[1][0]==1&&ar[1][1]==1&&ar[1][2]==1)
                co++;
            else if(ar[2][0]==1&&ar[2][1]==1&&ar[2][2]==1)
                co++;
            else if(ar[0][0]==1&&ar[1][1]==1&&ar[2][2]==1)
                co++;
            else if(ar[0][2]==1&&ar[1][1]==1&&ar[2][0]==1)
                co++;
            else if(ar[0][0]==2&&ar[1][0]==2&&ar[2][0]==2)
                co+=2;
            else if(ar[0][1]==2&&ar[1][1]==2&&ar[2][1]==2)
                co+=2;
            else if(ar[0][2]==2&&ar[1][2]==2&&ar[2][2]==2)
                co+=2;
            else if(ar[0][0]==2&&ar[0][1]==2&&ar[0][2]==2)
                co+=2;
            else if(ar[1][0]==2&&ar[1][1]==2&&ar[1][2]==2)
                co+=2;
            else if(ar[2][0]==2&&ar[2][1]==2&&ar[2][2]==2)
                co+=2;
            else if(ar[0][0]==2&&ar[1][1]==2&&ar[2][2]==2)
                co+=2;
            else if(ar[0][2]==2&&ar[1][1]==2&&ar[2][0]==2)
                co+=2;
            for(int n=0;n<=2;n++)
            {
                for(int m=0;m<=2;m++)
                {
                    if(ar[n][m]==1||ar[n][m]==2)
                        c3++;
                    else
                    {
                        c3=0;
                        break;
                    }
                }
                if(c3==0)
                    break;
            }
            if(co==1)
            {
                System.out.println("\n\n\t\t\t\t"+n1+" WINS!!");
                Thread.sleep(2000);
                System.out.print("\f");
                break;
            }
            else if(co==2)
            {
                System.out.println("\n\n\t\t\t\t"+n2+" WINS!!");
                Thread.sleep(2000);
                System.out.print("\f");
                break;
            }
            else if(c3!=0)
            {
                System.out.println("\t\t\t\t\t    DRAW");
                Thread.sleep(2000);
                System.out.print("\f");
                break;
            }
            if(c1==0)
            {
                while(true)
                {
                    c4=0;
                    System.out.println(n2+", enter no. of row and column");
                    r=sc.nextInt();
                    c=sc.nextInt();

                    if(r>3||c>3)
                    {c4++;}
                    else if(a2[r-1][c-1]==1||a2[r-1][c-1]==2)
                    {
                        c4++;
                    }
                    if(c4!=0)
                    {
                        break;
                    }
                    ar[r-1][c-1]=2;
                    a2[r-1][c-1]=2;
                    break;
                }
            }
            if(c4!=0)
            {
                System.out.println("\t\t\t\twrong choice....try again");
                Thread.sleep(1000);
            }

            System.out.print("\f\n\n\n\n");
            System.out.println("\t\t\t** * * * * ** * * * * ** * * * * **");
            for(i=0;i<=2;i++)
            {
                for(x=1;x<=5;x++)
                {
                    System.out.print("\t\t\t**"); 
                    for(j=0;j<=2;j++)
                    {

                        if(ar[i][j]==1)
                        {
                            if(x==1)
                                System.out.print("   \\  /  **");
                            else if (x==2)
                                System.out.print("    \\/   **");
                            else if (x==3)
                                System.out.print("    /\\   **");
                            else if (x==4)
                                System.out.print("   /  \\  **");
                            else if (x==5)
                                System.out.print(" * * * * **");
                        }

                        else if(ar[i][j]==2)
                        {
                            if(x==1)
                                System.out.print("   ---   **");
                            else if (x==2)
                                System.out.print("  /   \\  **");
                            else if (x==3)
                                System.out.print("  \\   /  **");
                            else if (x==4)
                                System.out.print("   ---   **");
                            else if (x==5)
                                System.out.print(" * * * * **");                                
                        }

                        else if(ar[i][j]==0)
                        {
                            if(x!=5)
                                System.out.print("         **");
                            else
                                System.out.print(" * * * * **");    
                        }
                    }
                    System.out.println();
                }
            }
            if(ar[0][0]==1&&ar[1][0]==1&&ar[2][0]==1)
                co++;
            else if(ar[0][1]==1&&ar[1][1]==1&&ar[2][1]==1)
                co++;
            else if(ar[0][2]==1&&ar[1][2]==1&&ar[2][2]==1)
                co++;
            else if(ar[0][0]==1&&ar[0][1]==1&&ar[0][2]==1)
                co++;
            else if(ar[1][0]==1&&ar[1][1]==1&&ar[1][2]==1)
                co++;
            else if(ar[2][0]==1&&ar[2][1]==1&&ar[2][2]==1)
                co++;
            else if(ar[0][0]==1&&ar[1][1]==1&&ar[2][2]==1)
                co++;
            else if(ar[0][2]==1&&ar[1][1]==1&&ar[2][0]==1)
                co++;
            else if(ar[0][0]==2&&ar[1][0]==2&&ar[2][0]==2)
                co+=2;
            else if(ar[0][1]==2&&ar[1][1]==2&&ar[2][1]==2)
                co+=2;
            else if(ar[0][2]==2&&ar[1][2]==2&&ar[2][2]==2)
                co+=2;
            else if(ar[0][0]==2&&ar[0][1]==2&&ar[0][2]==2)
                co+=2;
            else if(ar[1][0]==2&&ar[1][1]==2&&ar[1][2]==2)
                co+=2;
            else if(ar[2][0]==2&&ar[2][1]==2&&ar[2][2]==2)
                co+=2;
            else if(ar[0][0]==2&&ar[1][1]==2&&ar[2][2]==2)
                co+=2;
            else if(ar[0][2]==2&&ar[1][1]==2&&ar[2][0]==2)
                co+=2;
            for(int n=0;n<=2;n++)
            {
                for(int m=0;m<=2;m++)
                {
                    if(ar[n][m]==1||ar[n][m]==2)
                        c3++;
                    else
                    {
                        c3=0;
                        break;
                    }
                }
                if(c3==0)
                    break;

            }
            if(co==1)
            {
                System.out.println("\n\n\t\t\t\t"+n1+" WINS!!");
                Thread.sleep(2000);
                System.out.print("\f");
                break;
            }
            else if(co==2)
            {
                System.out.println("\n\n\t\t\t\t"+n2+" WINS!!");
                Thread.sleep(2000);
                System.out.print("\f");
                break;
            }
            else if(c3!=0)
            {
                System.out.println("\t\t\t\t\t    DRAW");
                Thread.sleep(2000);
                System.out.print("\f");
                break;
            }
        }
    }
}