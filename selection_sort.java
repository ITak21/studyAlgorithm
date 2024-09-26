import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args){
        int[] arr ={5,3,2,4,1};
        int tmp=0;
        
        for(int i=0; i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            tmp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
//선택정렬은 해당 순서에 원소를 넣을 위치를 정해두고 어떤 원소를 넣을지 선택하는 알고리즘이다.
//시간복잡도는 n^2 공간복잡도는 n >배열안에서 정렬이 수행되어서
//장점)버블정렬과 같이 알고리즘이 단순하다. 정렬을 위한 비교횟수는 많지만, 버블정렬에 비해 적기때문에 많은 교환이 이루어지는 자료상태에서는 비교적 효율적이다.
//단점)시간복잡도가 n^2으로 비효율적이다. 불안정 정렬이다. > 불안정 정렬은 입력 순서와 상관없이 정렬한다.