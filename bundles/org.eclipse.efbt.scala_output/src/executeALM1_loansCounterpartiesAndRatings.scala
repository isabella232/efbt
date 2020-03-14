package loansCounterpartiesAndRatings_def
import base_types._ 
import funcdefs._ 
import customfuncs._

	
		

import aggregateLoansAndCounterparties_def._  //imprt each source table for this table
import rating_def._  //imprt each source table for this table
	
case class RTableloansCounterpartiesAndRatings(aggregateLoansAndCounterparties: RTableaggregateLoansAndCounterparties,rating: RTablerating) extends RTable
case class RRowloansCounterpartiesAndRatings(aggregateLoansAndCounterparties: RRowaggregateLoansAndCounterparties,rating: RRowrating) 
object loansCounterpartiesAndRatingsDef  {
def getRRowsloansCounterpartiesAndRatings(tableloansCounterpartiesAndRatings : RTableloansCounterpartiesAndRatings) : List[RRowloansCounterpartiesAndRatings] = tableloansCounterpartiesAndRatings match {
      case RTableloansCounterpartiesAndRatings(tableaggregateLoansAndCounterparties,tablerating) => getRRowsloansCounterpartiesAndRatings(aggregateLoansAndCounterpartiesDef.getRRowsaggregateLoansAndCounterparties(tableaggregateLoansAndCounterparties),ratingDef.getRRowsrating(tablerating))
  }
	  
 def getRRowsloansCounterpartiesAndRatings(rowaggregateLoansAndCounterpartiesList: List[RRowaggregateLoansAndCounterparties],rowratingList: List[RRowrating]): List[RRowloansCounterpartiesAndRatings] =  {
      (for{
aggregateLoansAndCounterparties <- rowaggregateLoansAndCounterpartiesList
rating <- rowratingList
     if ((ratingDef.getecb2_entity_lei(rating).equals(aggregateLoansAndCounterpartiesDef.getecb2_entity_lei(aggregateLoansAndCounterparties))))
   } yield RRowloansCounterpartiesAndRatings(aggregateLoansAndCounterparties,rating))
  }


	  //now for each column get the logic
def getecb2_mrkt_vl(r : RRowloansCounterpartiesAndRatings) :Double   = r match {  //set the type based on dim, id, measure
case RRowloansCounterpartiesAndRatings(aggregateLoansAndCounterparties,rating) => funcs.CopyColumn(aggregateLoansAndCounterpartiesDef.getecb2_mrkt_vl(aggregateLoansAndCounterparties)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
			  } 
		
def getntnl_amnt(r : RRowloansCounterpartiesAndRatings) :Double   = r match {  //set the type based on dim, id, measure
case RRowloansCounterpartiesAndRatings(aggregateLoansAndCounterparties,rating) => funcs.CopyColumn(aggregateLoansAndCounterpartiesDef.getntnl_amnt(aggregateLoansAndCounterparties)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
			  } 
		
def getecb2_entity_lei(r : RRowloansCounterpartiesAndRatings) :String   = r match {  //set the type based on dim, id, measure
case RRowloansCounterpartiesAndRatings(aggregateLoansAndCounterparties,rating) => funcs.CopyColumn(aggregateLoansAndCounterpartiesDef.getecb2_entity_lei(aggregateLoansAndCounterparties)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
			  } 
		
def getcntry(r : RRowloansCounterpartiesAndRatings) :String     = r match {  //set the type based on dim, id, measure
case RRowloansCounterpartiesAndRatings(aggregateLoansAndCounterparties,rating) => funcs.CopyColumn(aggregateLoansAndCounterpartiesDef.getcntry(aggregateLoansAndCounterparties)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
			  } 
		
def getcrdt_rtng_agncy(r : RRowloansCounterpartiesAndRatings) :String     = r match {  //set the type based on dim, id, measure
case RRowloansCounterpartiesAndRatings(aggregateLoansAndCounterparties,rating) => funcs.CopyColumn(ratingDef.getcrdt_rtng_agncy(rating)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
			  } 
		
def getrtng_scl_cd(r : RRowloansCounterpartiesAndRatings) :String   = r match {  //set the type based on dim, id, measure
case RRowloansCounterpartiesAndRatings(aggregateLoansAndCounterparties,rating) => funcs.CopyColumn(ratingDef.getrtng_scl_cd(rating)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
			  } 
		
	
	def gettracingid(r : RRowloansCounterpartiesAndRatings) :String  =  {
			 "loansCounterpartiesAndRatings(" + aggregateLoansAndCounterpartiesDef.getconciseid(r.aggregateLoansAndCounterparties) + ":" + ratingDef.getconciseid(r.rating) +")"
						 						  }
	def getconciseid(r : RRowloansCounterpartiesAndRatings) :String  =  {
			"loansCounterpartiesAndRatings:" +md5HashString("loansCounterpartiesAndRatings(" + aggregateLoansAndCounterpartiesDef.getconciseid(r.aggregateLoansAndCounterparties) + ":" + ratingDef.getconciseid(r.rating) +")")
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
