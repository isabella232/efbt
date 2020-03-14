package loans_def
import base_types._ 


case class RTableloans(rl : List[RRowloans])  extends RTable 
case class RRowloans ( conciseid : String, ecb2_mrkt_vl  :Double , ntnl_amnt  :Double , ecb2_entity_lei  :String  ) extends RRow	
	
object  loansDef {	
def getRRowsloans( t: RTableloans) : List[RRowloans] = t match {
			      case RTableloans(rl) => rl
			  
			  }

  
 def getecb2_mrkt_vl(r : RRowloans) :Double  = r match {
     case RRowloans(conciseid : String, ecb2_mrkt_vl  :Double ,  ntnl_amnt  :Double ,  ecb2_entity_lei  :String    ) => ecb2_mrkt_vl
 }
				  		

  
 def getntnl_amnt(r : RRowloans) :Double  = r match {
     case RRowloans(conciseid : String, ecb2_mrkt_vl  :Double ,  ntnl_amnt  :Double ,  ecb2_entity_lei  :String    ) => ntnl_amnt
 }
				  		

  
 def getecb2_entity_lei(r : RRowloans) :String  = r match {
     case RRowloans(conciseid : String, ecb2_mrkt_vl  :Double ,  ntnl_amnt  :Double ,  ecb2_entity_lei  :String    ) => ecb2_entity_lei
 }
				  		
	
	  def getconciseid(r : RRowloans) :String  = r match { 
	 		case RRowloans( conciseid : String, ecb2_mrkt_vl  :Double ,  ntnl_amnt  :Double ,  ecb2_entity_lei  :String    ) =>  conciseid : String
	 		  }	
	 

}


