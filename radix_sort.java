import java.util.Arrays;

public class radix_sort {
    // 기수 정렬 메인 함수
    public static void radixSort(int[] arr) {
        // 최대값을 찾아서 자릿수를 결정합니다.
        int max = Arrays.stream(arr).max().getAsInt();
        
        // 최대값의 자릿수만큼 반복하여 정렬합니다.
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
        
}
private static void countingSort(int[] arr, int exp) {
    int n = arr.length;
    int[] output = new int[n]; // 정렬된 결과를 저장할 배열
    int[] count = new int[10]; // 0-9까지의 수를 카운트할 배열

    // 각 자리수의 수를 카운트합니다.
    for (int i = 0; i < n; i++) {
        count[(arr[i] / exp) % 10]++;
    }

    // 카운트를 누적하여 위치를 결정합니다.
    for (int i = 1; i < 10; i++) {
        count[i] += count[i - 1];
    }

    // 정렬된 결과를 생성합니다.
    for (int i = n - 1; i >= 0; i--) {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i];
        count[(arr[i] / exp) % 10]--;
    }

    // 결과를 원래 배열에 복사합니다.
    System.arraycopy(output, 0, arr, 0, n);
}

public static void main(String[] args) {
    int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
    radixSort(arr);
    System.out.println("정렬된 배열: " + Arrays.toString(arr));
}
}
//기수정렬이란 정렬할 숫자의 자리수에 따라 정렬을 수행하는 알고리즘이다. 기수 정렬은 일반적으로 카운팅 정렬(Counting Sort)을 서브 알고리즘으로 사용하여 각 자리수별로 정렬한다.
//시간복잡도는 O(d * (n + b))  d는 정렬할 숫자의 자릿수, b는 각 자리수에서 가능한 값의 범위 (예: 10진수의 경우 0부터 9까지) 공간 복잡도는 (O(n + k)) n은 입력 배열의 크기 k는 각 자리수에서 가능한 값의 범위 (예: 10진수의 경우 10)
//장점)문자열, 정수 정렬 가능
//단점)자릿수가 없는 것은 정렬할 수 없음. (부동 소숫점) 중간 결과를 저장할 bucket 공간이 필요함.
//참고) https://devraphy.tistory.com/440 

