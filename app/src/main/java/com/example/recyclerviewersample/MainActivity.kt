package com.example.recyclerviewersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewersample.Adapter.Adapter
import com.example.recyclerviewersample.dataSource.FamilyMemberData
import com.example.recyclerviewersample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        //val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)
        binding.RecyclerView.adapter = Adapter(FamilyMemberData.FamilyMemberList)
    }
}