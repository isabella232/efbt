package totalJPMktValue_def
import base_types._ 
import funcdefs._ 
import customfuncs._

	
		


	
		import enrichedExposures_def._  //imprt each source table for this table
		
		case class RTabletotalJPMktValue(t1: RTableenrichedExposures) extends RTable
				case class RRowtotalJPMktValue(enrichedExposures: List[RRowenrichedExposures])
				
				object totalJPMktValueDef  {	
				  def getRRowstotalJPMktValue(t : RTabletotalJPMktValue) : List[RRowtotalJPMktValue] = t match {
				      case RTabletotalJPMktValue(tableenrichedExposures) => getRRowstotalJPMktValue(enrichedExposuresDef.getRRowsenrichedExposures(tableenrichedExposures))
				  }
				
				  
				  def getRRowstotalJPMktValue( rl: List[RRowenrichedExposures]) : List[RRowtotalJPMktValue] = rl match {
				      case _ =>  getRRowtotalJPMktValues2 (getRRowtotalJPMktValueMaps(getFilteredenrichedExposures(rl)), convertSetToList(getRRowtotalJPMktValueMaps(getFilteredenrichedExposures(rl)).keySet) )
				  }
				    
				
				    
				  def getRRowtotalJPMktValues2 (ml: Map[(String),List[RRowenrichedExposures]] , keyset : List [(String)]) : List[RRowtotalJPMktValue] = keyset match {   
				   case tail :+  head  =>  getRRowtotalJPMktValues2 (ml,tail) :+ RRowtotalJPMktValue(ml(head))
				   case List() => List.empty[RRowtotalJPMktValue] 
				      
				 }
				  
				  def convertSetToList (xs : Set[(String)]) : List[(String)] = { 
				    
				     val ys:  List[(String)] = (for(x <- xs) yield  x)(collection.breakOut)
				     return ys
				  }
				  
				  def  getRRowtotalJPMktValueMaps( rl: List[RRowenrichedExposures]) : Map[(String),List[RRowenrichedExposures]]  = rl match {
				    case record =>  rl.groupBy(record => (enrichedExposuresDef.getcntry(record) ) )
				      
				  } 
				  
				    def getFilteredenrichedExposures( rl: List[RRowenrichedExposures]) : List[RRowenrichedExposures] = rl match {						  		       
				  		       case  tail :+ enrichedExposures => if (("JAPAN".equals(enrichedExposuresDef.getcntry(enrichedExposures)))) {getFilteredenrichedExposures(tail) :+   enrichedExposures } else getFilteredenrichedExposures(tail)
				  		       case List() => List.empty[RRowenrichedExposures]     
				  		  }
		
		 //now for each column get the logic

  

 def getecb2_mrkt_vl(r : RRowtotalJPMktValue)  :Double  = r match {  
   case RRowtotalJPMktValue(list) => getecb2_mrkt_vl2(list)		       
				 		   		    } 
				 		   		    
				 		   		    def getecb2_mrkt_vl2(r1: List[RRowenrichedExposures])  :Double  = r1 match {  
   case tail :+  head  =>  getecb2_mrkt_vl2(tail) + enrichedExposuresDef.getecb2_mrkt_vl(head)  
    case List() => 0 
				 		   		    }
  
  

  
 def getcntry(r : RRowtotalJPMktValue)  :String    = r match {  
   case RRowtotalJPMktValue(list) => getcntry2(list)		       
				 		   		    } 
				 		   		    
				 		   		    def getcntry2(r1: List[RRowenrichedExposures])  :String    = r1 match {  
   case tail :+  head  => enrichedExposuresDef.getcntry(head)  
    case List() =>""
				 		   		    }
				 		   
  
  
		 		
		 		def gettracingid(r : RRowtotalJPMktValue) :String  = r match {
		 						  case RRowtotalJPMktValue(list) => "totalJPMktValue(" + gettracingid2(list) + ")"	
		 					}
		 					
		 					def gettracingid2(r1: List[RRowenrichedExposures]) :String = r1 match {  
		 						 case List() :+  head  =>  enrichedExposuresDef.getconciseid(head)
		 						  case tail :+  head  =>   enrichedExposuresDef.getconciseid(head) + ":" + gettracingid2(tail) 
		 						  case List() =>""
		 					}
		 					
		 					def getconciseid(r : RRowtotalJPMktValue) :String  = r match {
		 									  case RRowtotalJPMktValue(list) => "totalJPMktValue:" +md5HashString("totalJPMktValue(" + getconciseid2(list) + ")")
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
