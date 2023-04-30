package Summary5;

import java.util.LinkedList;

public class CafeOrder {
    private LinkedList<Order> orderList;

    public CafeOrder() {
        this.orderList =  new LinkedList<>();
    }

    @Override
    public String toString() {
        return "CafeOrder{" +
                "orderList=" + orderList +
                '}';
    }
    public void addOrder(Order order){
        orderList.add(order);
        System.out.println("You added to your order " + order);
    }

    public void removeFromOrder (Order order){
        orderList.remove(order);
        System.out.println(order + " was removed from your order");
    }

    public double getTotalCost(){
        double sumToPay = 0;
        for (Order element: orderList) {
            sumToPay += element.getSumOfOrder();
        }
        System.out.println("Total sum of orders is: " + sumToPay);
        return sumToPay;
    }

    public void getOrdersCount(){
        System.out.println("You have " + orderList.size() + " orders.");
    }

    public Order getOrderById(int id){
        for (Order element: orderList) {
            if (element.getID() == id){
                System.out.println("Order ID " + id + ": " + element);
                return element;
            }
        }
        System.out.println("There is no order with ID " + id);
        return new Order("there is no order with such ID");
    }

    public void removeOrderByID(int id) {
        if (orderList.remove(getOrderById(id))){
            System.out.println("Order with ID " + id + " removed.");
        }
        else {
            System.out.println("Order with ID " + id + " not found.");
        }
    }
}
