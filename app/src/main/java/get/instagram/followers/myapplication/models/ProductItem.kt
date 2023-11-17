package get.instagram.followers.myapplication.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class ProductItem(

    @PrimaryKey(autoGenerate = false)
    @SerializedName("id"          ) var id: Int?    = null,
                       @SerializedName("title"       ) var title       : String? = null,
                       @SerializedName("price"       ) var price       : Double? = null,
                       @SerializedName("description" ) var description : String? = null,
                       @SerializedName("category"    ) var category    : String? = null,
                       @SerializedName("image"       ) var image       : String? = null,
                       )
