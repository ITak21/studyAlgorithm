import java.util.Arrays;

public class bubble_sort{
    public static void main(String[] args){
        int[] arr = {5,4,2,3,1};
        int tmp =0;
        for(int i=0; i<arr.length; i++){
            for(int j =1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    tmp= arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//버블정렬은 서로 인접한 원소의 대소를 비교하여 정렬하는 알고리즘이다.
//시간 복잡도는 n^2 공간 복잡도는 n
//장점) 구현이 매우 간단하고 소스코드가 직관적이다. 정렬하고자 하는 배열안에서 교환하는 방식이므로 다른 메모리 공간을 필요로하지 않는다.
//단점) 시간복잡도가 최선,최악,평균 모드 n^2이므로 비효율적이다. 안정 정렬이다.> 입력순서와 동일하게 정렬한다.