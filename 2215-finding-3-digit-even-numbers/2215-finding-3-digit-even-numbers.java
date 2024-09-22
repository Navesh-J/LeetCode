class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> llist = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int num : digits) {
            llist.add(num);
        }
        for (int i = 100; i < 1000; i+=2) {
            List<Integer> list = new ArrayList<>(llist);
            int n = i;
            boolean flag = true;
            while (n > 0) {
                int d = n % 10;
                if (!list.contains(d)) {
                    flag = false;
                    break;
                }
                else
                    list.remove(Integer.valueOf(d));
                n /= 10;
            }
            if (flag)
                result.add(i);
        }
        int arr[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            arr[i] = result.get(i);
        return arr;
    }
}