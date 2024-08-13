package com.morse;

import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {

    }

    public static String decoder(String input) {

        StringBuilder decodedInput = new StringBuilder();
        Map<String, String> naturalDict = new HashMap<>();
        naturalDict.put("A", ".—");
        naturalDict.put("N", "—.");
        naturalDict.put("0", "—————");
        naturalDict.put("B", "—...");
        naturalDict.put("Ñ", "——.——");
        naturalDict.put("1", ".————");
        naturalDict.put("C", "—.—.");
        naturalDict.put("O", "———");
        naturalDict.put("2", "..———");
        naturalDict.put("CH", "————");
        naturalDict.put("P", ".——.");
        naturalDict.put("3", "...——");
        naturalDict.put("D", "—..");
        naturalDict.put("Q", "——.—");
        naturalDict.put("4", "....—");
        naturalDict.put("E", ".");
        naturalDict.put("R", ".—.");
        naturalDict.put("5", ".....");
        naturalDict.put("F", "..—.");
        naturalDict.put("S", "...");
        naturalDict.put("6", "—....");
        naturalDict.put("G", "——.");
        naturalDict.put("T", "—");
        naturalDict.put("7", "——...");
        naturalDict.put("H", "....");
        naturalDict.put("U", "..—");
        naturalDict.put("8", "———..");
        naturalDict.put("I", "..");
        naturalDict.put("V", "...—");
        naturalDict.put("9", "————.");
        naturalDict.put("J", ".———");
        naturalDict.put("W", ".——");
        naturalDict.put(".", ".—.—.—");
        naturalDict.put("K", "—.—");
        naturalDict.put("X", "—..—");
        naturalDict.put(",", "——..——");
        naturalDict.put("L", ".—..");
        naturalDict.put("Y", "—.——");
        naturalDict.put("?", "..——..");
        naturalDict.put("M", "——");
        naturalDict.put("Z", "——..");
        naturalDict.put("\"", ".—..—.");
        naturalDict.put("/", "—..—");


        Map<String, String> morseDict = new HashMap<>();

        for (Map.Entry<String, String> entry : naturalDict.entrySet()) {
            morseDict.put(entry.getValue(), entry.getKey());
        }
        if (input.matches(".*[a-zA-Z0-9].*")) {
            int index = 0;
            boolean ch = false;

            for (char character : input.toUpperCase().toCharArray()) {
                int nextIndex = index + 1;
                if (character == 'C' && nextIndex < input.length() && input.toUpperCase().charAt(nextIndex) == 'H') {
                    decodedInput.append(naturalDict.get("CH"));
                    ch = true;
                } else {
                    decodedInput.append(naturalDict.get(Character.toString(character)));
                }

                decodedInput.append(" ");
            } else{
                if (!ch) {
                    decodedInput.append(" ");
                }
                ch = false;
            }

            index++;
        }

    } else if(input.contains(".")||input.contains("—"))

    {

        // Morse

        String[] words = input.split("  ");
        for (String word : words) {
            String[] symbols = word.split(" ");
            for (String symbol : symbols) {
                if (!symbol.isEmpty()) {
                    decodedInput.append(morseDict.get(symbol));
                }
            }
            decodedInput.append(" ");
        }
    }

        return decodedInput.toString();

}

}
