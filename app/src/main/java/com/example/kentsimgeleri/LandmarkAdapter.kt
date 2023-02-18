package com.example.kentsimgeleri

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.kentsimgeleri.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList : ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerViewNameText.text = landmarkList[position].name
        holder.binding.recyclerViewCityText.text = landmarkList[position].cityName
        holder.binding.imageView.setImageResource(landmarkList[position].image)
        holder.itemView.setOnClickListener{

        val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(landmarkList[position])
        Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }


}