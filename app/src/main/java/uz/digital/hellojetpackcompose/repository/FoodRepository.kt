package uz.digital.hellojetpackcompose.repository

import uz.digital.hellojetpackcompose.network.FoodService

class FoodRepository(
    private val foodService: FoodService
) {
    suspend fun getFoods() = foodService.getFoods()
}