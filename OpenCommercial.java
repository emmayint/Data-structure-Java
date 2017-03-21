/* OpenCommercial.java */

import java.net.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner; 
/** I'm more inclined to use Scanner than BufferedReader
*/
/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    /** if use BufferedReader
    BufferedReader keyboard;
    keyboard = new BufferedReader(new InputStreamReader(System.in));
    */
    Scanner user_input = new Scanner( System.in );
    String inputLine;
    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputline =  user_input.nextLine();
    /** inputLine = user_input.readLine(); */

    /* Replace this comment with your solution.  */
    String address = "http://www." + inputLine + ".com";
    // address = "http://www.cs.berkeley.edu/~jrs/61bf06/hw/hw1/OpenCommercial.java";
    System.out.println(address);

    String[] firstFiveLines = new String[5];
    URL aUrl = new URL(address);
    // call the URL's openStream() method to get a stream
    BufferedReader urlContent = new BufferedReader(new InputStreamReader(aUrl.openStream()));
    // initialize a string variable
    String oneInputLine;
    // counter
    int i = 0;
    // System.out.println(firstFiveLines.length);
    // Read URL contents one line a time, and store that line in the string variable
    while((oneInputLine = urlContent.readLine()) != null && i < firstFiveLines.length) {
	// System.out.println("====");
	firstFiveLines[i] = oneInputLine;
        // System.out.println(firstFiveLines[i] + i);
	i++;
        // System.out.println(oneInputLine + i);
	// System.out.println(Arrays.toString(firstFiveLines));
    }

    // System.out.println(Arrays.toString(firstFiveLines));
    // print in reverse order
    for (int j = firstFiveLines.length - 1; j >= 0; j--) {
        System.out.println(firstFiveLines[j]); 
    }

  }
}
