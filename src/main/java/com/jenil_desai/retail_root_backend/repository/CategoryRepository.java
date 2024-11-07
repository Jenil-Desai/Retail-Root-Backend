package com.jenil_desai.retail_root_backend.repository;

import com.jenil_desai.retail_root_backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
