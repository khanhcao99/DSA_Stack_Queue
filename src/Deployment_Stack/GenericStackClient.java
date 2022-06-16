package Deployment_Stack;

public class GenericStackClient  {

    public static void main(String[] args) {
        stackOfIStrings();
    }

    public static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Khánh");
        stack.push("Quốc");
        stack.push("Cao");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.printf(stack.pop() + " ");
        }

        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
}
