package Array;

public class MoveZerostoEnd {

    //int arr[]= {1,0,5,0,0,4,8};

    public static void moveZerostoEnd(int a[]) {
        int arr[]= new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++) {

            if(a[i]!=0) {
                arr[j++]=a[i];
            }
        }
        for(int i=j;i<arr.length;i++) {
            arr[i]=0;
        }
        for(int i=0;i<arr.length;i++) {

            System.out.print(arr[i]+ " ");
        }
    }
    public static void moveZerostoEnd2(int a[]) {

        int j=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]!=0) {
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                j++;
            }
        }
        for(int i=0;i<a.length;i++) {

            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,0,5,0,0,4,8};
        //moveZerostoEnd(arr);
        moveZerostoEnd2(arr);
    }
}
