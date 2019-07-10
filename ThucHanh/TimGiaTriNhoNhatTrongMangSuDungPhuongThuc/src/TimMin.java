public class TimMin {
    public static int minValue(int[]array){
        int min =array[0];
        int index=0;
        for(int i=1;i<array.length;i++){
            if(array[i]< min){
                min=array[i];
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr={4,5,3,1,4,8,9};
        int giaTri=minValue(arr);
        System.out.println(" giá trị nhỏ nhất : "+arr[giaTri]);
    }
}
