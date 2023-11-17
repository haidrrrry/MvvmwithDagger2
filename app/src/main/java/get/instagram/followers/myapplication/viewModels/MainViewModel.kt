package get.instagram.followers.myapplication.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import get.instagram.followers.myapplication.Repositry.ProductRepositry
import get.instagram.followers.myapplication.models.ProductItem
import kotlinx.coroutines.launch

class MainViewModel(private val repositry: ProductRepositry):ViewModel() {
    val productLiveData:LiveData<List<ProductItem>>
        get()=repositry.products

    init {
        viewModelScope.launch {
            repositry.getProducts()
        }
    }
}