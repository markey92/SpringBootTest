package com.markey.justtest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(12);
        person.setName("abc");

        ObjectMapper mapper = new ObjectMapper();
        try {
            String personString = mapper.writeValueAsString(person);
            System.out.println(personString);
            Person person1A = mapper.readValue("{\"age\":\"12\",\"name\":\"abc\"}", Person.class);
            System.out.println(person1A.toString());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
