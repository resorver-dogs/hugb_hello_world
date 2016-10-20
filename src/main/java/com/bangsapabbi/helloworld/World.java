package com.bangsapabbi.helloworld;

import net.joningi.icndb.ICNDBClient;
import net.joningi.icndb.Joke;

public class World {

    //private String greeting = "Hello world!";
   public String greet() {

	ICNDBClient client = new ICNDBClient();

    	Joke randomJoke = client.getRandom();

        return randomJoke.getJoke();
    }
}
