
package stackexample;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> names = new Stack<>();
        if(names.isEmpty()){
            System.out.println("The stack is empty.Add elements to the stack");
            names.add("Thami");
            names.add("Des");
            names.add("Chisa");
            names.add("Vinjwa");
            names.add("Zwane");
            System.out.println("The following elements are added in the stack");
            System.out.println(names);
            for(String name:names){
                System.out.println(name+" is at index of "+names.indexOf(name));
            }
            System.out.println("");
            String nameTop = names.peek();
            System.out.println("The name at the top of the stack is "+nameTop+"\n\n");
            
            
            System.out.println("The popped number from the top of the stack is "+names.pop());
            for(String name:names){
                System.out.println(name+" is at index of "+names.indexOf(name));
            }
            System.out.println("");
            
            
          if(names.contains("Des")){
              System.out.println("Des has been found in index "+names.indexOf("Des"));
          }else{
              System.out.println("Des hasnt been found");
          }
            System.out.println("");
            System.out.println("");
          names.push("Siv");
          for(String name:names){
                System.out.println(name+" is at index of "+names.indexOf(name));
            }
        }
        
    }
    
}
