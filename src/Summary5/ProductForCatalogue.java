package Summary5;

public class ProductForCatalogue {
    String name;
    int price;
    int ID;
    static int idCounter = 0;

    public ProductForCatalogue(String name, int price, int ID) {
        this.name = name;
        this.price = price;
        this.ID = generateID();
    }

    private int generateID() {
        int id = idCounter;
        idCounter++;
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "ProductForCatalogue{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ID=" + ID +
                '}';
    }

}
