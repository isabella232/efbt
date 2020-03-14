package notionalOfUS_AAA_def
import base_types._ 
import funcdefs._ 
import customfuncs._

	
		


	
		import enrichedExposures_def._  //imprt each source table for this table
		
		case class RTablenotionalOfUS_AAA(t1: RTableenrichedExposures) extends RTable
				case class RRownotionalOfUS_AAA(enrichedExposures: List[RRowenrichedExposures])
				
				object notionalOfUS_AAADef  {	
				  def getRRowsnotionalOfUS_AAA(t : RTablenotionalOfUS_AAA) : List[RRownotionalOfUS_AAA] = t match {
				      case RTablenotionalOfUS_AAA(tableenrichedExposures) => getRRowsnotionalOfUS_AAA(enrichedExposuresDef.getRRowsenrichedExposures(tableenrichedExposures))
				  }
				
				  
				  def getRRowsnotionalOfUS_AAA( rl: List[RRowenrichedExposures]) : List[RRownotionalOfUS_AAA] = rl match {
				      case _ =>  getRRownotionalOfUS_AAAs2 (getRRownotionalOfUS_AAAMaps(getFilteredenrichedExposures(rl)), convertSetToList(getRRownotionalOfUS_AAAMaps(getFilteredenrichedExposures(rl)).keySet) )
				  }
				    
				
				    
				  def getRRownotionalOfUS_AAAs2 (ml: Map[(String),List[RRowenrichedExposures]] , keyset : List [(String)]) : List[RRownotionalOfUS_AAA] = keyset match {   
				   case tail :+  head  =>  getRRownotionalOfUS_AAAs2 (ml,tail) :+ RRownotionalOfUS_AAA(ml(head))
				   case List() => List.empty[RRownotionalOfUS_AAA] 
				      
				 }
				  
				  def convertSetToList (xs : Set[(String)]) : List[(String)] = { 
				    
				     val ys:  List[(String)] = (for(x <- xs) yield  x)(collection.breakOut)
				     return ys
				  }
				  
				  def  getRRownotionalOfUS_AAAMaps( rl: List[RRowenrichedExposures]) : Map[(String),List[RRowenrichedExposures]]  = rl match {
				    case record =>  rl.groupBy(record => (enrichedExposuresDef.getcntry(record) ) )
				      
				  } 
				  
				    def getFilteredenrichedExposures( rl: List[RRowenrichedExposures]) : List[RRowenrichedExposures] = rl match {						  		       
				  		       case  tail :+ enrichedExposures => if (("UNITED STATES".equals(enrichedExposuresDef.getcntry(enrichedExposures)))) {getFilteredenrichedExposures(tail) :+   enrichedExposures } else getFilteredenrichedExposures(tail)
				  		       case List() => List.empty[RRowenrichedExposures]     
				  		  }
		
		 //now for each column get the logic

  

 def gettripplea_notionaamount(r : RRownotionalOfUS_AAA)  :Double  = r match {  
   case RRownotionalOfUS_AAA(list) => gettripplea_notionaamount2(list)		       
				 		   		    } 
				 		   		    
				 		   		    def gettripplea_notionaamount2(r1: List[RRowenrichedExposures])  :Double  = r1 match {  
   case tail :+  head  =>  gettripplea_notionaamount2(tail) + enrichedExposuresDef.gettripplea_notionaamount(head)  
    case List() => 0 
				 		   		    }
  
  

  
 def getcntry(r : RRownotionalOfUS_AAA)  :String    = r match {  
   case RRownotionalOfUS_AAA(list) => getcntry2(list)		       
				 		   		    } 
				 		   		    
				 		   		    def getcntry2(r1: List[RRowenrichedExposures])  :String    = r1 match {  
   case tail :+  head  => enrichedExposuresDef.getcntry(head)  
    case List() =>""
				 		   		    }
				 		   
  
  
		 		
		 		def gettracingid(r : RRownotionalOfUS_AAA) :String  = r match {
		 						  case RRownotionalOfUS_AAA(list) => "notionalOfUS_AAA(" + gettracingid2(list) + ")"	
		 					}
		 					
		 					def gettracingid2(r1: List[RRowenrichedExposures]) :String = r1 match {  
		 						 case List() :+  head  =>  enrichedExposuresDef.getconciseid(head)
		 						  case tail :+  head  =>   enrichedExposuresDef.getconciseid(head) + ":" + gettracingid2(tail) 
		 						  case List() =>""
		 					}
		 					
		 					def getconciseid(r : RRownotionalOfUS_AAA) :String  = r match {
		 									  case RRownotionalOfUS_AAA(list) => "notionalOfUS_AAA:" +md5HashString("notionalOfUS_AAA(" + getconciseid2(list) + ")")
		 								}
		 								
		 					def getconciseid2(r1: List[RRowenrichedExposures]) :String = r1 match {  
		 								case List() :+  head  =>  enrichedExposuresDef.getconciseid(head)
		 								 case tail :+  head  =>   enrichedExposuresDef.getconciseid(head) + ":" + gettracingid2(tail) 
		 								case List() =>""
		 								}
		 		 				
				
			
				def md5HashString(s: String): String = {
			    import java.security.MessageDigest
			    import java.math.BigInteger
			    val md = MessageDigest.getInstance("MD5")
			    val digest = md.digest(s.getBytes)
			    val bigInt = new BigInteger(1,digest)
			    val hashedString = bigInt.toString(16)
			    hashedString
			}
				
	

}
