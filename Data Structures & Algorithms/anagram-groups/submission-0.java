class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> listOfAnagrams = new ArrayList<>();
        Map<String,List<String>> mapAnagram = new HashMap<>();
        for(String str: strs){  
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(mapAnagram.containsKey(sortedString)){
                List<String> existing = mapAnagram.get(sortedString);
                existing.add(str);
                mapAnagram.put(sortedString,existing);
            }else{
                List<String> ang = new ArrayList<>();
                ang.add(str);
                mapAnagram.put(sortedString,ang);
            }
        }
        listOfAnagrams = new ArrayList<>(mapAnagram.values());
    
        return listOfAnagrams;
    }

}