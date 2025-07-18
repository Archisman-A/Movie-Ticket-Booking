import java.util.*;
public class Welcome_class
{
    void Welcome()
    {
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Welcome to Movie Mania, Kolkata's famous Movie Hall. We are pleased to have you here. How can we help you, Sir/Madam?");
        System.out.println("Your name ......");
        String str = sc.next()+sc.nextLine();
        
        System.out.println("1. Book a Ticket \n2. Cancel a Ticket \n3. Check available Movies tonight \n4. Order snacks \n5. Give your feedback");
        
        while (true)
        {
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: // add book a ticket method 
                break;
                case 2: //add cancel a ticket method
                break;
                case 3: //add movies tonight method
                break;
                case 4: //add ordersnacks method;
                break;
                case 5: //add feedbacks method;
                break;
                default : System.out.println("Wrong input, Type again");
                break;
            }
            if (choice >=1 && choice <=5)
            break;
        }
        
        System.out.println("Thank you, Sir/Madam.... Do visit again.... Have a NICE DAY !!");
    }
}
        

                