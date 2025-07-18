
import java.util.*;
class Movie_genre
{
    void display(String str[])
    {
        for(int i=0;i<str.length;i++)
        System.out.println(str[i]);
    }
    void main()
    {
        Scanner sc= new Scanner(System.in);
        String movie="",t1="";
        
        String t[]= {"","10:00-11:30","12:00-13:30","14:00-16:30", "17:00-18:30", "19:00-20:30", "21:00-22:30","23:00-00:30"};
        String eng[]= {"", "1.The Expendable- action", "2.Romeo and Juliet- romance", "3.Ali- biography", "4.Charlie Chaplin-The Circus- comedy","5.Iron Man- sci fi", "6.The Incredibles- animated" ,"7.The Conjuring 2- horror"};
        String hin[]= {"", "1.Radhe- action", "2.Aashiqi- romance", "3.Padmavat- biography", "4.Phir Hera Pheri- comedy", "5.Krrish 3- sci fi", "6.My Friend Ganesha- animated","7.Koun- horror" };
        
        
        System.out.println("Choose language:- 1.English\t2.Hindi");
        
        while(true)
        {
            int lan= sc.nextInt();
            switch(lan)
            {
                case 1: display(eng);System.out.println("respective time");display(t);
                System.out.println("\nChoose ");
                
                
                
                while (true)
                {
                    int gen= sc.nextInt();
                    
                    if(gen>=1 && gen<=7)
                    {
                        movie= eng[gen];t1=t[gen];break;
                    }
                    System.out.println("Re-choose");
                }
                break;
                
                case 2:display(hin);System.out.println("respective time");display(t);
                System.out.println("\nChoose ");
                
                
                
                while (true)
                {
                    int gen= sc.nextInt();
                    
                    if(gen>=1 && gen<=7)
                    {
                        movie= hin[gen];t1=t[gen];break;
                    }
                    System.out.println("Re-choose");
                }
                break;
                             
            }
            if(lan==1 || lan ==2) break;
            System.out.println("Re-choose");
        }
        
        System.out.println("your movie\t"+ movie);
        System.out.println("your time\t"+t1);
        }
    }
                
              
        
    