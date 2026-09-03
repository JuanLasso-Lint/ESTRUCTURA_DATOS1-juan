package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] Acensor = {"Piso 1", "Piso 2", "Piso 3", "Piso 4"};
        SubirBajar(Acensor, 0);
    }

    public static void SubirBajar(String[] Acensor, int i) {
        if (i == Acensor.length) {
            return;
        }
        if (i < Acensor.length - 1) {
            System.out.println("Esta en " + Acensor[i] + " Subiendo al " + Acensor[Math.min(i + 1, 3)]);
        }else{
            System.out.println("Esta en " + Acensor[i] + " Este es el ultimo piso");
        }
        SubirBajar(Acensor, i + 1);

        System.out.println("Esta een el " +  Acensor[i] + " Bajando al " + Acensor[Math.min(i - 1, 3)]);

    }



}