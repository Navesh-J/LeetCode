class Solution {
    public int countCharacters(String[] words, String chars) {
        List<Character> list = new ArrayList<>();
        int sum = 0;
        for (char ch : chars.toCharArray())
            list.add(ch);
        for (String word : words) {
            List<Character> newList = new ArrayList<>(list);
            boolean flag = true;
            for (char ch : word.toCharArray()) {
                if (newList.contains(ch)) {
                    newList.remove(Character.valueOf(ch));
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag)
                sum += word.length();
        }
        return sum;
    }
}