public class Book implements ItemElement {

    private String name;
    private String publication;
    private int price;

    public Book(String name, String publication, int price) {
        this.name = name;
        this.publication = publication;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
