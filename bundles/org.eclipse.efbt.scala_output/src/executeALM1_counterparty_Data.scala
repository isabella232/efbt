package counterparty_data


import base_types._ 
import counterparty_def._

object  counterpartyData {
	

def initialiseRowList ()  :List[RRowcounterparty]  = {

  val rowlist : List[RRowcounterparty] = List.empty[RRowcounterparty] 
  val counterparty_row1 : RRowcounterparty = RRowcounterparty( "counterparty_row1" ,  "Citibank", "UNITED STATES")
	
  val counterparty_row2 : RRowcounterparty = RRowcounterparty( "counterparty_row2" ,  "Mizuho", "JAPAN")
	
 return  rowlist   :+ counterparty_row1 :+ counterparty_row2
}
}

