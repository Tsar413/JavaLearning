package com.company.javaRelearn;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class ThreatAnalyzer_2022_8_19 {
    static String threatData =
            "58.72.82.161@02/10/2005\n" +
            "204.45.234.40@02/11/2002\n" +
            "58.72.82.161@02/11/2005\n" +
            "58.72.82.161@02/12/2005\n" +
            "58.72.82.161@02/12/2005\n";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" +
                "(\\d{2}/\\d{2}/\\d{4})";
        while (scanner.hasNext(pattern)) {
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format("Threat on %s from %s\n", date, ip);
        }
    }
}
