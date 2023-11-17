package get.instagram.followers.myapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import get.instagram.followers.myapplication.models.ProductItem


@Database(entities = [ProductItem::class], version = 1)
abstract class FakerDb:RoomDatabase() {
    abstract fun getDao():FakerDao
}