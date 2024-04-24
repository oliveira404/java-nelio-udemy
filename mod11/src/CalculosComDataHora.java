
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igor
 */
public class CalculosComDataHora {

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:36");
        Instant d06 = Instant.parse("2022-07-20T01:00:00Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("past: " + pastWeekLocalDate + " next: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("past: " + pastWeekLocalDateTime + " next: " + nextWeekLocalDateTime);

        Instant pastWeekDateInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("past: " + pastWeekDateInstant + " next: " + nextWeekInstant);
        
        //Duração 
        Duration d1 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("dias " + d1.toDays());
        
        //Duração e conversao / veja q o atTime converte para DateTime coisa q p duration aceita.
        //pode usar oto método inves do atTime q fará a mesma coisa veja o segundo exemplo
        //onde o método atStartOfDay converte o dia para a meia noite.
        Duration d2 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atStartOfDay());
        System.out.println("dias " + d2.toDays());
        
        Duration d3 = Duration.between(pastWeekDateInstant, d06);
        System.out.println("dias " + d3.toDays());
        
        //ele tmb faz diferença com data negativa até a positiva
        Duration d4 = Duration.between(d06, pastWeekDateInstant);
        System.out.println("dias " + d4.toDays());
        

    }

}
