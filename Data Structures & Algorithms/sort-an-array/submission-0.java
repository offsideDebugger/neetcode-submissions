class Solution {


     public void merge(int[] arr, int low, int mid, int high) {
      
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

      
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }

      
        while (left <= mid)
            temp.add(arr[left++]);

        
        while (right <= high)
            temp.add(arr[right++]);

        
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }

    public void mergeSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    public int[] sortArray(int[] nums) {
        int start=0;
        int end=nums.length-1;
        mergeSort(nums,start,end);
        return nums;
    }
}