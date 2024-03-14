package chap05;

public class Application3 {

    public static void main(String[] args) {

        /* 실습문제 3

         * [ 로또번호 생성기 ]
         * 6칸짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * */

        int[] arr = new int[6];
        int random;

        for (int i = 0; i < 6; i++) {
            random = (int) ((Math.random() * 45) + 1);

            if (random != arr[0] && random != arr[1] && random != arr[2] && random != arr[3] && random != arr[4] && random != arr[5]) {
                arr[i] = random;
            } else {
                arr[i] = random;
                System.out.println("중복 : " + arr[i]);
                i--;
                continue;
            }
            System.out.println(arr[i]);
        }

        /* 오름차순 정렬 */
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {

                if(arr [i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }

        System.out.println("========== 행운의 로또번호 생성기 ==========");
        System.out.println("========== 이번주 행운의 숫자는?? ==========");
        for(int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("========================================");
    }
}
