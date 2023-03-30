import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        System.out.println("Романюк Михаил,Р3122\n" + "Вариант №312209");

        //Задание 1
        short d = 5;
        short[] a = new short[10];
        System.out.println("1.Создаем одномерный массив a типа short.Заполняем его нечетными числами от 5 до 23 включительно.");
        for(int i = 0;i < a.length; i++){
            a[i]=d;
            d+=2;
            System.out.printf("%d\t", a[i]);
        }

        //Задание 2
        float[] x = new float[20];
        float min_t = -2.0f;
        float max_t = 3.0f;
        System.out.println("\n2.Создаем одномерный массив x типа float.Заполняем его 20-ю случайными числами от -2.0 до 12.0");
        for(int i = 0;i < x.length;i++) {
            x[i]=(float) (random()*(max_t-min_t))+min_t;
            if (i % (x.length/4) == 0) {
                System.out.println(" ");
            }
            System.out.printf("%10.4f", x[i]);
        }

        //Задание 3
        System.out.println("\n3.Создаем двумерный массив a_1 размерами 10*20.");
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