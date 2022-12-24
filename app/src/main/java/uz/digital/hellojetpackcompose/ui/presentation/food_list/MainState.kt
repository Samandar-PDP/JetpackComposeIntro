package uz.digital.hellojetpackcompose.ui.presentation.food_list

import uz.digital.hellojetpackcompose.model.Category

data class MainState(
    val loading: Boolean = false,
    val error: String = "",
    val foodList: List<Category> = emptyList()
)