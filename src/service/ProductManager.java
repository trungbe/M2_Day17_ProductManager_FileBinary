package service;

import model.Product;
import storage.ProductReadAndWrite;

import java.util.List;

public class ProductManager {
    private List<Product> listProducts;

    public ProductManager(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public List<Product> getList() {
        return listProducts;
    }

    public void setList(List<Product> list) {
        this.listProducts = list;
    }

    public void addNewProduct(Product product) {

        listProducts.add(product);
        ProductReadAndWrite.writeFile(listProducts);
    }

    public void editProduct(int index, Product product) {
        listProducts.set(index,product);
        ProductReadAndWrite.writeFile(listProducts);
    }

    public void deleteProduct(int index) {
        listProducts.remove(index);
        ProductReadAndWrite.writeFile(listProducts);
    }

    public void showAll() {
        for (Product p : listProducts) {
            System.out.println(p.toString());
        }
    }
}
