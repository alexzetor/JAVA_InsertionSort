public class Main {

    public static void main(String[] args) {
        int[] A = {5,2,4,6,1,3};
        int i, j, key;
        for (j = 1; j < A.length; j++) {
            key = A[j];
            i = j - 1;
            while (i>=0 && A[i]>key){
                A[i+1] = A[i];
                i = i - 1;
            }
            A[i+1] = key;
        }
        for (i = 0; i <= A.length; i++){
        System.out.println(A[i]);
        }
    }
}
