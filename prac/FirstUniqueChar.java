package prac;

class FirstUniqueChar {
	public int firstUniqChar(String s) {
        int resIndex = Integer.MAX_VALUE;
        for(int i='a'; i<='z'; i++){
            int index = s.indexOf(i);
            if(index != -1 && index==s.lastIndexOf(i)){
                resIndex = index < resIndex?index:resIndex;
            }
        }
         return resIndex == Integer.MAX_VALUE?-1:resIndex;
    }
}
