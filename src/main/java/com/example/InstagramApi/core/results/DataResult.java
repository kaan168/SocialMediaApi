package com.example.InstagramApi.core.results;


import lombok.Data;

@Data
public class DataResult<T> extends Result{

    private T data;

    public DataResult(T data) {
        data = data;
    }

    public DataResult(Boolean success, T data) {
        super(success);
        data = data;
    }

    public DataResult(Boolean success, String message, T data) {
        super(success, message);
        data = data;
    }
}
