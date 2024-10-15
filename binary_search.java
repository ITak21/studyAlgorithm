public class binary_search {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // 중간 인덱스 계산

            if (arr[mid] == target) {
                return mid; // 값이 발견된 경우 인덱스 반환
            } else if (arr[mid] < target) {
                left = mid + 1; // 오른쪽 절반 검색
            } else {
                right = mid - 1; // 왼쪽 절반 검색
            }
        }

        return -1; // 값이 발견되지 않은 경우
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("값 " + target + "은(는) 인덱스 " + result + "에 있습니다.");
        } else {
            System.out.println("값 " + target + "은(는) 배열에 없습니다.");
        }
    }
}
//이분 탐색은 탐색 범위를 두 부분을 분할하면서 찾는 방식. 정렬된 배열에서 특정 값을 찾는 효율적인 알고리즘이다.
//공간 복잡도 비재귀 1, 재귀 log n 시간 복잡도 log n
//장점)큰 데이터셋에서도 빠르게 검색할 수 있다. 간단히 구현할 수 있다.
//단점)이분 탐색을 사용하려면 정렬된 데이터가 필요하다. 즉 정렬된 데이터 필요. 배열을 기반으로 하므로 동적으로 크기 조정 불가
