package com.nag.recipe.recipe.controllers;

import com.nag.recipe.recipe.commands.RecipeCommand;
import com.nag.recipe.recipe.domain.Recipe;
import com.nag.recipe.recipe.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RecipeController {

    @Autowired
    private RecipeService service;

    @RequestMapping("/recipe/{id}/show")
    public String showRecipeById(@PathVariable String id, Model model)
    {
        Recipe recipe = service.findById(new Long(id));
        model.addAttribute("recipe", recipe );
        return "recipe/show";
    }

    @RequestMapping("/recipe/{id}/update")
    public String updateRecipeById(@PathVariable String id, Model model)
    {
        model.addAttribute("recipe", service.findById(Long.valueOf(id)));
        return  "recipe/recipeform";
    }

    @RequestMapping("recipe/new")
    public String newRecipe(Model model){
        model.addAttribute("recipe", new RecipeCommand());

        return "recipe/recipeform";
    }

    @PostMapping("recipe")
    public String saveOrUpdate(@ModelAttribute RecipeCommand command){
        RecipeCommand savedCommand = service.saveRecipeCommand(command);

        return "redirect:/recipe/" + savedCommand.getId()+"/show";
    }

    @GetMapping
    @RequestMapping("/recipe/{id}/delete")
    public String deleteRecipeById(@PathVariable String id)
    {
        service.deleteById(new Long(id));

        return "redirect:/";
    }
}
