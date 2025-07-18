
import java.util.*;
public class Feedbacks_class
{
    void Feedbacks()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please rate your experience out of 10 !!");
        
        while(true)
        {
            double rate= sc.nextDouble();
            if (rate>=0 && rate<=10)
            {
                System.out.println("Thank you !!");
                break;
            }
            else
            System.out.println("Type again");
        }
        System.out.println("Any suggestions for us ?? Do let us know !!");
        String str = sc.next()+ sc.nextLine();
        System.out.println(str +"\nThank You ... We shall sincerely ensure it.");
    }
}
        
        