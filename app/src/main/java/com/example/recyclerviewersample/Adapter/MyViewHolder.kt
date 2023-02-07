package com.example.recyclerviewersample.Adapter

import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewersample.activity2
import com.example.recyclerviewersample.databinding.ItemBinding
import com.example.recyclerviewersample.model.FamilyMember

class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemBinding.bind(view)
    private var price = 0
    private var description = ""

    /*
        val memberName = view.findViewById<TextView>(R.id.item_text)
        val memberPhoto = view.findViewById<ImageView>(R.id.item_image)
     */


    fun render(memberInformation: FamilyMember){
        /*
            memberName.text = memberInformation.name
            memberPhoto.setImageResource(memberInformation.picture)
         */

        binding.itemText.text = memberInformation.name
        binding.itemImage.setImageResource(memberInformation.picture)

        /* TO ONLY CLICK ON IMAGE
                binding.itemImage.setOnClickListener{
            Toast.makeText(binding.itemImage.context, "Works!", Toast.LENGTH_SHORT).show()
        }
         */

        // TO CLICK ANYWHERE.. Note: In text you can change memberInformation.name for "anything string"
        itemView.setOnClickListener{

            val intent = Intent(binding.itemImage.context, activity2:: class.java)
            intent.putExtra("Num", price)
            intent.putExtra("Des", description)
            startActivity(binding.itemImage.context, intent, null)

        }
    }

    fun setPrice(pos : Int){
        this.price = when(pos){
            0 -> 150
            1 -> 175
            2 -> 200
            3 -> 225
            4 -> 250
            5 -> 275
            6 -> 300
            7 -> 325
            8 -> 350
            else -> 400
        }
    }

    fun setDescription(pos: Int){
        this.description = when(pos){
            0 -> "This number is 0"
            1 -> "This number is 1"
            2 -> "This number is 2"
            3 -> "This number is 3"
            4 -> "This number is 4"
            5 -> "This number is 5"
            6 -> "This number is 6"
            7 -> "This number is 7"
            8 -> "This number is 8"
            else -> "This number is 9"
        }
    }

}