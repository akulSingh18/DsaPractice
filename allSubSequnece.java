class HelloWorld {

    public static void print(int i, int[] arr, ArrayList<Integer> list) {
      
        if (i >= arr.length) {
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");  
            }
            System.out.println();  
            return;
        }

        list.add(arr[i]);
        print(i + 1, arr, list);

        list.remove(list.size() - 1);
        print(i + 1, arr, list);
    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{3, 2, 1};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        print(0, arr, list);
    }
}
