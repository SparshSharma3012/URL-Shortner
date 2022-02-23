package com.example.URLshortner.Data.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name="url")
@Table(name="url")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Url {
    @Id
    private String urlkey;
    private Date created_at;
    private Date expiration_date;
    private String user_id;
    private String original_url;
}
