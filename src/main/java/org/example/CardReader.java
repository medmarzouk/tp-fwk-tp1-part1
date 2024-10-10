package org.example;

import java.util.List;
import java.util.Scanner;

public class CardReader {
    List<Long> ids;

    public CardReader(List<Long> ids) {
        this.ids = ids;
    }
    public void run(){
        while (true) {
            ids.add(readCard());
        }
    }
    public Long readCard(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Id of the card");
        long id = s.nextByte();
        return id;
    }

}
