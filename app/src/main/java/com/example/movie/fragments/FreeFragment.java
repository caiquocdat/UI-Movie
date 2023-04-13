package com.example.movie.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.movie.R;
import com.example.movie.adapter.MovieAdapter;
import com.example.movie.model.MoviesModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class FreeFragment extends Fragment {
    private RecyclerView rcvMoives;
    private MovieAdapter mMovieAdapter;
    private List<MoviesModel> mListMovie,mListMovieCopy;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_free, container, false);
        rcvMoives=view.findViewById(R.id.rvc_movies);
        mListMovie= new ArrayList<>();
        mMovieAdapter=new MovieAdapter(getActivity(),mListMovie);
        GridLayoutManager layoutManager= new GridLayoutManager(getActivity(),3);
        rcvMoives.setLayoutManager(layoutManager);
        mMovieAdapter.setData(getListMovie());
        rcvMoives.setAdapter(mMovieAdapter);
        return view;

    }

    private List<MoviesModel> getListMovie() {
        mListMovie.add(new MoviesModel("Trường Nguyệt Tẫn Minh","Tình cảm","China","Bạch Lộc, La Vân Hi...","45p","https://motchill.tv/phim/truong-nguyet-tan-minh-11140.html","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFVvcfesbh5n7KhqlBUxovaMEhHP0rA3qZaWZwo8GikOxShQWu"));
        mListMovie.add(new MoviesModel("Học kỳ sinh tử","Hành động","Korea","Shin Hyun Soo, Lee Soon Won...","60p","https://motchill.tv/phim/truong-nguyet-tan-minh-11140.html","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSLitTZMAEpTYbIxzN8oXieckEATFm9axDSpXjXcDXoP4qun6SS"));
        mListMovie.add(new MoviesModel("Dali và hoàng tử ngổ ngáo","Hài hước","Korea","Park Gyu Young, Kim Min Jae...","60p","https://motchill.tv/phim/truong-nguyet-tan-minh-11140.html","https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQDU2n_MWn4j_ck3PrSM3okxvbSRRTf6lII8it9Fma4OQcSyZ2d"));
        mListMovie.add(new MoviesModel("Thao thiết ký","Tình cảm","China","An Duyệt Khê, Vương Hựu Thạc...","60p","https://motchill.tv/phim/truong-nguyet-tan-minh-11140.html","https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcS6ByTOv8whSiwl_CasCBoI01hQtfJ2Y2Y14wl2qCqnI4fipgao"));
        mListMovie.add(new MoviesModel("Sát thủ John Wick 4","Hành động","America","Keanu Reeves, Laurence Fishburne...","150p","https://motchill.tv/phim/truong-nguyet-tan-minh-11140.html","https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRQNDKrsHV5ZVX0rPmZb8PRi9Y_PyqAulZC8i79R66vKEOWJ8ka"));
        mListMovie.add(new MoviesModel("Avatar","Hoạt hình","America","Sam Worthington, Zoe Saldana...","160p","https://motchill.tv/phim/truong-nguyet-tan-minh-11140.html","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ14xieySqTYJb5QjUoZ0Fq1HoOqEA6xt0IRSO75RYSbpWfQgjq"));
        mListMovie.add(new MoviesModel("Chị chị em em 2","Tình cảm","Vietnam","Ngọc Trinh, Minh Hằng...","130p","https://motchill.tv/phim/truong-nguyet-tan-minh-11140.html","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLUXq8yuvg5E5rN8QuODc1S9v-TG5bfYOhZ7QNgFXMPusyo00z"));
        mListMovie.add(new MoviesModel("Tro tàn rực rở","Hành động","Vietnam","Phương Anh Đào, Juliet Bảo Ngọc Doling...","140p","https://motchill.tv/phim/truong-nguyet-tan-minh-11140.html","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRz7v9G899w-ZqNdPfaCKZ-dWl17CTMIK1OVXZ3Nb0krhs_2e_a"));
        mListMovie.add(new MoviesModel("Cuộc chiến xuyên không","Hài hước","Korea","Ryu Joon Yeol, Kim Tae Ri...","150p","https://motchill.tv/phim/truong-nguyet-tan-minh-11140.html","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcR2zO3qot0in55NLpksWnsSX56H-DRIa_wXZdB8esGmMpPYeDSL"));
        mListMovie.add(new MoviesModel("Bay vào tử địa","Kinh dị","America","Gerard Butler, Daniella Pineda...","200p","https://motchill.tv/phim/truong-nguyet-tan-minh-11140.html","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRF3fEl6shVMWCQDbfXTca7SS3DoKowSjM2IOMG_GZh7B092YVj"));
        return mListMovie;
    }

    private void searchMovie(String query) {

        mListMovieCopy=new ArrayList<>();
        for(MoviesModel moviesModel:mListMovie){
            String nameMovie=moviesModel.getNameMovie();
            if (nameMovie.toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT))){
                mListMovieCopy.add(moviesModel);
            }
            MovieAdapter movieAdapter= new MovieAdapter(getActivity(),mListMovieCopy);
            rcvMoives.setAdapter(movieAdapter);
        }
    }
    private void loadAllMovie() {
        mListMovieCopy=new ArrayList<>();
        for(MoviesModel moviesModel:mListMovie){
            mListMovieCopy.add(moviesModel);
            MovieAdapter movieAdapter= new MovieAdapter(getActivity(),mListMovieCopy);
            rcvMoives.setAdapter(movieAdapter);
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu,MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main,menu);
        MenuItem item= menu.findItem(R.id.acciton_search);
        SearchView searchView= (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if (!TextUtils.isEmpty(s.trim()))
                {
                    searchMovie(s);
                }else{
                    loadAllMovie();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (!TextUtils.isEmpty(s.trim()))
                {
                    searchMovie(s);
                }else{
                    loadAllMovie();
                }
                return false;
            }
        });

        super.onCreateOptionsMenu(menu, inflater);
    }


}