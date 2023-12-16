package com.benjamin.foodiepal_culinarycompanion

object MealPlannerManager {
    private val mealList = mutableListOf<Meal>()

    fun getMeals(): List<Meal> {
        return mealList
    }

    fun addMeal(meal: Meal) {
        mealList.add(meal)
    }

    // Add other methods as needed
}
