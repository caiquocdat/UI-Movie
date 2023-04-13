package com.example.movie.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movie.R;
import com.example.movie.model.MoviesModel;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>{
    private Context context;
    private List<MoviesModel> mListMovie;

    public MovieAdapter(Context context, List<MoviesModel> mListMovie) {
        this.context = context;
        this.mListMovie = mListMovie;
    }
    public void setData(List<MoviesModel> list){
        this.mListMovie=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movies,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        MoviesModel moviesModel= mListMovie.get(position);
        if(moviesModel==null){
            return;
        }
        String urlPicture=moviesModel.getLinkPicture();
        holder.kindOfMovieTv.setText(moviesModel.getKindOfMovie());
        holder.nameMovieTv.setText(moviesModel.getNameMovie());
        try {
            Picasso.get().load(urlPicture).placeholder(R.drawable.ic_launcher_background).into(holder.imgMovie);
        }catch (Exception e){

        }

    }

    @Override
    public int getItemCount() {
        if(mListMovie!=null){
            return mListMovie.size();
        }
        return 0;
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgMovie;
        private TextView nameMovieTv,kindOfMovieTv;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMovie=itemView.findViewById(R.id.img_movie);
            nameMovieTv=itemView.findViewById(R.id.nameMovieTv);
            kindOfMovieTv=itemView.findViewById(R.id.kindOfMovieTv);
        }
    }

    }

