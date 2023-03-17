package org.lessons.java.christmas;

import java.util.*;

public class Main {

    public static void main(String[] arg) throws Exception {

        Scanner input = new Scanner(System.in);

        List<String> desires = new ArrayList<String>();

        boolean stop = false;

        while(!stop){
            String newWish;
            String option;

            System.out.println("Inserisci un desiderio.");
            newWish = input.nextLine();
            if(newWish != "") {
                desires.add(newWish);
            }else {
                System.out.println("Inserire un desiderio valido");
            }
            if (desires.size() > 1 || desires.size() == 0) {
                System.out.println("Sono presenti " + desires.size() + " desideri");
            } else {
                System.out.println("Hai inserito " + desires.size() + " desiderio");
            }
            System.out.println(desires);

            System.out.println("Vuoi aggiungere altri desideri? (s / n)");
            option = input.nextLine();
            if(option.equalsIgnoreCase("n")){
                stop = true;
            }

        }

        Collections.sort(desires);

        System.out.println("La tua lista dei desideri:");
        for (String wish : desires) {
            System.out.println(wish);
        }

        System.out.println("Inserisci il tuo nome");
        String name = input.nextLine();

        System.out.println("Inserisci il tuo indirizzo");
        String address = input.nextLine();

        input.close();

        ChristmasLetter newLetter = new ChristmasLetter(name, address, desires);

        try {
            newLetter.send();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }



}
