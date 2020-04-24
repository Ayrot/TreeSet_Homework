package com.company;

import java.util.*;

class School {
    String name;
    int number;
    School (String name, int number){
        this.name=name;
        this.number=number;
    }

    int num (int Number,String Name) {
        if (Name.length()<5) {
            if (Number % 2 == 0) {
                return 1;
            } else {
                return 2;
            }
        }else{
            return 0;
        }
    }

}
class Main{
    public static void main(String args[]){

        HashSet<Integer> hashset= new HashSet<Integer>();
        TreeSet<Integer> treeset = new TreeSet<Integer>();

        Scanner in = new Scanner (System.in);
        Scanner in1 = new Scanner (System.in);
        Scanner in2 = new Scanner (System.in);

        int a = 1;
        String Name = "";
        int Number = 0;
        while (a!=0) {
            System.out.println("Введите порядковый номер школы :   ");
            a = in.nextInt();
            if (a != 0){
                System.out.println("Введите название школы : ");
            Name = in2.nextLine();
            System.out.println("Введите номер школы : ");
            Number = in1.nextInt();

            School sc = new School(Name, Number);

            if (sc.num(Number, Name) == 1) {
                hashset.add(Number);
            } else {
                if (sc.num(Number, Name) == 2) {
                    treeset.add(Number);
                }
            }
        }
        }

        NavigableSet<Integer>  treereverse = treeset.descendingSet();
        Iterator<Integer> iterator = treereverse.iterator();
        System.out.println("\nValues using DescendingSet:");
        while (iterator.hasNext()) {
            System.out.print( iterator.next()+" ");
        }
        System.out.println("");
        System.out.println(hashset);
        //System.out.println(treeset);

    }

}

