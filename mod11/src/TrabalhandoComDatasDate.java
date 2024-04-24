
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igor
 */
public class TrabalhandoComDatasDate {

    public static void main(String[] args) throws ParseException {

        //n sei se funfa
        Locale.setDefault(Locale.forLanguageTag("PT-BR"));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        simpleDateFormat3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = simpleDateFormat.parse("25/06/2018");
        Date v2 = simpleDateFormat2.parse("25/06/2018 15:42:07");
        Date x1 = new Date();

        //ele pega o instante do meu sistema converte para milisegundo e cria a data
        simpleDateFormat3.format(x1);
        Date x2 = new Date(System.currentTimeMillis());

        //padrao iso8601
        Date x = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("**********************************************");
        System.out.println("y1 " + simpleDateFormat.format(y1));
        System.out.println("v1 " + simpleDateFormat2.format(v2));
        System.out.println("x1 " + x1);
        System.out.println("x2 " + x2);

        //as datas sao impressas de acordo com a data da maquina local
        System.out.println("ISO " + simpleDateFormat2.format(x));

        System.out.println("**********************************************");
        System.out.println("y1 " + simpleDateFormat.format(y1));
        System.out.println("v1 " + simpleDateFormat3.format(v2));
        System.out.println("x1 " + simpleDateFormat3.format(x1));
        System.out.println("x2 " + simpleDateFormat3.format(x2));

        //as datas sao impressas de acordo com a data da maquina local
        System.out.println("ISO " + simpleDateFormat3.format(x));

    }

}
