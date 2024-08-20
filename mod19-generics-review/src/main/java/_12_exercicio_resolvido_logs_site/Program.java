package _12_exercicio_resolvido_logs_site;

import _12_exercicio_resolvido_logs_site.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> logEntries = new HashSet<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                String userName = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                logEntries.add(new LogEntry(userName, moment));

                line = br.readLine();
            }
            System.out.println("Total Users: " + logEntries.size());


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();

    }
}

//caminho
///home/shark/workspace/back-end/java-nelio-udemy/mod19-generics-review/src/main/java/_12_exercicio_resolvido_logs_site/log.txt