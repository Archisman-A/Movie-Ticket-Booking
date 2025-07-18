import java.io.*;
import java.util.*;
import java.io.IOException;

public class Extract2
{
    void main() 
    {
        String fileName="m.txt";
        try{
            
        FileReader fr= new FileReader("m.txt");
        BufferedReader br= new BufferedReader(fr);
        Scanner sc= new Scanner(System.in);
        String choice,choice1,c; StringTokenizer d;
        int i,k,j;
        String[] parameters={"english","bengali","hindi","sports","biography","action","drama","comedy","romance","sci-fi","adventure","love","suspense","family"};
        int p= parameters.length;
        String para1="english"+" "+"bengali"+" "+"hindi"+" "+"sports"+" "+"biography"+" "+"action"+" "+"drama"+" "+"comedy"+" "+"romance"+" "+"sci-fi"+" "+"adventure"+" "+"love"+" "+"suspense"+" "+"family";
        String movieList[]=new String[parameters.length];
        while(br.readLine()!=null)
            {
                String t=br.readLine();
                System.out.println(t);
                String name=t.substring(0,t.indexOf('-'));
                for(i=0;i<parameters.length;i++)
                {
                    if(t.indexOf(parameters[i])!=-1)
                    
                    movieList[i]=name+" ";
                }
            }
            System.out.println("Enter the language of the films you want to see");
            for(i=0;i<3;i++)
            {
                System.out.print(parameters[i]+" ");
        }
            choice= sc.next()+ sc.nextLine();
            System.out.println("Enter your favourites from the following genres separataed by spaces");
        for(i=3;i<p;i++)
            {
                System.out.print(parameters[i]+" ");
        }
         choice1= sc.next()+ sc.nextLine();
         if(choice.equalsIgnoreCase("english") ) k=0;
         else if(choice.equalsIgnoreCase("bengali")) k=1;
         else k=2;
         choice="";
         StringTokenizer choicelist= new StringTokenizer(choice1);
         for(i=0;i<choicelist.countTokens();i++)
         {
             c= choicelist.nextToken();
            d=new StringTokenizer(para1);
            for(j=0;j<p;j++)
            {
                if(d.nextToken()==c)
                {
                    if(!choice.equals(""))choice=intersection(movieList[k],movieList[j]);
                    break;
                }
            }
        }
        
                 
         
         System.out.println("The following films match your favourites!");
         System.out.println(choice);
         br.close();
         fr.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
         
    }
        String intersection(String c, String d)
        {
            String f="";  int i,j;
            StringTokenizer a= new StringTokenizer(c);
            StringTokenizer b=new StringTokenizer(d);
            int len1=a.countTokens();
            int len2=b.countTokens();
            for(i=1;i<=len1;i++)
            {
                String word= a.nextToken();
                b=new StringTokenizer(d);
                for(j=1;j<=len2;j++)
                {
                    if(b.nextToken()==word)
                    f=f+word+" ";
                }
            }
            return f;
        }
    }