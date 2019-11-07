
class Solution{
	public static int partion(int a[], int lb, int up) {
        int pivote=a[lb];
        int start=lb;
        int end=up;
        int temp=0;
        while(start<end){
            while(start < up && a[start]<=pivote){
                start++;
            }
            while(end > lb && a[end]>pivote){
                end--;
            }
            if(start<end){
                
                temp=a[start];
                a[start]=a[end];
                a[end]=temp;
            }
        }
        temp=a[lb];
        a[lb]=a[end];
        a[end] = temp;
        return end;

        
        

    }
    public static void quicksort(int a[],int lb,int up){
        if(lb<up){
            int loc=partion(a, lb, up);
            quicksort(a, lb,loc-1);
            quicksort(a, loc+1, up);

        }
	}static int[] quickSort(int arr[]){
		int[] b=new int[arr.length];
		quicksort(arr, 0, arr.length-1);
		return arr;
	
    //public static void main(String[] args) {
        //int a[]=new int[]{7,6,10,5,9,2,1,15,7};
        
        //System.out.println(Arrays.toString(a));

    }
    
}

