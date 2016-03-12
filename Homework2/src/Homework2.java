/**
* Class : Homework2.java
* Author : Marco Choiniere-Guilmette
* Date : 2016-03-12
*
* Description : This is the main program
*/

import java.io.*;


class Homework2
{
    public static void main(String[] args) throws IOException
    {
        String input, output;
        while(true)
        {
            System.out.print("Enter infix: ");
            System.out.flush();
            input = getString(); // read a string from kbd
            if( input.equals("") ) // quit if [Enter]
                break;

            //Make a translator and translate an infix string expression
            InToPost theTrans = new InToPost(input);
            output = theTrans.doTranslation(); // do the translation
            System.out.println('\n' + "Postfix is " + output);

            //Make a parser and parse the postfix string expression
            PostfixParser parser = new PostfixParser(output);
            double result = parser.doParse();
            System.out.println("Value is " + result + '\n');

        }
    }

    //Get a string expression from keyboard
    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

}
