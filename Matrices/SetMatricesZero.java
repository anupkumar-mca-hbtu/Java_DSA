package Matrices;

public class SetMatricesZero {

    public static void rowZero(int i,int n, int m, int arr[][]) {

        for(int j=0;j<n;j++) {
            if(arr[i][j]!=0) {
                arr[i][j]=-1;
            }
        }
    }

    public static void columnzero(int j,int n, int m, int arr[][]) {

        for(int i=0;i<m;i++) {
            if(arr[i][j]!=0) {
                arr[i][j]=-1;
            }
        }
    }
    public static void setMatricesZero(int arr[][], int n,int m) {


        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j]==0) {
                  rowZero(i,n,m,arr);
                  columnzero(j,n,m,arr);
                }
            }
        }
        setZeros(arr,n,m);
    }
    public static void setZeros(int arr[][],int n, int m) {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j]==-1) {
                    arr[i][j]=0;
                }
            }
        }
    }

    public static void display(int arr[][], int n, int m) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][]= {{1,1,1},{1,0,1},{1,1,1}};
        int n= arr[0].length;
        int m= arr.length;
        display(arr,n,m);
        System.out.println();
        setMatricesZero(arr,n,m);
        display(arr,n,m);


    }
}
