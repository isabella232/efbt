package rating_data


import base_types._ 
import rating_def._

object  ratingData {
	

def initialiseRowList ()  :List[RRowrating]  = {

  val rowlist : List[RRowrating] = List.empty[RRowrating] 
  val rating_row1 : RRowrating = RRowrating( "rating_row1" ,  "Credit rating agency 1", "AAA", "Citibank")
	
  val rating_row2 : RRowrating = RRowrating( "rating_row2" ,  "Credit rating agency 1", "AA", "Mizuho")
	
 return  rowlist   :+ rating_row1 :+ rating_row2
}
}

