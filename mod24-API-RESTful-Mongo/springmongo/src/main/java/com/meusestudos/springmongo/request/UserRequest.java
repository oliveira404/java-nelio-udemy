package com.meusestudos.springmongo.request;

import com.meusestudos.springmongo.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String email;

    public UserRequest(User obj) {
        this.name = obj.getName();
        this.email = obj.getEmail();
    }
}