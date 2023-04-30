package Summary5;

/*
Описание: Вам необходимо разработать класс, который будет представлять коллекцию заказов в ресторане,
используя структуру данных LinkedList в Java. Заказы должны быть представлены в виде объектов Order,
которые содержат информацию о наименовании блюда, количестве порций и стоимости. Класс должен иметь следующие методы:

    addOrder(Order order): Добавляет заказ в конец коллекции.
    removeOrder(Order order): Удаляет указанный заказ из коллекции.
    getTotalCost(): Возвращает общую стоимость всех заказов в коллекции.
    getOrdersCount(): Возвращает количество заказов в коллекции.
    getOrderById(int id): Возвращает заказ по указанному идентификатору.

 */
public class Order {
    private String dishName;
    private int quantity;
    private double price;
    private double sumOfOrder;
    private int ID;
    private static int idCounter = 1;

    public Order(String dishName, int quantity, double price) {
        this.dishName = dishName;
        this.quantity = quantity;
        this.price = price;
        this.sumOfOrder = quantity * price;
        this.ID = generateID();
    }

    public Order(String dishName) {
    }

    private int generateID() {
        int id = idCounter;
        idCounter++;
        return id;
    }

    public int getID() {
        return ID;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
    public double getSumOfOrder() {
        return sumOfOrder;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                dishName + '\'' +
                ", quantity: " + quantity +
                ", price: " + price +
                ", sumOfOrder: " + sumOfOrder +
                ", ID: " + ID +
                '}';
    }

}
