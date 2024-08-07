package CrackYourPlacementDay18;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!component.isEmpty() && !component.equals(".")) {
                stack.push(component);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/").append(dir);
        }

        return sb.length() > 0 ? sb.toString() : "/";
    }

    public static void main(String[] args) {
        SimplifyPath sp = new SimplifyPath();
        System.out.println(sp.simplifyPath("/home/")); // Output: "/home"
        System.out.println(sp.simplifyPath("/../")); // Output: "/"
        System.out.println(sp.simplifyPath("/home//foo/")); // Output: "/home/foo"
        System.out.println(sp.simplifyPath("/a/./b/../../c/")); // Output: "/c"
    }
}
