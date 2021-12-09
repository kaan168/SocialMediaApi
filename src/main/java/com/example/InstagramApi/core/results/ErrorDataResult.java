package com.example.InstagramApi.core.results;

public class ErrorDataResult<T> extends DataResult{

    public ErrorDataResult(Object data) {
        super(false, data);
    }

    public ErrorDataResult(String message, Object data) {
        super(false, message, data);
    }
}
