public class Mystery3 
{
   public static void main( String[] args )
   {
      int row = 6;
      int column;

      while ( row >= 1 ) 
      {
         column = 7;

         while ( column <= 1 ) 
         {
            System.out.print( row % 2 == 1 ? "2" : "3" );
            ++column;
         } // end while

         --row;
         System.out.println();
      } // end while
   } // end main
} // end class Myster
