package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Weight in kg.
//Height in metres.
class sample {
    public static void main (String[] args) throws IOException {
        BufferedReader cell = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите свой вес в кг.");
        String w1 = cell.readLine();
        double w2 = Double.parseDouble(w1);
        System.out.println("Введите свой рост в метрах");
        String h1 = cell.readLine();
        double h2 = Double.parseDouble(h1);
        humanIMB humanIMB = new humanIMB(w2, h2);
        System.out.println(humanIMB.Result());
    }
}
class humanIMB {
    private double W; //Weight Human
    private double H; // Height Human
    private static double imb;
    humanIMB(double w, double h) {
        W = w;
        H = h;
        imb = W / (H * H);
    }

    public static String Result() {
        String  string=null;
        if (imb >=18.5 & imb <25) {
            string ="Норма, ты в форме!" + " = " + imb;
        }
        if (imb >=25 & imb <30) {
            string ="Предожирение. Эй, поосторожнее с пирожными " + " = " + imb;
        }
        if (imb >=30) {
            string ="Ожирение. SCHWEINE! Хватит жрать, иди на треню!" + " = " + imb;
        }
        if (imb <18.5) {
            string ="Дефицит массы тела. В модели решил переквалифицироваться?" + " = " + imb;
        }
        return string;
    }
}