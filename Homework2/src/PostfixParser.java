/**
* Class : PostfixParser.java
* Author : Marco Choiniere-Guilmette
* Date : 2016-03-12
*
* Description : This class parses a postfix expression and returns the result
*/


public class PostfixParser {

    StackX stack;
    String elements[];

    private String input;


    public PostfixParser(String input){
        this.input = input;             //Save the input in the private variable
        elements = input.split(" ");    //Split the input into an array of String
    }


    //Parse a postfix expression and returns the result
    public double doParse(){
        stack = new StackX(20);     //Create a stack with a max or 20 elements
        double result = 0;          //Will be user to store intermediates results and return the final result


        for (String element : this.elements) {  //Loop through all element in the input string

            if (isNumeric(element)) {
                stack.push(Double.parseDouble(element));    //If this is a operand, push it to the stack
            } else {

                switch( element ){
                    case "+": result = (double)stack.pop() + (double)stack.pop(); break;        //Return the addition
                    case "-": result = -((double)stack.pop() - (double)stack.pop()); break;     //Return the substraction
                    case "*": result = (double)stack.pop() * (double)stack.pop(); break;        //Return the multiplication
                    case "/": result = 1 / ((double)stack.pop() / (double)stack.pop()); break;  //Return the division
                    case "$": result = Math.sqrt((double)stack.pop()); break;                   //Return the square root
                }

                stack.push(result); //Set the result back to the empty stack
            }
        }
        return result;
    }

    //This method is used to know if a string is a numeric expression
    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

}
