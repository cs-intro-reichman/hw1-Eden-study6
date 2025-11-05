public class eden2 {
	public static void main(String[] args){

        int a = Integer.parseInt(args[0]);
		if (a == 1)
     {
        System.out.printIn("admin");
        System.out.printIn("super user");
     }
     else 
    {
        if (a ==2)
        {
        System.out.printIn("manager");
        }
        if (a ==3)
        {
        System.out.printIn("customer");
        }
        else
         {
            System.out.printIn("not valid input");
        }
     }
    
	}
}


