package com.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {
    @Test
    public void test1(){
        Person person = new Person(1,"joker");
        Gson gson = new Gson();

        String personJsonString = gson.toJson(person);
        System.out.println(personJsonString);

        Person person1 = gson.fromJson(personJsonString, Person.class);
        System.out.println(person1);
    }
    @Test
    public void test2(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(1,"joker"));
        personList.add(new Person(2,"wxk"));

        Gson gson = new Gson();
        String personListJsonString = gson.toJson(personList);
        System.out.println(personListJsonString);

        List<Person> list  = gson.fromJson(personListJsonString, new PersonListType().getType());
        System.out.println(list);
        Person person = list.get(0);
        System.out.println(person);
    }
    @Test
    public void test3(){
        Map<Integer,Person> personMap = new HashMap<Integer,Person>();
        personMap.put(1,new Person(1,"joker"));
        personMap.put(2,new Person(2,"wxk"));

        Gson gson = new Gson();
        String personMapJsonString = gson.toJson(personMap);
        System.out.println(personMapJsonString);

//        Map<Integer,Person> personMap1 = gson.fromJson(personMapJsonString, new PersonMapType().getType());
        Map<Integer,Person> personMap1 = gson.fromJson(personMapJsonString, new TypeToken<HashMap<Integer,Person>>(){}.getType());
        System.out.println(personMap1);

        Person person = personMap1.get(1);
        System.out.println(person);
    }
}
