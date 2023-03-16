package org.lessons.java.christmas;

import java.util.*;

public class Main {

    public static void main(String[] arg){

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

        System.out.println("La tua lista dei desideri:");
        for (String wish : desires) {
            System.out.println(wish);
        }

    }



}
