import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        System.out.println("Ramaniuk Mikhail,Р3122\n" + "Wariant №312209");

        //Задание 1
        short d = 5;
        short[] a = new short[10];
        System.out.println("1. Create a one-dimensional array a of type short. Fill it with odd numbers from 5 to 23 inclusive.");
        for(int i = 0;i < a.length; i++){
            a[i]=d;
            d+=2;
            System.out.printf("%d\t", a[i]);
        }

        //Задание 2
        float[] x = new float[20];
        float min_t = -2.0f;
        float max_t = 3.0f;
        System.out.println("\n2.Creating a one-dimensional x float type array.We fill it with 20 random numbers from -2.0 to 12.0");
        for(int i = 0;i < x.length;i++) {
            x[i]=(float) (random()*(max_t-min_t))+min_t;
            if (i % (x.length/4) == 0) {
                System.out.println(" ");
            }
            System.out.printf("%10.4f", x[i]);
        }

        //Задание 3
        System.out.println("\n3.Creating a two-dimensional array a_1 with dimensions of 10*20.");
        float[][] a_1 = new float[10][20];
        for(int i =0;i < a.length;i++){
            for(int j = 0;j < x.length;j++){
                if(a[i]==19){
                    a_1[i][j]=(float)pow((atan(cos(x[j]))),2*log(acos((x[j]+0.5)/5)));
                }else if (a[i]==5||a[i]==9||a[i]==13||a[i]==21||a[i]==23){
                    double f = acos(1/pow(E,abs(x[j])));
                    a_1[i][j]=(float) atan(1/pow(E,f));
                }else{
                    double k = 0.75/log(pow(tan(cbrt(cbrt(x[j]))),2));
                    a_1[i][j]=(float) pow(k,2);
                }
            }
        }
        //Выводим двумерный массив
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (j % x.length == 0) {
                    System.out.println(" ");
                }
                System.out.printf("%8.4f", a_1 [i][j]);
            }
        }
    }
}