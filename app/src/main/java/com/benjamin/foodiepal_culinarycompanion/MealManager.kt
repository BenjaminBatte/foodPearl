package com.benjamin.foodiepal_culinarycompanion

object MealManager {
    private val mealList = mutableListOf<Meal>()

    // Get the list of meals
    fun getMeals(): List<Meal> {
        return mealList
    }

    // Add a new meal to the list
    fun addMeal(meal: Meal) {
        mealList.add(meal)
    }
}
