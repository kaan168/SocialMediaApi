package com.example.InstagramApi.core.results;

import lombok.Data;

@Data
public class ErrorResult extends Result{

    public ErrorResult(String message) {
        super(false, message);
    }
}
