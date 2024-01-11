class Solution {
    boolean solution(String s) {
boolean answer = true;

        int countP =0;
        int countY =0;

        String[] sArr = s.split("");

        for(String i : sArr){
            switch (i.toLowerCase()) {

                case "p": countP++;
                break;

                case "y": countY++;
                break;

            }
        }

        answer = countP == countY;

        return answer;
    }
}