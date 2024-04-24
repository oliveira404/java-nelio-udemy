
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
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
public class Datas {

    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        //Pega horário de londres
        Instant d03 = Instant.now();

        //Usando um padrão do ISO 8601
        LocalDate d04 = LocalDate.parse("2022-07-20");

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:36");

        //Padrão londres Zulu time
        Instant d06 = Instant.parse("2022-07-20T01:30:36Z");

        //Padrão Brasília agora | esse n deu certo em
        //Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);

        //pode fazer assim tmb
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30:50", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        LocalDate d10 = LocalDate.of(2022, 7, 20);

        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        //Ele imprime pq tem um .toString explícito
        System.out.println(d01.toString());
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        //System.out.println(d07.toString());
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);

        System.out.println("local " + LocalDateTime.now());
        System.out.println("global londrês" + Instant.now());
    }
}
