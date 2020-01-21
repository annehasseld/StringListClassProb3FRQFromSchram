class main
{
   public static void main( String[] args )
   {

      StringList classList = new StringList ();
      classList.add ("cat");
      classList.add ("boy");
      classList.add ("girl");
      classList.add ("apple");
      //System.out.println ("classList = " + classList);
      classList.sortStrings();
      //System.out.println ("classList = " + classList);
      System.out.println (classList.toString());
      
      StringList colorList = new StringList ();
      classList.add ("purple");
      classList.add ("blue");
      classList.add ("pink");
      classList.add ("yellow");
      System.out.println ("colorList = " + colorList);
      //colorList.sortStrings();
      //System.out.println ("colorList = " + colorList);
      //System.out.println (colorList.toString());

   }
}