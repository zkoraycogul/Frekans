import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int count;

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }
            if (i == 0 && list[i + 1] == list[i]) {
                System.out.println(list[i]+" sayısı "+ count +" kere tekrar edildi.");
            }

            if (i == 0 && list[i + 1] != list[i]){
                System.out.println(list[i]+" sayısı "+ count +" kere tekrar edildi.");
            }

            if(i!= 0 && list[i-1]!=list[i]){
                System.out.println(list[i]+" sayısı "+ count +" kere tekrar edildi.");
            }
        }
    }
}
