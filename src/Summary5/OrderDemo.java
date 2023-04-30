package Summary5;

public class OrderDemo {


    public static void main(String[] args) {
        Order order = new Order("Salad", 1, 15.0);
        Order order2 = new Order("Steak", 2, 30.0);
        Order order3 = new Order("Beer", 2, 5.0);
        Order order4 = new Order("Pasta", 2, 10.5);
        Order order5 = new Order("Pizza", 1, 12.0);

        CafeOrder cafeOrder1 = new CafeOrder();
        cafeOrder1.addOrder(order);
        cafeOrder1.addOrder(order2);
        cafeOrder1.addOrder(order3);
        cafeOrder1.addOrder(order4);
        cafeOrder1.addOrder(order5);
        cafeOrder1.getTotalCost();
        System.out.println("1:");
        cafeOrder1.removeFromOrder(order5);
        System.out.println("2:");
        cafeOrder1.removeOrderByID(4);
        System.out.println("3:");
        cafeOrder1.removeOrderByID(6);
        System.out.println("4:");
        cafeOrder1.getTotalCost();
        System.out.println("5:");
        cafeOrder1.getOrdersCount();
        System.out.println("6:");
        cafeOrder1.getOrderById(3);
        System.out.println("7:");
        cafeOrder1.getOrderById(7);






    }
}
