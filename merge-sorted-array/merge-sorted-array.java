class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int arr[] = new int[m+n];
		int i = 0;
		int j = 0;
		int count = 0;
		while(i < m && j < B.length){
			if(A[i] < B[j]){
				arr[count] = A[i];
				i++;
				count++;
			}else if(A[i] > B[j]){
				arr[count] = B[j];
				j++;
				count++;
			}else if(A[i] == B[j]){
				arr[count] = A[i];
				count++;
				arr[count] = B[j];
				count++;
				i++;
				j++;
			}
		}
		while(i<m){
			arr[count] = A[i];
			count++;
			i++;
		}
		while(j<B.length){
			arr[count] = B[j];
			count++;
			j++;
		}
        for(int l=0;l<arr.length;l++){
            A[l] = arr[l];
        }
		System.out.print(Arrays.toString(arr));
    }
}