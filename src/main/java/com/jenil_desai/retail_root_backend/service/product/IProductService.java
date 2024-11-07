package com.jenil_desai.retail_root_backend.service.product;

import com.jenil_desai.retail_root_backend.model.Product;
import com.jenil_desai.retail_root_backend.request.AddProductRequest;
import com.jenil_desai.retail_root_backend.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getAllProductsByCategory(String category);
    List<Product> getAllProductsByBrand(String brand);
    List<Product> getAllProductsByCategoryAndBrand(String category,String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand,String name);
    Long countProductsByBrandAndName(String brand, String name);
}
