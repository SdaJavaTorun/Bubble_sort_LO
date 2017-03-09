package com.sdajava.bubble;

public class Main {

    public static void main(String[] args) {

        int[] tab = {5,3,6,7,3,4,2,5,35,26,33,23,4,2};
        boolean flag = false;

        for(int i=0; (i<tab.length-1) && flag; i++){

            flag = false;

            for(int j=0; j<tab.length-1; j++){

                if(tab[j] > tab[j+1]){

                    int tmp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = tmp;

                    flag = true;
                }
            }
        }

        //tablica po sortowaniu

        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }

    }
}
