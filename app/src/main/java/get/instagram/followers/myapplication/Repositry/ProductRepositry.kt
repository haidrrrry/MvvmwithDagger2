package get.instagram.followers.myapplication.Repositry

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import get.instagram.followers.myapplication.db.FakerDb
import get.instagram.followers.myapplication.models.ProductItem
import get.instagram.followers.myapplication.retrofit.FakerApi
import javax.inject.Inject

class ProductRepositry @Inject constructor(private val fakerApi: FakerApi,private val fakerDb: FakerDb  ) {

    private val _products=MutableLiveData<List<ProductItem>>()
    val products:LiveData<List<ProductItem>>
        get() = _products
    suspend fun getProducts()
    {
        val result=fakerApi.getProducts()
        if (result.isSuccessful && result.body()!=null)
        {
            fakerDb.getDao().addProduct(result.body()!!)
            _products.postValue(result.body())
        }
    }
}