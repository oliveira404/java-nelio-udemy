package com.meusestudos.springmongo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String text;
    private Date date;
    private AuthorDTO author;
}
