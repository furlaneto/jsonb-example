package com.example;

import java.time.LocalDate;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class Main {

    public static void main (String[] args) {
        Jsonb jsonb = JsonbBuilder.create();

        User user = User.builder()
                .id(1)
                .name("Lucas")
                .username("furlaneto")
                .password("123")
                .email("lucas@techiohub.com")
                .createdAt(LocalDate.of(2018, 1, 1))
                .build();

        String jsonUser = jsonb.toJson(user);

        System.out.println(jsonUser);

        User userConverted = jsonb.fromJson(jsonUser, User.class);

        System.out.println(userConverted);
    }
}
