class Solution {

    public String encode(List<String> strs) {
        StringBuilder code = new StringBuilder();
        for(String s : strs){
            code.append(s.length()).append("#").append(s);
        }
        return code.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int x = 0;
        while (x < str.length()) {
            int sharpIndex = str.indexOf('#', x);
            int length = Integer.parseInt(str.substring(x, sharpIndex));
            x = sharpIndex + 1;
            list.add(str.substring(x, x + length));
            x += length;
        }
        return list;
    }
}
