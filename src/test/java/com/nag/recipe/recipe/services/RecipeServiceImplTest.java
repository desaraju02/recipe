package com.nag.recipe.recipe.services;

import com.nag.recipe.recipe.domain.Recipe;
import com.nag.recipe.recipe.repositories.RecipeRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecipeServiceImplTest {

    RecipeServiceImpl impl;

    @Mock
    RecipeRepository recipeRepository;


    @Test
    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);
        //impl = new RecipeServiceImpl(recipeRepository);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getRecipes() {


        Set<Recipe> recipes = impl.getRecipes();
        assertEquals(1,recipes.size());
    }
}