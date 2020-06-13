package com.nag.recipe.recipe.services;

import com.nag.recipe.recipe.commands.RecipeCommand;
import com.nag.recipe.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    public Set<Recipe> getRecipes();
    public Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long l);
    public void deleteById(long id);

}
