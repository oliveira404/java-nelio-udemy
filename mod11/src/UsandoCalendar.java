
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class UsandoCalendar {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(f.format(d));
        
        
        //Adicionando unidade a uma data
        /*Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(d);*/
        
        //Obtendo unidade de tempo de uma data
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        int mes = cal.get(Calendar.MONTH);
        System.out.println("minutos: " + minutes);
        
        //como o mes 1 começa no zero temos q add + 1;
        System.out.println("mês: " + (mes + 1));
        
    }
}
