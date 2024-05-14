public class Switch {
    public static void main(String[] args) {

        String day ="sunday";
        String result="";
        switch(day) {

            case "saturday" , "sunday" -> result="6.30am";
            case "monday" -> result="6am";
            default -> result="7am";
       } 
        System.out.println(result);



    //     switch(day) {

    //         case "saturday" , "sunday" -> System.out.println("6.30am");

    //         case "monday" -> System.out.println("6am");

    //         default -> System.out.println("7am");
    //    }
        


    
        // int n=9;
        
        // switch(n) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break; 
        //     case 7:
        //         System.out.println("sunday");
        //         break;
        //     default:
        //         System.out.println("Enter a valid number");
        // }
    }
}
