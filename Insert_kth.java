class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 0};

        int pos = 2;
        int value = 25;

        for(int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}