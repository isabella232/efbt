package enrichedExposures_def
import base_types._ 
import funcdefs._ 
import customfuncs._

	
		


import loansCounterpartiesAndRatings_def._  //import each source table for this table


case class RTableenrichedExposures(t1: RTableloansCounterpartiesAndRatings) extends RTable 


case class RRowenrichedExposures(loansCounterpartiesAndRatings: RRowloansCounterpartiesAndRatings) 

object enrichedExposuresDef  {
   
  def getRRowsenrichedExposures(t : RTableenrichedExposures) : List[RRowenrichedExposures]= t match {
      case RTableenrichedExposures(someTable) => getRRowsenrichedExposures(loansCounterpartiesAndRatingsDef.getRRowsloansCounterpartiesAndRatings(someTable))
  }
  
  def getRRowsenrichedExposures( rl: List[RRowloansCounterpartiesAndRatings]) : List[RRowenrichedExposures] = rl match {
       case  tail :+ head => getRRowsenrichedExposures(tail) :+   RRowenrichedExposures(head) 
       case List() => List.empty[RRowenrichedExposures]  
  }

 //now for each column get the logic
def gettripplea_notionaamount(r : RRowenrichedExposures) :Double  = r match {  //set the type based on dim, id, measure
case RRowenrichedExposures(loansCounterpartiesAndRatings) => CustomFunctions.trippleA_NotionaAmount(loansCounterpartiesAndRatingsDef.getrtng_scl_cd(loansCounterpartiesAndRatings),loansCounterpartiesAndRatingsDef.getntnl_amnt(loansCounterpartiesAndRatings)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
	 			  } 
 		  
def getecb2_mrkt_vl(r : RRowenrichedExposures) :Double  = r match {  //set the type based on dim, id, measure
case RRowenrichedExposures(loansCounterpartiesAndRatings) => funcs.CopyColumn(loansCounterpartiesAndRatingsDef.getecb2_mrkt_vl(loansCounterpartiesAndRatings)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
	 			  } 
 		  
def getntnl_amnt(r : RRowenrichedExposures) :Double  = r match {  //set the type based on dim, id, measure
case RRowenrichedExposures(loansCounterpartiesAndRatings) => funcs.CopyColumn(loansCounterpartiesAndRatingsDef.getntnl_amnt(loansCounterpartiesAndRatings)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
	 			  } 
 		  
def getecb2_entity_lei(r : RRowenrichedExposures) :String  = r match {  //set the type based on dim, id, measure
case RRowenrichedExposures(loansCounterpartiesAndRatings) => funcs.CopyColumn(loansCounterpartiesAndRatingsDef.getecb2_entity_lei(loansCounterpartiesAndRatings)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
	 			  } 
 		  
def getcntry(r : RRowenrichedExposures) :String    = r match {  //set the type based on dim, id, measure
case RRowenrichedExposures(loansCounterpartiesAndRatings) => funcs.CopyColumn(loansCounterpartiesAndRatingsDef.getcntry(loansCounterpartiesAndRatings)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
	 			  } 
 		  
def getcrdt_rtng_agncy(r : RRowenrichedExposures) :String    = r match {  //set the type based on dim, id, measure
case RRowenrichedExposures(loansCounterpartiesAndRatings) => funcs.CopyColumn(loansCounterpartiesAndRatingsDef.getcrdt_rtng_agncy(loansCounterpartiesAndRatings)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
	 			  } 
 		  
def getrtng_scl_cd(r : RRowenrichedExposures) :String  = r match {  //set the type based on dim, id, measure
case RRowenrichedExposures(loansCounterpartiesAndRatings) => funcs.CopyColumn(loansCounterpartiesAndRatingsDef.getrtng_scl_cd(loansCounterpartiesAndRatings)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
	 			  } 
 		  
 		
 		def gettracingid(r : RRowenrichedExposures) :String  =  {
 						     "enrichedExposures(" + loansCounterpartiesAndRatingsDef.getconciseid(r.loansCounterpartiesAndRatings) + ")"
 						  }
 		def getconciseid(r : RRowenrichedExposures) :String  = {
 			 						     "enrichedExposures:" +md5HashString("enrichedExposures(" + loansCounterpartiesAndRatingsDef.getconciseid(r.loansCounterpartiesAndRatings) + ")")
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
