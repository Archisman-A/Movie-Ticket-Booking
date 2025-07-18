import java.util.*;
class Snacks_class
{
    void orderSnacks()
    {
        Scanner sc= new Scanner (System.in);
        double cost=0;
        int food[]= {0, 300, 180, 60, 100 , 100 ,35 ,35 ,35 ,35 ,35 };
        
        System.out.println("1. Chicken Rashmi Kebabs/Crispy Fried Chicken(10 pcs) \t Rs.300 \n2. Fish Finger(10 pcs) \t Rs.180 \n3. Paneer Patties(1 pc) \t Rs.60 \n4. French Fries(1 Bucket) Rs.100");
        System.out.println("5. Popcorn(1 bucket) \t Rs.100 \n6. Thumbs-up(250ml) \n7. Sprite(250ml) \n8. Fanta(250ml) \n9.Milkshake(250ml) \n10. Jaljeera(250ml) \t All drinks Rs.35");
        System.out.println("Press any other value to exit to exit");
        while(true)
        {
                        
            int choice = sc.nextInt();
            if(choice<1 || choice >10)
            break;
            else cost += food[choice] ;
            
        }
        System.out.println("Bill including 9% GST");
        cost = cost * 109.0/100;
        System.out.println("Rs."+cost);
        
        System.out.println("Thank You Sir/Madam, Please remember not to litter the hall.");
    }
}
            