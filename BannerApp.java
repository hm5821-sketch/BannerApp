public class BannerApp{
public static void main(String[] args) {
 String[] lines = {
 String.join( " ","     ***     ", " *******    " , " *******   " , "   *****   "  ),
  String.join( " "," **     **   ", " *      *   " , " *      *  " , " *         "  ),
  String.join( " ","**        ** ", " *      *   " , " *      *  " , " *         "  ),
 String.join( " ","**        ** ", " *******    " , " *******   " , "   *****   "  ),
 String.join( " ","**        ** ", " *          " , " *         " , "         * "  ),
  String.join( " "," **      **  ", " *          " , " *         " , "         * "  ),
 String.join( " ","     ***     ", " *          " , " *         " , "  ******   "  ) };
 for (int i = 0; i < lines.length ; i++) {
	 System.out.println (lines[i]);
 }
}
}