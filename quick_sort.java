public class quick_sort {
    // 퀵정렬 메서드
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);  // 피벗 기준으로 왼쪽 정렬
            quickSort(array, pi + 1, high); // 피벗 기준으로 오른쪽 정렬
        }
    }

    // 피벗을 기준으로 배열을 분할하는 메서드
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // 피벗을 마지막 요소로 설정
        int i = (low - 1); // 더 작은 요소의 인덱스

        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같으면
            if (array[j] <= pivot) {
                i++;
                // 요소 교환
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // 피벗을 올바른 위치로 이동
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // 피벗의 인덱스 반환
    }

    // 메인 메서드
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        quickSort(array, 0, n - 1);

        System.out.println("정렬된 배열:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
//퀵정렬은 분할정복 방법을 통해 주어진 배열을 정렬한다.
//시간복잡도는 최선이 nlog₂n 평균이 nlog n 최악이 n^2 공간복잡도는 n
//장점) 불필요한 데이터의 이동을 줄이고 먼 거리의 데이터를 교환할 뿐만 아니라, 한 번 결정된 피벗들이 추후 연산에서 제외되는 특성 때문에, 시간 복잡도가 O(nlog₂n)를 가지는 다른 정렬 알고리즘과 비교했을 때도 가장 빠르다.
//단점) 불안정 정렬이다. 정렬된 배열에 대해서는 Quick Sort의 불균형 분할에 의해 오히려 수행시간이 더 많이 걸린다
