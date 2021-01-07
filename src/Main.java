import model.Product;
import service.ProductManager;
import storage.ProductReadAndWrite;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = ProductReadAndWrite.readFile();
        ProductManager productManagers = new ProductManager(list);
//        productManagers.addNewProduct(new Product(1, "sp1", "nsx1", 230));
//        productManagers.addNewProduct(new Product(2, "sp2", "nsx2", 250));
//        productManagers.addNewProduct(new Product(3, "sp3", "nsx3", 270));
//        productManagers.addNewProduct(new Product(4, "sp4", "nsx4", 290));
//        productManagers.addNewProduct(new Product(5, "sp6", "nsx5", 310));

        productManagers.deleteProduct(2);
        productManagers.editProduct(0, new Product(6, "sp6", "nsx6", 500));
        productManagers.showAll();
    }
}
