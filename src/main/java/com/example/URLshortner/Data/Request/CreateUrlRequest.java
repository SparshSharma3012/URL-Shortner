package com.example.URLshortner.Data.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CreateUrlRequest {
    private String originalUrl;
    private String userId;
    private String alias;
}
