class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        //2 0 5
        String[] rsps = rsp.split("");
        StringBuilder sb  = new StringBuilder();
        
        for(String r : rsps){
            
            if(r.equals("2")){
                sb.append("0");
            } else if(r.equals("0")){
                sb.append("5");
            }else{
                sb.append("2");
            }
            
        }
        answer = sb.toString();
        return answer;
    }
}