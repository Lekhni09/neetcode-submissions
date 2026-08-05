class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mapBucket = new HashMap<>();

        for(String s : strs ){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            mapBucket.putIfAbsent(key, new ArrayList<>());
            mapBucket.get(key).add(s);
        }
        return new ArrayList<>(mapBucket.values());
        
    }
}
