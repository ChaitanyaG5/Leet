class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Sorting characters by frequency
        List<Character> list = new ArrayList<>(freq.keySet());
        Collections.sort(list, (a, b) -> freq.get(b) - freq.get(a));

        StringBuilder result = new StringBuilder();
        for (char c : list) {
            int count = freq.get(c);
            while (count-- > 0) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
