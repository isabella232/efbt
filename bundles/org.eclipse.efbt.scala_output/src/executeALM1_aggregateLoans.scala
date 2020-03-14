package aggregateLoans_def
import base_types._ 
import funcdefs._ 
import customfuncs._

	
		




import loans_def._  //imprt each source table for this table

case class RTableaggregateLoans(t1: RTableloans) extends RTable
case class RRowaggregateLoans(loans: List[RRowloans])

object aggregateLoansDef  {	
  def getRRowsaggregateLoans(t : RTableaggregateLoans) : List[RRowaggregateLoans] = t match {
      case RTableaggregateLoans(tableloans) => getRRowsaggregateLoans(loansDef.getRRowsloans(tableloans))
  }

  
  def getRRowsaggregateLoans( rl: List[RRowloans]) : List[RRowaggregateLoans] = rl match {
      case _ =>  getRRowaggregateLoanss2 (getRRowaggregateLoansMaps(rl), convertSetToList(getRRowaggregateLoansMaps(rl).keySet) )
  }
    

    
  def getRRowaggregateLoanss2 (ml: Map[(String),List[RRowloans]] , keyset : List [(String)]) : List[RRowaggregateLoans] = keyset match {   
   case tail :+  head  =>  getRRowaggregateLoanss2 (ml,tail) :+ RRowaggregateLoans(ml(head))
   case List() => List.empty[RRowaggregateLoans] 
      
 }
  
  def convertSetToList (xs : Set[(String)]) : List[(String)] = { 
    
     val ys:  List[(String)] = (for(x <- xs) yield  x)(collection.breakOut)
     return ys
  }
  
  def  getRRowaggregateLoansMaps( rl: List[RRowloans]) : Map[(String),List[RRowloans]]  = rl match {
    case record =>  rl.groupBy(record => (loansDef.getecb2_entity_lei(record) ) )
      
  } 
  
    
     def getecb2_mrkt_vl(r : RRowaggregateLoans)  :Double  = r match {  
       case RRowaggregateLoans(list) => getecb2_mrkt_vl2(list)		       
		    } 
		    
		    def getecb2_mrkt_vl2(r1: List[RRowloans])  :Double  = r1 match {  
       case tail :+  head  =>  getecb2_mrkt_vl2(tail) + loansDef.getecb2_mrkt_vl(head)  
        case List() => 0 
		    }
    
     def getntnl_amnt(r : RRowaggregateLoans)  :Double  = r match {  
       case RRowaggregateLoans(list) => getntnl_amnt2(list)		       
		    } 
		    
		    def getntnl_amnt2(r1: List[RRowloans])  :Double  = r1 match {  
       case tail :+  head  =>  getntnl_amnt2(tail) + loansDef.getntnl_amnt(head)  
        case List() => 0 
		    }
     def getecb2_entity_lei(r : RRowaggregateLoans)  :String  = r match {  
       case RRowaggregateLoans(list) => getecb2_entity_lei2(list)		       
		    } 
		    
		    def getecb2_entity_lei2(r1: List[RRowloans])  :String  = r1 match {  
       case tail :+  head  => loansDef.getecb2_entity_lei(head)  
        case List() =>""
		    }

	def gettracingid(r : RRowaggregateLoans) :String  = r match {
		  case RRowaggregateLoans(list) => "aggregateLoans(" + gettracingid2(list) + ")"	
	}
	
	def gettracingid2(r1: List[RRowloans]) :String = r1 match {  
		   case List() :+  head  =>  loansDef.getconciseid(head)
		   case tail :+  head  => gettracingid2(tail) + ":" +  loansDef.getconciseid(head)  
		    
		 		         case List() =>""
	}						  
	
	def getconciseid(r : RRowaggregateLoans) :String  = r match {
					  case RRowaggregateLoans(list) => "aggregateLoans:" +md5HashString("aggregateLoans(" + getconciseid2(list) + ")")	
				}
				
	def getconciseid2(r1: List[RRowloans]) :String = r1 match {  
					    case List() :+  head  =>  loansDef.getconciseid(head)
					   case tail :+  head  =>   loansDef.getconciseid(head) + ":" + gettracingid2(tail) 
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
