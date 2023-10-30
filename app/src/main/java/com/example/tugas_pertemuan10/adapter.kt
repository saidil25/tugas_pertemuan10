package com.example.tugas_pertemuan10

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


 class adapter(private var MovieList: ArrayList<movies>): RecyclerView.Adapter<adapter.MovieViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val MovieView = LayoutInflater.from(parent.context).inflate(R.layout.card,parent,false)
        return MovieViewHolder(MovieView)
    }

     override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
         val currentMovie = MovieList[position]
         holder.imageMovie.setImageResource(currentMovie.imageMovie)
         holder.titleMovie.text = currentMovie.title

         Glide.with(holder.itemView.context).load(currentMovie.imageMovie).centerCrop().into(holder.imageMovie)

         }



     override fun getItemCount(): Int {
        return MovieList.size
    }
    class MovieViewHolder(MovieView: View):RecyclerView.ViewHolder(MovieView){
        val imageMovie : ImageView = MovieView.findViewById(R.id.image_movie)
        val titleMovie : TextView = MovieView.findViewById(R.id.judul_movie)
    }
}

