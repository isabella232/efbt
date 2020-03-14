package counterparty_def
import base_types._ 


case class RTablecounterparty(rl : List[RRowcounterparty])  extends RTable 
case class RRowcounterparty ( conciseid : String, ecb2_entity_lei  :String , cntry  :String    ) extends RRow	
	
object  counterpartyDef {	
def getRRowscounterparty( t: RTablecounterparty) : List[RRowcounterparty] = t match {
			      case RTablecounterparty(rl) => rl
			  
			  }

  
 def getecb2_entity_lei(r : RRowcounterparty) :String  = r match {
     case RRowcounterparty(conciseid : String, ecb2_entity_lei  :String ,  cntry  :String      ) => ecb2_entity_lei
 }
				  		

  
 def getcntry(r : RRowcounterparty) :String    = r match {
     case RRowcounterparty(conciseid : String, ecb2_entity_lei  :String ,  cntry  :String      ) => cntry
 }
				  		
	
	  def getconciseid(r : RRowcounterparty) :String  = r match { 
	 		case RRowcounterparty( conciseid : String, ecb2_entity_lei  :String ,  cntry  :String      ) =>  conciseid : String
	 		  }	
	 

}


