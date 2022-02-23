package com.example.URLshortner.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

@Configuration
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrlShort {
    @Value("${urlshort.prefix}")
    private String prefix;

    @Value("${urlshort.domain}")
    private String domain;
}
