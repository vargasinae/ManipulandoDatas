package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*Projeto apenas para treinar manipulação de datas no Java*/
public class Main {
    public static void main(String[] args) {

       //data de agora ➞ data-hora
        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
       //data de agora ➞ data-hora global
        Instant data3 = Instant.now();
       //data em Texto ISO 8601 ➞ Data-hora
        LocalDate data4 = LocalDate.parse("2023-01-31"); //entre parênteses, colocar um texto no formato ISO 8601 de data
        LocalDateTime data5 = LocalDateTime.parse("2023-01-31T00:52:26");
        Instant data6 = Instant.parse("2023-01-31T00:52:26Z");
        Instant data7 = Instant.parse("2023-01-31T00:52:26-03:00");

       //Texto em formato customizado, diferente do ISO ➞ Data-hora, usando o DateTimeFormat
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");//a varável formar recebe o date time formatter com o padrão do texto dd/MM/yyyy, para oprograma entender como quero ler aquele texo para transformar em data

        LocalDate data8 = LocalDate.parse("31/01/2023", format); // aí aqui eu coloco a variável que eu criei que informa como que eu leio aquele texto :)
        //Posso escrever assim também, colocando direto o argumento como parâmetro: LocalDate data8 = LocalDate.parse("31/01/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate data9 = LocalDate.parse("31/01/2023 01:06", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));// aí aqui eu coloco a variável que eu criei que informa como que eu leio aquele texto :)

       //dia, mês, ano, [horário] ➞ Data-hora local
        LocalDate data10 = LocalDate.of(2023, 01, 31);
        LocalDateTime data11 = LocalDateTime.of(2023, 01, 31, 01, 12);

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
        System.out.println("data3 = " + data3);
        System.out.println("data4 = " + data4);
        System.out.println("data5 = " + data5);
        System.out.println("data6 = " + data6);
        System.out.println("data7 = " + data7);
        System.out.println("data8 = " + data8);
        System.out.println("data9 = " + data9);
        System.out.println("data10 = " + data10);
        System.out.println("data11 = " + data11);
    }
}