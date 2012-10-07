package ex5_9;

/**
 * Title:        FrequencyTest
 * Description:  A skeleton class for testing FrequencyCounter
 *               You must complete the main method following the instructions
 *               on the web page for Activity 5.9
 * Copyright:    Copyright (c) 2004 - 2010
 * Company:      The Open University
 * @author  M257 Course Team
 * @version 1.2  July 2010
 */
import java.util.*;
import java.io.*;

public class FrequencyTest
{

    public static void main(String[] args) throws Exception
    {

        // Read data from file into list1
        // This uses object serialization, but the details can be ignored
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("Chapter_1"));
        Object obj = ois1.readObject();        
        List<?> list1 = (ArrayList<?>) obj;

        // Add your code here
        
    }
}
