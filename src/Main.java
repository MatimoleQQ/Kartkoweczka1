

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        //Zadanie 1 - wylosuj 20 liczb z zakresu od 1 do 50 w dowolnej zmiennej
        //Zadanie 2 - przygotuj zmienna zaweirajaca liczby z pierwszego zadania bez powtorzen
        //Zadanie 3 - Wypisz z tablicy liczby pierwsze
        //Zadanie 4 - Znajdz najdluzszy ciag rosnący w elementach z zadania 1
//Zadanie 1
         int[] Zmienna = new int[20];
         for(int i = 0 ; i < 20; i++)
        {
            Zmienna[i] = (int) (Math.random()*50+1);
            System.out.print(Zmienna[i] + " ");
        }
//Zadanie 2
        int count=20;
        int howMany=0;
        float ilosc = 0;
        for(int i =0 ; i<20; i++)
        {
            howMany = 0;

            for(int j =0 ; j < 20 ;  j++)
            {

                if(Zmienna[i] == Zmienna[j])
                {
                    howMany= howMany+1;
                }

            }

            count=(Count)- (howMany-1);
        }


        System.out.println("Miejsc w tabeli;"+count);

        int[] ZmiennaBP = new int[count];

        for(int i = 0 ; i < count; i++)
        {

            for(int j =0; j <count ; j++)
            {
                if(ZmiennaBP[j] != Zmienna[i])
                    ZmiennaBP[i] = Zmienna[i];

            }
        }
        for(int test:ZmiennaBP)
            System.out.print(test +" ");

        //TEST
        Arrays.sort(Zmienna);
        System.out.println("");
        for(int cos: Zmienna)
            System.out.print(cos+" ");
        System.out.println("");
        Arrays.sort(ZmiennaBP);
        for(int cos: ZmiennaBP)
            System.out.print(cos+" ");


//Zadanie 3


            boolean[] Siatka = new boolean[20];
            for(int i =0 ; i<20 ; i++) {
                Siatka[i] = false;
            }



    }

}