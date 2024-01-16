import java.util.*;
class Setup
{
    public void start()throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j,co=0,r1,c1,ch,n=0,n2=0;
        System.out.println("\t\t\t\t\t"+"Enter the game grid size(row x column)"+"\n\t\t\t\t\t\t  Example: 7 x 7");
        while(true)
        {
            try
            {
                r = sc.nextInt();
                c = sc.nextInt();     
            }
            catch(InputMismatchException nfe)
            {
                r=0;
                c=0;
                n++;
            }
            if(n!=0)
                System.out.println("\t\t\t\t\t   Wrong Choice...\n\t\t\t\t\t   Please enter correct option\n\n");
            else
                break;
        }
        int ar2[][]=new int[r+2][c+2];
        double p=0.0d;
        System.out.println("\t\t\t\t\t\t  Difficulty level\n\t\t\t\t\t\t      Enter\n\t\t\t\t\t\t     1-Easy\n\t\t\t\t\t\t     2-Normal\n\t\t\t\t\t\t     3-Difficult ");
        while (true)

        {
            try
            {
                ch=sc.nextInt();
            }
            catch(InputMismatchException nfe)
            {
                ch=0;
            }
            if(ch==1)
            {
                p=0.2;
                break;
            }
            else if(ch==2)
            {
                p=0.5;
                break;
            }
            else if(ch==3)
            {
                p=0.8;
                break;
            }
            else 
                System.out.println("\t\t\t\t\t   Wrong Choice...\n\t\t\t\t\t   Please enter correct option\n\n");
        }

        boolean[][] bombs = new boolean[r+2][c+2];
        for ( i = 1; i <= r; i++)
            for ( j = 1; j <= c; j++)
            {
                bombs[i][j] = (Math.random() < p);
                if(bombs[i][j])
                    co++;
            }
        System.out.print("\f\n\n\n");
        for(i=1;i<=r;i++)
        {   
            System.out.print("\t\t\t\t\t\t");
            for(j=1;j<=c;j++)
            {
                System.out.print("o"+"  ");
            }
            System.out.println( );
        }
        System.out.println("\n\n\t\t\t\t\t\thint:-number of bombs is "+co);
        int[][] sol = new int[r+2][c+2];
        for ( i = 1; i <= r; i++)
        {
            for (j = 1; j <= c; j++)
            {
                for (int ii = i - 1; ii <= i + 1; ii++)
                {
                    for (int jj = j - 1; jj <= j + 1; jj++)
                    {
                        if (bombs[ii][jj]) 
                        {
                            sol[i][j]++;
                        }
                    }
                }
            }
        }
        String sol2[][]=new String[r+2][c+2];
        for(i=0;i<r+2;i++)
        {
            for(j=0;j<c+2;j++)
            {
                sol2[i][j]="o";
            }
        }
        int sol3[][]=new int[r+2][c+2];
        for(i=0;i<r+2;i++)
        {
            for(j=0;j<c+2;j++)
            {
                sol3[i][j]=0;
            }
        }
        boolean a=false;
        while(true)
        {
            while(true)
            {
                System.out.println("\n\t\t\t\t"+"  Enter the number of row and number of column you want to choose:");
                r1= sc.nextInt();
                c1=sc.nextInt();
                n2=0;
                if(r1>r||c1>c)
                    n2++;
                else if(ar2[r1-1][c1-1]==1)
                {
                    n2++;
                }
                if(n2!=0)
                {
                    break;
                }
                ar2[r1-1][c1-1]=1;
                break;
            }

            if(n2!=0)
            {
                System.out.println("\t\t\t\t\t\t   Wrong Choice...\n\t\t\t\t\t   Please enter correct option\n\n");
                Thread.sleep(1000);
                r1=0;
                c1=0;
            }
            if(r1>0&&c1>0)
            {
                if(bombs[r1][c1])
                {
                    System.out.println("\t\t\t\t\t\t"+"Sorry, you have lost \n \t\t\t\t\t\tSolution is");
                    for (i = 1; i <= r; i++) 
                    {
                        System.out.print("\t\t\t\t\t\t");
                        for (j = 1; j <= c; j++) 
                        {
                            if (bombs[i][j]) 
                                System.out.print("*  ");
                            else             
                            {   

                                System.out.print(sol[i][j] + "  ");

                            }
                        }
                        System.out.println();
                    }
                    Thread.sleep(2500);
                    System.out.print("\f");                
                    break;
                }
                else
                {
                    for(i=1;i<=r;i++)
                    {
                        for(j=1;j<=c;j++)
                        {
                            if(i==r1&&j==c1)
                            {
                                if(bombs[i][j])
                                {
                                    sol2[i][j]="o";
                                    sol3[i][j]=sol[i][j];
                                }
                                else
                                {
                                    sol2[i][j]="";
                                    sol2[i][j]+=sol[i][j];
                                    sol3[i][j]=sol[i][j];
                                }
                            }
                            else if(i==r1+1&&j==c1+1)
                            {
                                if(bombs[i][j])
                                {
                                    sol3[i][j]=sol[i][j];
                                    sol2[i][j]="o";
                                }
                                else
                                {
                                    sol2[i][j]="";
                                    sol2[i][j]+=sol[i][j];
                                    sol3[i][j]=sol[i][j];
                                }
                            }
                            else if(i==r1-1&&j==c1-1)
                            {
                                if(bombs[i][j])
                                {
                                    sol2[i][j]="o";
                                    sol3[i][j]=sol[i][j];
                                }
                                else
                                {
                                    sol2[i][j]="";
                                    sol2[i][j]+=sol[i][j];
                                    sol3[i][j]=sol[i][j];
                                }
                            }
                            else if(i==r1&&j==c1+1)
                            {
                                if(bombs[i][j])
                                {
                                    sol2[i][j]="o";
                                    sol3[i][j]=sol[i][j];
                                }
                                else
                                {
                                    sol2[i][j]="";
                                    sol2[i][j]+=sol[i][j];
                                    sol3[i][j]=sol[i][j];
                                }
                            }
                            else if(i==r1&&j==c1-1)
                            {
                                if(bombs[i][j])
                                { 
                                    sol2[i][j]="o";
                                    sol3[i][j]=sol[i][j];
                                }
                                else
                                {
                                    sol2[i][j]="";
                                    sol2[i][j]+=sol[i][j];
                                    sol3[i][j]=sol[i][j];
                                }
                            }    
                            else if(i==r1+1&&j==c1)
                            {
                                if(bombs[i][j])
                                {
                                    sol2[i][j]="o";
                                    sol3[i][j]=sol[i][j];
                                }
                                else
                                {
                                    sol2[i][j]="";
                                    sol2[i][j]+=sol[i][j];
                                    sol3[i][j]=sol[i][j];
                                }
                            }
                            else if(i==r1+1&&j==c1-1)
                            {
                                if(bombs[i][j])
                                {
                                    sol2[i][j]="o";
                                    sol3[i][j]=sol[i][j];
                                }
                                else
                                {
                                    sol2[i][j]="";
                                    sol2[i][j]+=sol[i][j];
                                    sol3[i][j]=sol[i][j];
                                }
                            }
                            else if(i==r1-1&&j==c1)
                            {
                                if(bombs[i][j])
                                {
                                    sol2[i][j]="o";
                                    sol3[i][j]=sol[i][j];
                                }
                                else
                                {
                                    sol2[i][j]="";
                                    sol2[i][j]+=sol[i][j];
                                    sol3[i][j]=sol[i][j];
                                }
                            }
                            else if(i==r1-1&&j==c1+1)
                            {
                                if(bombs[i][j])
                                {
                                    sol2[i][j]="o";
                                    sol3[i][j]=sol[i][j];
                                }
                                else
                                {
                                    sol2[i][j]="";
                                    sol2[i][j]+=sol[i][j];
                                    sol3[i][j]=sol[i][j];
                                }
                            }   
                        }
                    }
                }
            }
            System.out.print("\f");
            System.out.println("\n\n\n\n");
            for(i=1;i<=r;i++)
            {
                System.out.print("\t\t\t\t\t\t");
                for(j=1;j<=c;j++)
                {
                    System.out.print(sol2[i][j]+"  ");
                }
                System.out.println();
            }     
            for(i=1;i<=r;i++)
            {   
                for(j=1;j<=c;j++)
                {
                    if(sol3[i][j]==sol[i][j])
                        a=true;
                    else
                    { 
                        a=false;
                        break;
                    }
                }
            }
            if(a)
            {
                System.out.print("\f");
                System.out.println("\n\n\n");
                System.out.print("\t\t\t\t\t\t CONGRATULATIONS");
                Thread.sleep(250);
                System.out.print("\f");
                Thread.sleep(250);
                System.out.println("\n\n\n");
                System.out.print("\t\t\t\t\t\t CONGRATULATIONS");
                Thread.sleep(250);
                System.out.print("\f");
                Thread.sleep(250);
                System.out.println("\n\n\n");
                System.out.println("\t\t\t\t\t\t CONGRATULATIONS");
                Thread.sleep(500);
                System.out.print("\t\t\t\t\t\t  You have WON!!");
                Thread.sleep(2000);
                System.out.print("\f");
                break;
            }
        }
    }
}

