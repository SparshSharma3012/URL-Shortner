package com.example.URLshortner.APIs;

import com.example.URLshortner.Data.Request.CreateUrlRequest;
import com.example.URLshortner.Data.Response.CreateUrlResponse;
import com.example.URLshortner.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping(value= "/url")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping("/create")
    @Transactional
    public CreateUrlResponse create(@RequestBody CreateUrlRequest createUrlRequest) {
        String url = urlService.createUrl(createUrlRequest);
        return CreateUrlResponse.builder()
                .issuccess(true)
                .url(url)
                .msg("Url generated Successfully")
                .build();
    }

    @DeleteMapping("/delete/{key}")
    @Transactional
    public ResponseEntity delete(@PathVariable String key) {
        urlService.deleteUrl(key);
        return ResponseEntity.ok().build();
    }
}

