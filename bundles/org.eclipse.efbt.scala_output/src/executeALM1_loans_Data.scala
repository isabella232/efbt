package loans_data


import base_types._ 
import loans_def._

object  loansData {
	

def initialiseRowList ()  :List[RRowloans]  = {

  val rowlist : List[RRowloans] = List.empty[RRowloans] 
  val loans_row1 : RRowloans = RRowloans( "loans_row1" ,  5000, 100000, "Mizuho")
	
  val loans_row2 : RRowloans = RRowloans( "loans_row2" ,  9000, 200000, "Mizuho")
	
  val loans_row3 : RRowloans = RRowloans( "loans_row3" ,  15000, 300000, "Citibank")
	
 return  rowlist   :+ loans_row1 :+ loans_row2 :+ loans_row3
}
}

