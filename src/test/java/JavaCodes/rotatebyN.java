package JavaCodes;


public class rotatebyN {
	public static void rotate(int[] arr, int order) {
        if (arr == null || order < 2) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
	public static void main(String[] args) 
    {
		 int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
	        int r=4;
	        rotate(arr,r);
    }

}
