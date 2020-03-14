package aggregateLoansAndCounterparties_def
import base_types._ 
import funcdefs._ 
import customfuncs._

	
		

import aggregateLoans_def._  //imprt each source table for this table
import counterparty_def._  //imprt each source table for this table
	
case class RTableaggregateLoansAndCounterparties(aggregateLoans: RTableaggregateLoans,counterparty: RTablecounterparty) extends RTable
case class RRowaggregateLoansAndCounterparties(aggregateLoans: RRowaggregateLoans,counterparty: RRowcounterparty) 
object aggregateLoansAndCounterpartiesDef  {
def getRRowsaggregateLoansAndCounterparties(tableaggregateLoansAndCounterparties : RTableaggregateLoansAndCounterparties) : List[RRowaggregateLoansAndCounterparties] = tableaggregateLoansAndCounterparties match {
      case RTableaggregateLoansAndCounterparties(tableaggregateLoans,tablecounterparty) => getRRowsaggregateLoansAndCounterparties(aggregateLoansDef.getRRowsaggregateLoans(tableaggregateLoans),counterpartyDef.getRRowscounterparty(tablecounterparty))
  }
	  
 def getRRowsaggregateLoansAndCounterparties(rowaggregateLoansList: List[RRowaggregateLoans],rowcounterpartyList: List[RRowcounterparty]): List[RRowaggregateLoansAndCounterparties] =  {
      (for{
aggregateLoans <- rowaggregateLoansList
counterparty <- rowcounterpartyList
     if ((counterpartyDef.getecb2_entity_lei(counterparty).equals(aggregateLoansDef.getecb2_entity_lei(aggregateLoans))))
   } yield RRowaggregateLoansAndCounterparties(aggregateLoans,counterparty))
  }


	  //now for each column get the logic
def getecb2_mrkt_vl(r : RRowaggregateLoansAndCounterparties) :Double   = r match {  //set the type based on dim, id, measure
case RRowaggregateLoansAndCounterparties(aggregateLoans,counterparty) => funcs.CopyColumn(aggregateLoansDef.getecb2_mrkt_vl(aggregateLoans)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
			  } 
		
def getntnl_amnt(r : RRowaggregateLoansAndCounterparties) :Double   = r match {  //set the type based on dim, id, measure
case RRowaggregateLoansAndCounterparties(aggregateLoans,counterparty) => funcs.CopyColumn(aggregateLoansDef.getntnl_amnt(aggregateLoans)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
			  } 
		
def getecb2_entity_lei(r : RRowaggregateLoansAndCounterparties) :String   = r match {  //set the type based on dim, id, measure
case RRowaggregateLoansAndCounterparties(aggregateLoans,counterparty) => funcs.CopyColumn(counterpartyDef.getecb2_entity_lei(counterparty)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
			  } 
		
def getcntry(r : RRowaggregateLoansAndCounterparties) :String     = r match {  //set the type based on dim, id, measure
case RRowaggregateLoansAndCounterparties(aggregateLoans,counterparty) => funcs.CopyColumn(counterpartyDef.getcntry(counterparty)) //get the spec from function, check infix, and repalce tablecolumns appropriatelty with function calls.
			  } 
		
	
	def gettracingid(r : RRowaggregateLoansAndCounterparties) :String  =  {
			 "aggregateLoansAndCounterparties(" + aggregateLoansDef.getconciseid(r.aggregateLoans) + ":" + counterpartyDef.getconciseid(r.counterparty) +")"
						 						  }
	def getconciseid(r : RRowaggregateLoansAndCounterparties) :String  =  {
			"aggregateLoansAndCounterparties:" +md5HashString("aggregateLoansAndCounterparties(" + aggregateLoansDef.getconciseid(r.aggregateLoans) + ":" + counterpartyDef.getconciseid(r.counterparty) +")")
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
