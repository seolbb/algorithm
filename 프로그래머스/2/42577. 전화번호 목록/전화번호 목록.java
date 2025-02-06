import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        
        // HashMap 에 번호 담기
        for(int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i], i);
        }
        
        for(String phone : phone_book){
            for(int j = 1; j < phone.length(); j++){
                if(map.containsKey(phone.substring(0,j))){
                    return false;
                }
            }
        }
        return true;
    }
}