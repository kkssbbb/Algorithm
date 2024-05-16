class Solution {
    public int[] solution(int[] members, String direction) {
              int[] result = new int[members.length];

        if (direction.equals("right")) {
            int lastIndex = members.length - 1;
            int lastNum = members[lastIndex];

            for (int i = 1; i <= lastIndex; i++) {
                result[i] = members[i - 1];
            }
            result[0] = lastNum;
        } else if (direction.equals("left")) {
            int firstNum = members[0];

            for (int i = 0; i < members.length - 1; i++) {
                result[i] = members[i + 1];
            }
            result[members.length - 1] = firstNum;
        }

        return result;
    }
}