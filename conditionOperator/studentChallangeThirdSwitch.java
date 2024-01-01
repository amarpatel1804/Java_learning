import java.util.Scanner;

public class studentChallangeThirdSwitch {

    public static void main(String args[]){
        int dayNumber;
        System.out.println("Enter a Day Number: ");
        Scanner sc=new Scanner(System.in);
        dayNumber=sc.nextInt();

        switch (dayNumber){
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default:System.out.println("Invalid Input");
                    break;
        }


        //Month display
        System.out.println("Enter a month number: ");
        int monthNumber=sc.nextInt();
        switch (monthNumber){
            case 1:System.out.println("January");
                    break;
            case 2:System.out.println("February");
                    break;
            case 3:System.out.println("March");
                    break;
            case 4:System.out.println("April");
                    break;
            case 5:System.out.println("May");
                    break;
            case 6:System.out.println("June");
                    break;
            case 7:System.out.println("July");
                    break;
            case 8:System.out.println("August");
                    break;
            case 9:System.out.println("September");
                    break;
            case 10:System.out.println("Octomber");
                    break;
            case 11:System.out.println("November");
                    break;
            case 12:System.out.println("December");
                    break;
            default:System.out.println("Invalid Input");
                    break;
        }
        String  extra=sc.nextLine();

        //Website Domain name
        System.out.println("Enter a website name: ");
        String domainName=sc.nextLine();
        String domainType=domainName.substring(domainName.indexOf(".")+1);

        switch (domainType)
        {
            case "com":System.out.println("Commercial");
                        break;
            case "org":System.out.println("Orgnization");
                        break;
            case "gov":System.out.println("Government");
                        break;
            case "net":System.out.println("Network");
                        break;
            default:System.out.println("Invalid Website");
                        break;
        }
    }
}
