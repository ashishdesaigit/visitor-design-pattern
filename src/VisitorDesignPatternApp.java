import java.util.Arrays;
import java.util.List;

public class VisitorDesignPatternApp {

    public static void main(String[] args) {

        final List<ItemElement> itemElements = Arrays.asList(new Book("physics", "nirali", 200), new Fruit("Banana", 50));

        final ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

        final int bill = itemElements.stream().mapToInt(s -> s.accept(visitor)).sum();

        System.out.println("Bill = " + bill);


    }
}
