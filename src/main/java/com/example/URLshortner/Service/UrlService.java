package com.example.URLshortner.Service;

import com.example.URLshortner.Configuration.UrlShort;
import com.example.URLshortner.Data.Entity.Url;
import com.example.URLshortner.Data.Request.CreateUrlRequest;
import com.example.URLshortner.Data.Response.CreateUrlResponse;
import com.example.URLshortner.Repository.UrlRepository;
import com.example.URLshortner.Utility.HashUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UrlService {
    @Autowired
    UrlRepository urlRepository;

    @Autowired
    private HashUtility hashUtility;

    @Autowired
    private UrlShort urlShort;

    public String createUrl(CreateUrlRequest createUrlRequest)
    {
        Url url = Url.builder()
                .original_url(createUrlRequest.getOriginalUrl())
                .user_id(createUrlRequest.getUserId())
                .created_at(new Date())
                .urlkey(hashUtility.getKey(createUrlRequest.getOriginalUrl()))
                .build();

        urlRepository.createUrl((url));
        return (urlShort.getDomain() + urlShort.getPrefix() + url.getUrlkey());
    }

    public String getOriginalUrlFromKey(String key){
        Url url =urlRepository.getByKey(key);
        if(url!=null){
            return url.getOriginal_url();
        }
        return null;
    }

    public void deleteUrl(String key)
    {
        Url url = urlRepository.getByKey(key);
        urlRepository.deleteUrl(url);
    }
}
