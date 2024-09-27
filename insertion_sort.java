import java.util.Arrays;

public interface insertion_sort {
    public static void main(String[] args){
        int tmp=0;
        int[] arr= {5,3,2,1,4};
        for(int i =1; i<arr.length; i++){
            tmp= arr[i];
            int prev = i-1;
            while ((prev>=0)&&(arr[prev]>tmp)) {
                arr[prev+1] = arr[prev];
                prev --;
            }
            arr[prev+1]= tmp;
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
//삽입정렬은 2번째 원소부터 시작하여 그 앞의 원소들과 비교하여 삽입할 위치를 정한 후, 원소를 뒤로 옮기고 지정된 자리에 자료를 삽입하여 정렬하는 알고리즘이다. 손에 들고있는 카드를 정렬하는 방법과 유사
//시간복잡도 평균과 최악은 n^2 최선은 n 공간복잡도 n
//장점) 알고리즘이 단순하다. 대부분의 원소가 이미 정렬되어 있는 경우, 매우 효율적일 수 있다. 안정 정렬이다. 선택정렬이나 버블정렬과 같은 알고리즘에 비해 상대적으로 빠르다.
//단점) 평균과 최악의 시간복잡도가 n^2으로 비효율적이다. 배열의 길이가 길어질수록 비효율적이다.
