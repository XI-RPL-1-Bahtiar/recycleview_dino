package com.example.recycleview_dino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val superheroList = listOf<Superhero>(
           Superhero(
               R.drawable.ironman,
               "Iron Man",
               "tony stark tony stark tony stark tony stark"
           ),
           Superhero(
               R.drawable.hulk,
               "The Hulk",
               "Rasaksa Hijau Rasaksa Hijau Rasaksa Hijau Rasaksa Hijau"
           ),
           Superhero(
               R.drawable.doctor,
               "Doctor Strange",
               "Pahlawan sihir Pahlawan sihir Pahlawan sihir Pahlawan sihir"
           ),
           Superhero(
               R.drawable.captain,
               "Captain America",
               "Pahlawan Armor Besi Pahlawan Armor Besi Pahlawan Armor Besi"
           )
       )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}