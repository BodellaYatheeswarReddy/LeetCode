class Solution {
    public String capitalizeTitle(String title) {
        String[] parts=title.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:parts){
            if(word.length()<=2){
                sb.append(word.toLowerCase());
            }else{
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}