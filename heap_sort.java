public class heap_sort {
        // 힙을 구성하는 함수
        private void heapify(int[] arr, int n, int i) {
            int largest = i; // 루트
            int left = 2 * i + 1; // 왼쪽 자식
            int right = 2 * i + 2; // 오른쪽 자식
    
            // 왼쪽 자식이 더 크면
            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }
    
            // 오른쪽 자식이 더 크면
            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }
    
            // 루트가 가장 크지 않으면 교환
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;
    
                // 교환 후 힙을 다시 구성
                heapify(arr, n, largest);
            }
        }
    
        // 힙 정렬 메인 함수
        public void sort(int[] arr) {
            int n = arr.length;
    
            // 힙을 구성
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }
    
            // 요소를 하나씩 꺼내며 정렬
            for (int i = n - 1; i >= 0; i--) {
                // 현재 루트를 배열의 끝으로 이동
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
    
                // 힙을 다시 구성
                heapify(arr, i, 0);
            }
        }
    
        // 배열 출력 함수
        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    
        // 메인 함수
        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6, 7};
            heap_sort heapSort = new heap_sort();
            heapSort.sort(arr);
            System.out.println("정렬된 배열:");
            printArray(arr);
        }
}
//힙정렬은 최대 힙 트리나 최소 힙 트리를 구성해 정렬을 하는 방법. 내림차순 정렬을 위해서는 최대 힙을 구성하고 오름차순 정렬을 위해서는 최소 힙을 구성하면 된다.
//시간복잡도는 nlogn 공간복잡도는 1
//장점) 최악의 경우에도 nlogn 을 유지하여 성능이 안정적이다. 추가적인 메모리 공간을 거의 사용하지 않으므로 공간 복잡도가 O(1) 이다.
//단점)힙 정렬의 상수 시간 복잡도는 퀵 정렬이나 병합 정렬보다 더 크기 때문에 실제로는 평균적으로 더 느릴 수 있다. 힙 정렬은 임의 접근 패턴을 사용하여 비연속적인 메모리 접근을 하므로 캐시 효율성이 낮다.불안정 정렬이다.
//참고)https://velog.io/@char1ey95/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%ED%9E%99-%EC%A0%95%EB%A0%ACHeap-Sort#2-2-%ED%9E%99-%EC%83%9D%EC%84%B1heapify-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98