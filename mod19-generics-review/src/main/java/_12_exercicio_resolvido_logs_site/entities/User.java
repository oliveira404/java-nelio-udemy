package _12_exercicio_resolvido_logs_site.entities;

import java.time.LocalDateTime;

public class User {

    private String name;
    private LocalDateTime date;

    public User(String name, LocalDateTime date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
