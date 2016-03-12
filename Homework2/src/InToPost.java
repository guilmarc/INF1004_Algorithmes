class InToPost // infix to postfix conversion
{
    private StackX theStack;
    private String input;
    private String output = "";

    public InToPost(String in) // constructor
    {
        input = in;
        int stackSize = input.length();
        theStack = new StackX(stackSize);
    }


    public String doTranslation() // do translation to postfix
    {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            theStack.displayStack("For " + ch + " "); // *diagnostic*
            switch (ch) {
                case '+': // it’s + or -
                case '-':
                    addOperator(ch, 1); // go pop operators
                    break; // (precedence 1)
                case '*': // it’s * or /
                case '/':
                    addOperator(ch, 2); // go pop operators
                    break; // (precedence 2)
                case '$':
                    addOperator(ch, 3);
                    break;
                case '(': // it’s a left paren
                    theStack.push(ch); // push it
                    break;
                case ')': // it’s a right paren
                    gotParenthesis(ch); // go pop operators
                    break;
                case ' ': //We do nothing here
                    break;
                default: // must be an operand
                    output = output + ch; // write it to output

                    if (j < input.length() - 1) { //If this is not the last character
                        if( !(Character.isDigit(input.charAt(j + 1)) || input.charAt(j + 1) == '.' )) {
                            output += ' '; //Adding a space after number
                        }
                    } else {
                        if (!theStack.isEmpty()) {
                            output += ' '; //Adding a space since there is more to come
                        }
                    }

                    break;
            } // end switch
        } // end for

        //Pop and Output all the remaining operators
        while (!theStack.isEmpty())
        {
            theStack.displayStack("While "); // *diagnostic*
            output = output + theStack.pop();
            if (!theStack.isEmpty())
                output += ' '; //Adding a space since there is more to come
        }
        theStack.displayStack("End "); // *diagnostic*
        return output; // return postfix
    } // end doTrans()


    public void addOperator(char opThis, int precedence1) { // got operator from input
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') // if it’s a ‘(‘
            {
                theStack.push(opTop); // restore ‘(‘
                break;
            } else // it’s an operator
            {
                int precedence2; // precedence of new op

                switch (opTop) {
                    case '+': // it’s + or -
                    case '-':
                        precedence2 = 1;
                        break; //
                    case '*': // it’s * or /
                    case '/':
                        precedence2 = 2;
                        break; // (precedence 2)
                    case '$':
                        precedence2 = 3;
                        break;
                    default:
                        precedence2 = 0;
                }

                if (precedence2 < precedence1) // if prec of new op less
                { // than prec of old
                    theStack.push(opTop); // save newly-popped op
                    break;
                } else // prec of new not less
                    output = output + opTop + " "; // than prec of old
            } // end else (it’s an operator)
        } // end while
        theStack.push(opThis); // push new operator
    } // end gotOp()


    public void gotParenthesis(char ch) { // got right paren from input
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx =='(') // if popped ‘(‘
                break; // we’re done
            else // if popped operator
                output = output + chx + " "; // output it
        } // end while
    } // end popOps()
} // end class InToPost