package com.Nazhim.finalku.data.api.repository;

import com.Nazhim.finalku.data.api.Service;
import com.Nazhim.finalku.data.api.repository.callback.OnCallBack;
import com.Nazhim.finalku.data.api.repository.callback.OnCastCallBack;
import com.Nazhim.finalku.data.api.repository.callback.OnDetailCallBack;
import com.Nazhim.finalku.data.api.repository.callback.OnSearchCallBack;

public abstract class Repository<T> {
    protected Service service;

    protected abstract void getModel(int page, final OnCallBack<T> callback);
    protected abstract void getModelDetail(int id, final OnDetailCallBack<T> callback);
    protected abstract void search(String query, int page, final OnSearchCallBack<T> callback);
    protected abstract void getCasts(int id, OnCastCallBack callback);
}
