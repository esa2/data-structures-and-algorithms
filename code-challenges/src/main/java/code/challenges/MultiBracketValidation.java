package code.challenges;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {

        Stack stack = new Stack();
        
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            if (c == '{') stack.push("{");
            if (c == '(') stack.push("(");
            if (c == '[') stack.push("[");

            if (c == '}') {
                if (stack.top.value == "{") {
                    stack.pop();
                } else {
                    return false;
                }
            }

            if (c == ')') {
                if (stack.top.value == "(") {
                    stack.pop();
                } else {
                    return false;
                }
            }

            if (c == ']') {
                if (stack.top.value == "[") {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.top == null) {
            return true;
        } else {
            return false;
        }
    }
}
