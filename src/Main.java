import com.gchaldu.product.controller.ProductController;
import com.gchaldu.product.model.repositories.ProductRepository;
import com.gchaldu.product.view.ProductView;

public class Main {
    public static void main(String[] args) {

        ProductView productView = new ProductView();
        ProductRepository productRepository = new ProductRepository();
        ProductController productController = new ProductController(productView, productRepository);
        productController.createProduct();

    }
}
