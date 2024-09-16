package com.meusestudos.springmongo.DTO;

import com.meusestudos.springmongo.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public AuthorDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }
}
