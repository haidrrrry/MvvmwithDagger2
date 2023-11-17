package get.instagram.followers.myapplication.retrofit

import get.instagram.followers.myapplication.models.ProductItem
import retrofit2.Response

import retrofit2.http.GET

interface FakerApi {

    @GET("products")
    suspend fun getProducts() : Response<List<ProductItem>>
}