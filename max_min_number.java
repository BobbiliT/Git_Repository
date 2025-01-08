public class max_min_number {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int max = arr[0];
        int min = arr[0];
        int max_index=0;
        int min_index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                max_index=i;
            }
            if(arr[i]<min){
                min=arr[i];
                min_index=i;
            }
        }
        System.out.println("max number from an array - "+max);
        System.out.println("max_index find - "+max_index);
        System.out.println("min number from an array - "+min);
        System.out.println("min_index find -  "+min_index);
    }
}
