package com.meusestudos.springmongo.domain;

import com.meusestudos.springmongo.DTO.AuthorDTO;
import com.meusestudos.springmongo.DTO.CommentDTO;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Document("post")
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;

    @Setter(AccessLevel.NONE)
    private List<CommentDTO> comments = new ArrayList<>();

    public Post(String id, Date date, String title, String body, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }
}
