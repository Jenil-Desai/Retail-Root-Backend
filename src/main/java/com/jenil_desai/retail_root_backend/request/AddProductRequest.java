package com.jenil_desai.retail_root_backend.request;

import com.jenil_desai.retail_root_backend.model.Category;
import java.math.BigDecimal;
import lombok.Data;


@Data
public class AddProductRequest {
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
