
import java.io.*;


class InfixApp
{
    public static void main(String[] args) throws IOException
    {
        String input, output;
       // while(true)
        //{
            //System.out.print("Enter infix: ");
            //System.out.flush();
            //input = getString(); // read a string from kbd
            //if( input.equals("") ) // quit if [Enter]
             //   break;

            input = "(100+5.75) + 100";  //Sortie -> 100 5.75 + 100 +

            // make a translator
            InToPost theTrans = new InToPost(input);
            output = theTrans.doTrans(); // do the translation
            System.out.println("Postfix is " + output + '\n');
      //  } // end while
    } // end main()
    //--------------------------------------------------------------
    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    /*
    public int calculate(String s)
    {
        int n,r=0;
        n=s.length();
        StackX a=new StackX(n);
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9')
                a.push((int)(ch-'0'));
            else
            {
                int x=a.pop();
                int y=a.pop();
                switch(ch)
                {
                    case '+':r=x+y;
                        break;
                    case '-':r=y-x;
                        break;
                    case '*':r=x*y;
                        break;
                    case '/':r=y/x;
                        break;
                    default:r=0;
                }
                a.push(r);
            }
        }
        r=a.pop();
        return(r);
    }
*/

//--------------------------------------------------------------
} // end class InfixApp
