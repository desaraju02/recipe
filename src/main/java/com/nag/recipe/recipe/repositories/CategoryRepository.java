package com.nag.recipe.recipe.repositories;

import com.nag.recipe.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
