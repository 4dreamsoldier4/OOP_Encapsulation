public class ProductManager {
    public void Add(Product product){
        //JBDC
        System.out.println("Ürün Eklendi "+ product.get_name());
    }
}
