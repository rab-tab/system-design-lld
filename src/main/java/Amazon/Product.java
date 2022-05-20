package Amazon;

import java.util.List;

public class Product {

    int productId;
    String productName;
    String productDescription;
    Seller seller;
    ProductCategory category;
    double price;

    List<ProductReview> productReview;
}
