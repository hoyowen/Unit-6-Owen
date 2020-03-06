import java.util.Scanner;

public class FrequencyChart{

    private int[] list;
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int num4 = 0;
    int num5 = 0;
    int num6 = 0;
    int num7 = 0;
    int num8 = 0;
    int num9 = 0;
    int num0 = 0;
    String s1 = "";
    String s2 = "";
    String s3 = "";
    String s4 = "";
    String s5 = "";
    String s6 = "";
    String s7 = "";
    String s8 = "";
    String s9 = "";
    String s0 = "";


    public FrequencyChart(int[] list){
        this.list = list;
    }

    public String makeChart(){
        for(int x : list){
            if (x <= 10 && x>=1)
                num1++;
            else if (x <= 20 && x>=1)
                num2++;
            else if (x <= 30 && x>=1)
                num3++;
            else if (x <= 40 && x>=1)
                num4++;
            else if (x <= 50 && x>=1)
                num5++;
            else if (x <= 60 && x>=1)
                num6++;
            else if (x <= 70 && x>=1)
                num7++;
            else if (x <= 80 && x>=1)
                num8++;
            else if (x <= 90 && x>=1)
                num9++;
            else if (x <= 100 && x>=1)
                num0++;
        }
        for(int y = 0; y < num1; y++){
            s1 += "*";
        }
        for(int y = 0; y < num2; y++){
            s2 += "*";
        }
        for(int y = 0; y < num3; y++){
            s3 += "*";
        }
        for(int y = 0; y < num4; y++){
            s4 += "*";
        }
        for(int y = 0; y < num5; y++){
            s5 += "*";
        }
        for(int y = 0; y < num6; y++){
            s6 += "*";
        }
        for(int y = 0; y < num7; y++){
            s7 += "*";
        }
        for(int y = 0; y < num8; y++){
            s8 += "*";
        }
        for(int y = 0; y < num9; y++){
            s9 += "*";
        }
        for(int y = 0; y < num0; y++){
            s0 += "*";
        }
        return "  1-10 |" +s1 + "\n 11-20 |" + s2+ "\n 21-30 |" + s3+ "\n 31-40 |" + s4+ "\n 41-50 |" + s5+ "\n 51-60 |" + s6+ "\n 61-70 |" + s7+ "\n 71-80 |" + s8+ "\n 81-90 |" + s9+ "\n 91-100|" + s0;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter data value one at a time, followed by enter:");
        int val = 0;
        for (int i = 0; i <data.length; i++){
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);

        System.out.println(chart.makeChart());
    }
}


