public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Fruit fruit) {
        System.out.println("5 rs discount on fruit");
        return fruit.getPrice() -5;
    }

    @Override
    public int visit(Book book) {
        System.out.println("10 rs discount on books");
        return book.getPrice() - 10 ;
    }
}
