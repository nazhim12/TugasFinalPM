package com.Nazhim.finalku.data.api.repository.callback;

import com.Nazhim.finalku.data.models.Cast;

import java.util.List;

public interface OnCastCallBack {
    void onSuccess(List<Cast> castList, String message);
    void onFailure(String message);
}
