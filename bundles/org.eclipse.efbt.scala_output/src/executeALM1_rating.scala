package rating_def
import base_types._ 


case class RTablerating(rl : List[RRowrating])  extends RTable 
case class RRowrating ( conciseid : String, crdt_rtng_agncy  :String   , rtng_scl_cd  :String , ecb2_entity_lei  :String  ) extends RRow	
	
object  ratingDef {	
def getRRowsrating( t: RTablerating) : List[RRowrating] = t match {
			      case RTablerating(rl) => rl
			  
			  }

  
 def getcrdt_rtng_agncy(r : RRowrating) :String    = r match {
     case RRowrating(conciseid : String, crdt_rtng_agncy  :String   ,  rtng_scl_cd  :String ,  ecb2_entity_lei  :String    ) => crdt_rtng_agncy
 }
				  		

  
 def getrtng_scl_cd(r : RRowrating) :String  = r match {
     case RRowrating(conciseid : String, crdt_rtng_agncy  :String   ,  rtng_scl_cd  :String ,  ecb2_entity_lei  :String    ) => rtng_scl_cd
 }
				  		

  
 def getecb2_entity_lei(r : RRowrating) :String  = r match {
     case RRowrating(conciseid : String, crdt_rtng_agncy  :String   ,  rtng_scl_cd  :String ,  ecb2_entity_lei  :String    ) => ecb2_entity_lei
 }
				  		
	
	  def getconciseid(r : RRowrating) :String  = r match { 
	 		case RRowrating( conciseid : String, crdt_rtng_agncy  :String   ,  rtng_scl_cd  :String ,  ecb2_entity_lei  :String    ) =>  conciseid : String
	 		  }	
	 

}


