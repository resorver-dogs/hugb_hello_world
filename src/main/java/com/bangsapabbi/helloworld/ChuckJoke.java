package com.bangsapabbi.helloworld;

import net.joningi.icndb.ICNDBClient;
import net.joningi.icndb.Joke;

public class ChuckJoke {

    //private String greeting = "Hello world!";
   public String random() {

	ICNDBClient client = new ICNDBClient();

    	Joke randomJoke = client.getRandom();

        return randomJoke.getJoke();
    }
}
