class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String,LinkedList<String>> map=new HashMap<>();

        for(String s:str){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String sorted=String.valueOf(ch);

            if(!map.containsKey(sorted)){
                map.put(sorted, new LinkedList<String>());
            }
            map.get(sorted).add(s);
        }
        
       return new LinkedList<>(map.values());
    }
}