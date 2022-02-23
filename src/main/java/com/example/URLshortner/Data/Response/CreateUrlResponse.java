package com.example.URLshortner.Data.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUrlResponse {
    private boolean issuccess;
    private String url;
    private String msg;
    private String originalUrl;
}
