
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igor
 */
public class CorvertendoDataHoraParaLocal {

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:36");

        System.out.println("d04 dia " + d04.getDayOfMonth());
        System.out.println("d04 mes " + d04.getMonthValue());
        System.out.println("d04 mes nome " + d04.getMonth());
        
        System.out.println("d05 hora " + d05.getHour());
    }
}
