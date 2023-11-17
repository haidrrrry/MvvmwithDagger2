package get.instagram.followers.myapplication.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import get.instagram.followers.myapplication.Repositry.ProductRepositry
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private val repositry: ProductRepositry):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repositry) as T
    }
}