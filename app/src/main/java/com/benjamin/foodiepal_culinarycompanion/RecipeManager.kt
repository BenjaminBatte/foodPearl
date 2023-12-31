package com.benjamin.foodiepal_culinarycompanion

// Create a RecipeManager singleton object
object RecipeManager {
    // List to hold recipes
    private val recipeList: MutableList<Recipe> = mutableListOf()

    // Function to add a new recipe to the list
    fun addRecipe(recipe: Recipe) {
        recipeList.add(recipe)
    }

    // Function to get the list of recipes
    fun getRecipes(): List<Recipe> {
        return recipeList.toList()
    }

}


