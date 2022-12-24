package uz.digital.hellojetpackcompose.network

import retrofit2.Response
import retrofit2.http.GET
import uz.digital.hellojetpackcompose.model.FoodResponse

interface FoodService {
    @GET("categories.php")
    suspend fun getFoods(): Response<FoodResponse>
}