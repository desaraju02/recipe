package com.nag.recipe.recipe.services;

import com.nag.recipe.recipe.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);



}
