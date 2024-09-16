package com.meusestudos.springmongo.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    @EqualsAndHashCode.Include
    @Id
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

    @Getter
    @DBRef(lazy = true)
    private List<Post> posts = new ArrayList<>();

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
