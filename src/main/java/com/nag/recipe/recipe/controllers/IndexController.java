package com.nag.recipe.recipe.controllers;

import com.nag.recipe.recipe.domain.Category;
import com.nag.recipe.recipe.domain.Recipe;
import com.nag.recipe.recipe.domain.UnitOfMeasure;
import com.nag.recipe.recipe.repositories.CategoryRepository;
import com.nag.recipe.recipe.repositories.UnitOfMeasureRepository;
import com.nag.recipe.recipe.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    @Autowired
    public RecipeService service;

    @RequestMapping("/")
    public String showIndexPage(Model model)
    {
        model.addAttribute("recipes", service.getRecipes());
        return "index";

    }
}
