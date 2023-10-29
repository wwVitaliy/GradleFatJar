package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        UserName name = new UserName("Vitalii", "Shliakhetko");
        String nameJson = gson.toJson(name);

        System.out.println(nameJson);

    }
}