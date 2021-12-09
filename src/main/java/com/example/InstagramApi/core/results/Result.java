package com.example.InstagramApi.core.results;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Result {

    private Boolean success;
    private String message;

    public Result(Boolean success) {
        this.success = success;
    }


    public Result(Boolean success, String message) {
        this(success);
        this.message = message;
    }


}
