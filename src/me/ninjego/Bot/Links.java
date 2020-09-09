package me.ninjego.Bot;

import java.util.Random;

public enum Links {
	
	;
	
    public static Links generateRandomLink() {
		Links[] values = Links.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
    
    public static int getAmount() {
    	Links[] values = Links.values();
    	return values.length;
    }

}
	