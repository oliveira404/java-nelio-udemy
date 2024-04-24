
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igor
 */
public class ConversaoDataParaTexto {

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:36");
        Instant d06 = Instant.parse("2022-07-20T01:00:00Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        //ISO_DATE_TIME LOCAL
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 sem formatação: " + d04);
        System.out.println("d04 com formatação: " + d04.format(fmt1));
        //Ouu
        System.out.println(fmt1.format(d04));
        //Ou...
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 com formatação: " + d05.format(fmt2));
        System.out.println("d05 com formatação: " + d05.format(fmt4));

        System.out.println("d06 " + fmt3.format(d06));
        System.out.println("d06 " + fmt5.format(d06));
    }
}
