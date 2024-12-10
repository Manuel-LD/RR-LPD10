package RR_LPD10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("amor", "love");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("árbol", "tree");
        diccionario.put("libro", "book");
        diccionario.put("computadora", "computer");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("puerta", "door");
        diccionario.put("ventana", "window");
        diccionario.put("noche", "night");
        diccionario.put("día", "day");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");
        diccionario.put("cielo", "sky");
        diccionario.put("sol", "sun");

        List<String> palabsEspañol = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabsEspañol);

        Scanner scanner = new Scanner(System.in);
        int corr = 0, incorr = 0;

        for (int i = 0; i < 5; i++) {
            String palabEspañol = palabsEspañol.get(i);
            System.out.print("Traduce al ingles la palabra '" + palabEspañol + "': ");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            if (respuesta.equals(diccionario.get(palabEspañol))) {
                corr++;
            } else {
                incorr++;
            }
        }

        System.out.println("Respuestas correctas: " + corr);
        System.out.println("Respuestas incorrectas: " + incorr);
    }
}