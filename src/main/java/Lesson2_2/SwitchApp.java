package Lesson2_2;

public class SwitchApp {
    public static void main(String[] args) {
        //checkOrderStatus2("ACCEPTED");
        //checkOrderStatus2("asdsd");

        checkOrderStatus2("SHIPPED");
        checkOrderStatus2("IN_DELIVERY");
        String month = "JAN";
        switch (month) {
            case "DEC":
            case "JAN":
            case "FEB": {
                System.out.println("winter");
                break;
            }
        }

    }

    public static void checkOrderStatus(String orderStatus) {
        if (orderStatus.equals("ACCEPTED")) {
            System.out.println("prinyat");
        } else if (orderStatus.equals("DELIVERED")) {
            System.out.println("dostavlen");
        } else {
            System.out.println("neizvestny status zakaza");
        }
    }

    public static void checkOrderStatus2(String orderStatus) {
        switch (orderStatus) {
            case "ACCEPTED": {
                System.out.println("prinyat");
                break;
            }
            case "DELIVERED": {
                System.out.println("dostavlen");
                break;
            }
            case "SHIPPED":
                break;
            case "IN_DELIVERY": {
                System.out.println("v dostavke");
                break;
            }
            default: {
                System.out.println("neizvestny status zakaza");
            }
        }
    }
}
