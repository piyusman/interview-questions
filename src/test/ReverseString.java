package test;

public class ReverseString {
    
    public String reverse(String s){
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length;i>0;i--){
            sb.append(arr[i]).append(" ");
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() -1);
    }

}
