package com.example.InstagramApi.core.results;

import lombok.Data;

@Data
public class SuccesResult extends Result{




    public SuccesResult(String message) {
        super(true,message);
    }
}
