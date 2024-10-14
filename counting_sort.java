import java.util.Arrays;

public class counting_sort {
     public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // 1. 최대값을 찾아서 카운트 배열의 크기를 결정합니다.
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max + 1];

        // 2. 카운트 배열을 업데이트합니다.
        for (int num : arr) {
            count[num]++;
        }

        // 3. 결과 배열을 생성합니다.
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 3, 1};
        countingSort(arr);
        System.out.println("정렬된 배열: " + Arrays.toString(arr));
    }
}
// 계수 정렬은 정수 값을 가지는 데이터를 정렬하는 효율적인 알고리즘이다. 입력 데이터의 범위가 작고 정수로 제한되어 있을 때 유용
// 공간 복잡도 n+k 시간 복잡도 n+k
// 장점) 데이터 범위가 작을때는 n의 시간 복잡도를 갖어 매우 빠른 성능을 보여준다. 안정 정렬이다.
// 단점) 데이터의 최대값 k가 클 경우, 카운드 배열의 크기도 커져서 메모리 사용량이 증가할 수 있다. 이로 인해 메모리 사용이 비효율적.