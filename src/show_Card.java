import java.util.Scanner;

public class show_Card {
    public static void show(int[][][] x){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[0].length;j++){
                if (x[i][j][1] != -1){
                    System.out.print("○");
                }
                else{
                    System.out.print("×");
                }
            }
            System.out.printf("\n");
        }
    }
    public static int start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("難易度は？(数字で入力してください)");
        System.out.println("1,初級");
        System.out.println("2,中級");
        System.out.println("3,上級");
        System.out.println("4,カスタム");
        int difficulty = sc.nextInt();
        return difficulty;
    }
    public static void start_show(int [][][] x){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[0].length;j++){
                System.out.print("○");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        System.out.println("どのマスを選びますか？");
    }
}
