import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            // 스택이 비어있지 않고, k가 0보다 크며, 스택의 마지막 원소가 현재 문자보다 작은 경우
            while (!stack.isEmpty() && k > 0 && stack.peek() < c) {
                stack.pop();  // 스택의 마지막 원소를 제거
                k--;  // 제거할 수의 개수를 감소
            }
            stack.push(c);  // 현재 문자를 스택에 추가
        }

        // 스택에서 k개의 문자를 더 제거 (k가 남아 있는 경우)
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        if (k > 0) {
            sb.setLength(sb.length() - k);  // 결과 문자열에서 뒤에서부터 k개의 문자를 제거
        }

        return sb.toString();
    }
}
