package org.example;

import java.util.ArrayList;

public class QuadraticRoots {

    static ArrayList<Integer> quadraticRoots(int a, int b, int c) {

        ArrayList<Integer> list = new ArrayList<>();

        double v = Math.sqrt(b*b - 4*a*c);

        long r = (long) Math.sqrt(b*b - 4*a*c);
        System.out.println(v);
        System.out.println(r);
        int x1, x2;

        x1 = Math.toIntExact((-b + r)/(2*a));

        x2 = Math.toIntExact((-b - r)/(2*a));

        if (x1 > x2) {
            list.add(x1);
            list.add(x2);
        }
        else {
            list.add(x2);
            list.add(x1);
        }

        return list;
    }

    public static void main(String[] args) {

        quadraticRoots(752 ,904, 164);


    }
}
