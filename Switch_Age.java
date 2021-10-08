public class Switch_Age {
    public static void main(String[] args) {


        int age  = 12;
        int age1 = 16;
        int age2 = 25;
        System.out.println("1st age is 12");
        System.out.println("2nd age is 16");
        System.out.println("3rd age is 25");
        System.out.println("\n");
            switch (age) {
                case 12:
                    break;
                case 16:
                    break;
                case 25:
                    System.out.println("greater age is:" + age);
                    break;

            }
        switch (age1) {
            case 12:
                break;
            case 16:
                break;
            case 25:
                System.out.println("greater age is:" + age1);
                break;

        }
        switch (age2) {
            case 12:
                break;
            case 16:
                break;
            case 25:
                System.out.println("greater age  is:" + age2);
                break;
                default:
                    System.out.println("this age is not found");

        }

        }
    }