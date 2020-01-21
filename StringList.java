import java.util.*;
public class StringList
{
   private ArrayList <String> strings;
   private int size;
   
   //constructor
   public StringList ()
   {
      strings = new ArrayList <String>();
      size = 0;
   }
   //methods
   public void add (String str)
   {
      strings.add (str);
      size++;
   }
     
   public void sortStrings ()
   {
      
    for (int p = 1; p < size; p++)
      {
         for (int q = 0; q < size - p; q++)
         {
            if (((strings.get (q)).compareTo(strings.get(q+1))) >0)
            {
               String temp = strings.get (q);
               strings.set (q, strings.get (q+1));
               strings.set (q + 1, temp);
            }
         }
      }
      
    }
    
    public String toString ()
    {
      sortStrings();
      String temp = "[";
      for (int k = 0; k < size -1; k++)
      {
         temp = temp + strings.get (k) + ", ";
      }
      temp = temp + strings.get (size - 1) + "]";
      return temp;
    }
}
   