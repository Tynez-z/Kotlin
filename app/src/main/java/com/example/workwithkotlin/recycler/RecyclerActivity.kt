package com.example.workwithkotlin.recycler
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.workwithkotlin.R
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    private var titleList = mutableListOf<String>()
    private var descriptionList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        recycler_view.layoutManager = LinearLayoutManager(applicationContext)
        recycler_view.adapter = ItemsAdapter(titleList, descriptionList, imagesList)
        postToList()
    }

    private fun addToList(title: String, description: String, image: Int) {
        titleList.add(title)
        descriptionList.add(description)
        imagesList.add(image)
    }

    private fun postToList() {
        addToList("Yellow colour", getString(R.string.yellow), R.drawable.yellow)
        addToList("Red colour", getString(R.string.red), R.drawable.redjpg)
        addToList("Orange colour", getString(R.string.orange), R.drawable.orange)
        addToList("Green colour", getString(R.string.green), R.drawable.greenjpg)
        addToList("Black colour", getString(R.string.black), R.drawable.black)
    }
}