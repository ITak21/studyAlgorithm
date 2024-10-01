import java.util.Arrays;

public class merge_sort{
    public static void main(String[] args){
        int[] array = { 230, 10, 60, 550, 40, 220, 20 };
     
        mergeSort(array, 0, array.length - 1);
     
        for (int v : array) {
            System.out.println(v);
        }
    }

     
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
     
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
     
    public static void merge(int[] array, int left, int mid, int right) {
        int[] L = Arrays.copyOfRange(array, left, mid + 1);
        int[] R = Arrays.copyOfRange(array, mid + 1, right + 1);
     
        int i = 0, j = 0, k = left;
        int ll = L.length, rl = R.length;
     
        while (i < ll && j < rl) {
            if (L[i] <= R[j]) {
                array[k] = L[i++];
            } else {
                array[k] = R[j++];
            }
            k++;
        }
     
        while (i < ll) {
            array[k++] = L[i++];
        }
     
        while (j < rl) {
            array[k++] = R[j++];
        }
    }
}
//합병정렬은 분할정복 방법을 통해 구현, 빠른 정렬로 분류되며 퀵 정렬과는 반대로 안정정렬에 속함.
//시간복잡도는 nlogn 공간복잡도는 n
//장점) 안정 정렬이다.최악의 경우 O(n log n) 시간 복잡도를 가지므로, 입력 데이터의 특성과 관계없이 일관된 성능을 제공한다. 외부 정렬에 적합하여 대량의 데이터를 처리할때 유리하다. 합병정렬은 순차적인 비교로 정렬을 진행하므로, LinkedList의 정렬이 필요할 때 사용하면 효율적이다
//단점) 추가 공간이 필요하여 메모리 사용량이 많다. 다른 O(n log n) 정렬 알고리즘보다 평균적으로 느릴 수 있다. 이는 추가 배열을 사용하는 과정에서 발생하는 오버헤드 때문이다.
//퀵정렬과의 차이점) 퀵정렬 : 우선 피벗을 통해 정렬(partition) → 영역을 쪼갬(quickSort) / 합병정렬 : 영역을 쪼갤 수 있을 만큼 쪼갬(mergeSort) → 정렬(merge)
