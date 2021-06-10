package com.Nazhim.finalku.ui.adapters.clicklistener;

import com.Nazhim.finalku.data.models.Movie;
import com.Nazhim.finalku.data.models.TvShow;
import com.Nazhim.finalku.data.local.FavoriteMovie;
import com.Nazhim.finalku.data.local.FavoriteTv;

public interface OnItemClickListener {
    void onClick(TvShow tvShow);
    void onClick(Movie movie);
    void onClick(FavoriteMovie movie);
    void onClick(FavoriteTv tv);
}