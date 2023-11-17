package get.instagram.followers.myapplication.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import get.instagram.followers.myapplication.models.ProductItem


@Dao
interface FakerDao {

    @Insert
  suspend fun addProduct(product:List<ProductItem>)


  @Query("SELECT * FROM productitem")
  suspend fun getProduct():List<ProductItem>
}