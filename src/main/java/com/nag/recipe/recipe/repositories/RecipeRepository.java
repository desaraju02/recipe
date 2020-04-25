package com.nag.recipe.recipe.repositories;

import com.nag.recipe.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
