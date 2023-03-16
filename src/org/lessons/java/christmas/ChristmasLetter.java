package org.lessons.java.christmas;

import java.util.List;
import java.util.Random;
import java.util.TooManyListenersException;

public class ChristmasLetter {

    private String name;
    private String address;
    private List<String> desires;

    public ChristmasLetter(String name, String address, List<String> desires) {
        this.name = name;
        this.address = address;
        this.desires = desires;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getDesires() {
        return desires;
    }

    public void setDesires(List<String> desires) {
        this.desires = desires;
    }

    public void send() throws Exception {

        Random rand = new Random();
        boolean bad = rand.nextBoolean();

        if(desires.size() > 5){
            throw new Exception("Troppi desideri nella lista!");
        }


        if(bad){
            throw new Exception("Sei stato cattivo");
        }

        System.out.println("Dettagli lista:");
        System.out.println("Mittente: " + name);
        System.out.println("Indirizzo: " + address);
        System.out.println("Lista desideri: " + desires);

    }

}
