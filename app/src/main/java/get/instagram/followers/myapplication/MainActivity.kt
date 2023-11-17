package get.instagram.followers.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import get.instagram.followers.myapplication.viewModels.MainViewModel
import get.instagram.followers.myapplication.viewModels.MainViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory

    private val product:TextView
        get() =findViewById(R.id.textview)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as FakerApplication).application.inject(this)
        mainViewModel=ViewModelProvider(this,mainViewModelFactory).get(MainViewModel::class.java)

        mainViewModel.productLiveData.observe(this, Observer {
            product.text=it.joinToString { x->
                x.title +"\n\n"
            }
        })
    }
}