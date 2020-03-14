package totalUSNotional_def
import base_types._ 
import funcdefs._ 
import customfuncs._

	
		


	
		import enrichedExposures_def._  //imprt each source table for this table
		
		case class RTabletotalUSNotional(t1: RTableenrichedExposures) extends RTable
				case class RRowtotalUSNotional(enrichedExposures: List[RRowenrichedExposures])
				
				object totalUSNotionalDef  {	
				  def getRRowstotalUSNotional(t : RTabletotalUSNotional) : List[RRowtotalUSNotional] = t match {
				      case RTabletotalUSNotional(tableenrichedExposures) => getRRowstotalUSNotional(enrichedExposuresDef.getRRowsenrichedExposures(tableenrichedExposures))
				  }
				
				  
				  def getRRowstotalUSNotional( rl: List[RRowenrichedExposures]) : List[RRowtotalUSNotional] = rl match {
				      case _ =>  getRRowtotalUSNotionals2 (getRRowtotalUSNotionalMaps(getFilteredenrichedExposures(rl)), convertSetToList(getRRowtotalUSNotionalMaps(getFilteredenrichedExposures(rl)).keySet) )
				  }
				    
				
				    
				  def getRRowtotalUSNotionals2 (ml: Map[(String),List[RRowenrichedExposures]] , keyset : List [(String)]) : List[RRowtotalUSNotional] = keyset match {   
				   case tail :+  head  =>  getRRowtotalUSNotionals2 (ml,tail) :+ RRowtotalUSNotional(ml(head))
				   case List() => List.empty[RRowtotalUSNotional] 
				      
				 }
				  
				  def convertSetToList (xs : Set[(String)]) : List[(String)] = { 
				    
				     val ys:  List[(String)] = (for(x <- xs) yield  x)(collection.breakOut)
				     return ys
				  }
				  
				  def  getRRowtotalUSNotionalMaps( rl: List[RRowenrichedExposures]) : Map[(String),List[RRowenrichedExposures]]  = rl match {
				    case record =>  rl.groupBy(record => (enrichedExposuresDef.getcntry(record) ) )
				      
				  } 
				  
				    def getFilteredenrichedExposures( rl: List[RRowenrichedExposures]) : List[RRowenrichedExposures] = rl match {						  		       
				  		       case  tail :+ enrichedExposures => if (("UNITED STATES".equals(enrichedExposuresDef.getcntry(enrichedExposures)))) {getFilteredenrichedExposures(tail) :+   enrichedExposures } else getFilteredenrichedExposures(tail)
				  		       case List() => List.empty[RRowenrichedExposures]     
				  		  }
		
		 //now for each column get the logic

  

 def getntnl_amnt(r : RRowtotalUSNotional)  :Double  = r match {  
   case RRowtotalUSNotional(list) => getntnl_amnt2(list)		       
				 		   		    } 
				 		   		    
				 		   		    def getntnl_amnt2(r1: List[RRowenrichedExposures])  :Double  = r1 match {  
   case tail :+  head  =>  getntnl_amnt2(tail) + enrichedExposuresDef.getntnl_amnt(head)  
    case List() => 0 
				 		   		    }
  
  

  
 def getcntry(r : RRowtotalUSNotional)  :String    = r match {  
   case RRowtotalUSNotional(list) => getcntry2(list)		       
				 		   		    } 
				 		   		    
				 		   		    def getcntry2(r1: List[RRowenrichedExposures])  :String    = r1 match {  
   case tail :+  head  => enrichedExposuresDef.getcntry(head)  
    case List() =>""
				 		   		    }
				 		   
  
  
		 		
		 		def gettracingid(r : RRowtotalUSNotional) :String  = r match {
		 						  case RRowtotalUSNotional(list) => "totalUSNotional(" + gettracingid2(list) + ")"	
		 					}
		 					
		 					def gettracingid2(r1: List[RRowenrichedExposures]) :String = r1 match {  
		 						 case List() :+  head  =>  enrichedExposuresDef.getconciseid(head)
		 						  case tail :+  head  =>   enrichedExposuresDef.getconciseid(head) + ":" + gettracingid2(tail) 
		 						  case List() =>""
		 					}
		 					
		 					def getconciseid(r : RRowtotalUSNotional) :String  = r match {
		 									  case RRowtotalUSNotional(list) => "totalUSNotional:" +md5HashString("totalUSNotional(" + getconciseid2(list) + ")")
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
