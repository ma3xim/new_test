package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
     Artifacts art1 = new Artifacts(5523);
     Artifacts art2 = new Artifacts(6531, " Aztec ");
     Artifacts art3 = new Artifacts(6674, " Shoomer ", 4);

     System.out.println(art1.number);
     System.out.println(art2.number + art2.culture);
     System.out.println(art3.number + art3.culture + art3.century);
    }
}

