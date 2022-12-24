package uz.digital.hellojetpackcompose.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.digital.hellojetpackcompose.utils.Constants

object RetroInstance {
    fun provideFoodService(): FoodService {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FoodService::class.java)
    }
}