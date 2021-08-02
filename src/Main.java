public class Main {

    public static void main(String[] args) {
	Product product = new Product();
	product.set_name("Laptop");
	product.setId();
	product.set_description("Monster laptop");
	product.set_price(10500);
	product.set_stockAmount(3);
	System.out.println(product.get_name());

	ProductManager prodoctManager = new ProductManager();
	prodoctManager.Add(product);

	System.out.println(product.get_kod());

    }
}
