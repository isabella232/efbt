	
	import counterparty_def._  
	import counterparty_data._  
	import rating_def._  
	import rating_data._  
	import loans_def._  
	import loans_data._  
	import aggregateLoans_def._  
	import aggregateLoansAndCounterparties_def._  
	import loansCounterpartiesAndRatings_def._  
	import enrichedExposures_def._  
	import totalJPMktValue_def._  
	import totalUSNotional_def._  
	import notionalOfUS_AAA_def._  
	
	object TheCellModelCreator extends App {
	  override def  main(args: Array[String]) {
	val t_counterparty: RTablecounterparty  = RTablecounterparty(counterpartyData.initialiseRowList()) 		 
	val t_rating: RTablerating  = RTablerating(ratingData.initialiseRowList()) 		 
	val t_loans: RTableloans  = RTableloans(loansData.initialiseRowList()) 		 
	val t_aggregateLoans: RTableaggregateLoans= RTableaggregateLoans(t_loans)				
	val t_aggregateLoansAndCounterparties: RTableaggregateLoansAndCounterparties= RTableaggregateLoansAndCounterparties(t_aggregateLoans,t_counterparty)				
	val t_loansCounterpartiesAndRatings: RTableloansCounterpartiesAndRatings= RTableloansCounterpartiesAndRatings(t_aggregateLoansAndCounterparties,t_rating)				
	val t_enrichedExposures: RTableenrichedExposures= RTableenrichedExposures(t_loansCounterpartiesAndRatings)				
	val t_totalJPMktValue: RTabletotalJPMktValue= RTabletotalJPMktValue(t_enrichedExposures)				
	val t_totalUSNotional: RTabletotalUSNotional= RTabletotalUSNotional(t_enrichedExposures)				
	val t_notionalOfUS_AAA: RTablenotionalOfUS_AAA= RTablenotionalOfUS_AAA(t_enrichedExposures)				
	
	def stringForHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<data_lineage:DataLineageModel xmlns:data_lineage=\"http://www.eclipse.org/data_lineage\" xmlns:base_cube_data=\"http://www.eclipse.org/base_cube_data\" xmlns:functions=\"http://www.eclipse.org/functions\" >\n" 
					  
			val stringForFile = stringForHeader + 
			stringForaggregateLoansTable(t_aggregateLoans) +stringForaggregateLoansAndCounterpartiesTable(t_aggregateLoansAndCounterparties) +stringForloansCounterpartiesAndRatingsTable(t_loansCounterpartiesAndRatings) +stringForenrichedExposuresTable(t_enrichedExposures) +stringFortotalJPMktValueTable(t_totalJPMktValue) +stringFortotalUSNotionalTable(t_totalUSNotional) +stringFornotionalOfUS_AAATable(t_notionalOfUS_AAA) + stringForcounterpartyTable(t_counterparty) +stringForratingTable(t_rating) +stringForloansTable(t_loans)  +stringForEndOfXML()
			
				import java.io._
			    val pw = new PrintWriter(new File("C:\\freebirdtools-develop\\git\\efbt\\bundles\\org.eclipse.efbt.scala_output\\src\\ALM1_generated.data_lineage" ))
			    pw.write(stringForFile)
			    pw.close
	}
	
						def  stringForloansTable(table_loans: RTableloans ) :String = 
								{				 
								   "<sourceData name=\"loans\" cube=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/efbt_cubes.cubes#loans\"> \n" +
								    "<rows rowID=\"loans_row1\">\n" +
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"loans_row1:ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"5000\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"loans_row1:NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"100000\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"loans_row1:ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"Mizuho\"/>\n" +					   						     					   						     
								   "</rows>\n" +
								    "<rows rowID=\"loans_row2\">\n" +
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"loans_row2:ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"9000\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"loans_row2:NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"200000\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"loans_row2:ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"Mizuho\"/>\n" +					   						     					   						     
								   "</rows>\n" +
								    "<rows rowID=\"loans_row3\">\n" +
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"loans_row3:ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"15000\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"loans_row3:NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"300000\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"loans_row3:ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"Citibank\"/>\n" +					   						     					   						     
								   "</rows>\n" +
								   "</sourceData>\n "
							     
								}
	
						def  stringForcounterpartyTable(table_counterparty: RTablecounterparty ) :String = 
								{				 
								   "<sourceData name=\"counterparty\" cube=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/efbt_cubes.cubes#counterparty\"> \n" +
								    "<rows rowID=\"counterparty_row1\">\n" +
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"counterparty_row1:ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"Citibank\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithEnumeratedValue\" cellID=\"counterparty_row1:CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/members.efbt_data_definition#EBA_GA_EBA_US\"/>\n" +					   						     					   						     
								   "</rows>\n" +
								    "<rows rowID=\"counterparty_row2\">\n" +
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"counterparty_row2:ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"Mizuho\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithEnumeratedValue\" cellID=\"counterparty_row2:CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/members.efbt_data_definition#EBA_GA_EBA_JP\"/>\n" +					   						     					   						     
								   "</rows>\n" +
								   "</sourceData>\n "
							     
								}
	
						def  stringForratingTable(table_rating: RTablerating ) :String = 
								{				 
								   "<sourceData name=\"rating\" cube=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/efbt_cubes.cubes#rating\"> \n" +
								    "<rows rowID=\"rating_row1\">\n" +
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithEnumeratedValue\" cellID=\"rating_row1:CRDT_RTNG_AGNCY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CRDT_RTNG_AGNCY\" value=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/members.efbt_data_definition#CRDT_RTNG_AGNCY_1\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"rating_row1:RTNG_SCL_CD\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#RTNG_SCL_CD\" value=\"AAA\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"rating_row1:ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"Citibank\"/>\n" +					   						     					   						     
								   "</rows>\n" +
								    "<rows rowID=\"rating_row2\">\n" +
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithEnumeratedValue\" cellID=\"rating_row2:CRDT_RTNG_AGNCY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CRDT_RTNG_AGNCY\" value=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/members.efbt_data_definition#CRDT_RTNG_AGNCY_1\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"rating_row2:RTNG_SCL_CD\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#RTNG_SCL_CD\" value=\"AA\"/>\n" +					   						     					   						     
								   	"<cells xsi:type=\"base_cube_data:BaseCellWithValue\" cellID=\"rating_row2:ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"Mizuho\"/>\n" +					   						     					   						     
								   "</rows>\n" +
								   "</sourceData>\n "
							     
								}
					
						
				        			

	
	
	
	def  stringForaggregateLoansTable(table_aggregateLoans: RTableaggregateLoans ) :String = 
	{
	   
	  
	   "<dataTraceableByCell name=\"aggregateLoans\" cubeLogic=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#aggregateLoans\" sourceCubeData=\"#loans\" cube=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/efbt_cubes.cubes#aggregateLoans\"> \n" +
	   stringForaggregateLoansTable2(aggregateLoansDef.getRRowsaggregateLoans(table_aggregateLoans)) +   
	   "</dataTraceableByCell>\n "
	     
	}
	
	
	def  stringForaggregateLoansTable2(rows :  List[RRowaggregateLoans] ) :String    = rows match
	{
	    
	   case tail :+  head  => 
	     stringForaggregateLoansRow(head) + 
	     stringForaggregateLoansTable2(tail) 
	   case List() => ""  
	} 
	
	
	def stringForaggregateLoansRow(row : RRowaggregateLoans) :String = 
	{
	   val rowID = aggregateLoansDef.getconciseid(row)
	  

				    "<rows rowID=\"" +rowID + "\" sourceRows=\"" + getListOfIdsforSourceRowsOfaggregateLoans(row) + "\">\n" +		  		  
 		stringForGroupRowaggregateLoans(row)  + 
 		"</rows>\n" 
 
	  
	}
	
		  
def  getListOfIdsforSourceRowsOfaggregateLoans(row : RRowaggregateLoans ) :String =
{
	 getListOfIdsforSourceRowsOfaggregateLoans2(row.loans)
	
}
def  getListOfIdsforSourceRowsOfaggregateLoans2(rows: List[RRowloans] ) :String =  rows match
		{
			  case  List() :+ head=>  "#" +loansDef.getconciseid(head)
			  case  tail :+ head =>   "#" +loansDef.getconciseid(head) +" " + getListOfIdsforSourceRowsOfaggregateLoans2(tail) 
			 		       case List() => "" 
			
		}
def getParamsForTheSourceRowsOfaggregateLoans(aggregateLoansRow :RRowaggregateLoans, col :String) :String =  {

   getParamsForSourceRowsOfaggregateLoans(aggregateLoansRow.loans, col)
}
	 
	 
	 
	def getParamsForSourceRowsOfaggregateLoans(loansRows :List[RRowloans], col :String) :String = loansRows match {
	  case  tail :+ head => getParamsForSourceRowsOfaggregateLoans(tail,col) +   getParamForSourceRowOfaggregateLoans(head,col) 
	       case List() => "" 
	}
	
	def getParamForSourceRowOfaggregateLoans(loansRow :RRowloans, col :String) :String = {
	  
	  val rowId = loansDef.getconciseid(loansRow)
	  "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + rowId +":" +col+ "\"/>\n"
	}
	
	
	
	def stringForGroupRowaggregateLoans(row : RRowaggregateLoans) :String     =  { 
				
						 
				val rowID = aggregateLoansDef.getconciseid(row)
				 
				 
			  
			  val ecb2_mrkt_vl = aggregateLoansDef.getecb2_mrkt_vl(row)
			  
				
				 val ecb2_mrkt_vlText =	"<derivedCells cellID=\"" + rowID + ":ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"" + ecb2_mrkt_vl + "\">\n" +
				    "   <function xsi:type=\"functions:AggregateFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/commonFunctions.functions#SUM\">\n" + getParamsForTheSourceRowsOfaggregateLoans(row,"ECB2_MRKT_VL") +    "   </function>\n" +  
	      "   </derivedCells>\n"
			  
			  val ntnl_amnt = aggregateLoansDef.getntnl_amnt(row)
			  
				
				 val ntnl_amntText =	"<derivedCells cellID=\"" + rowID + ":NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"" + ntnl_amnt + "\">\n" +
				    "   <function xsi:type=\"functions:AggregateFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/commonFunctions.functions#SUM\">\n" + getParamsForTheSourceRowsOfaggregateLoans(row,"NTNL_AMNT") +    "   </function>\n" +  
	      "   </derivedCells>\n"
			  
			  val ecb2_entity_lei = aggregateLoansDef.getecb2_entity_lei(row)
			  
				
				 val ecb2_entity_leiText =	"<derivedCells cellID=\"" + rowID + ":ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"" + ecb2_entity_lei + "\">\n" +
				    "   <function xsi:type=\"functions:AggregateFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#First\">\n" + getParamsForTheSourceRowsOfaggregateLoans(row,"ECB2_ENTITY_LEI") +    "   </function>\n" +  
	      "   </derivedCells>\n"
			
			   ecb2_mrkt_vlText+ntnl_amntText+ecb2_entity_leiText
		   
			} 
	
	def stringForRowaggregateLoans(row : RRowaggregateLoans) :String     =  { 
		
				 
		val rowID = aggregateLoansDef.getconciseid(row)
		 
	  val ecb2_mrkt_vl = aggregateLoansDef.getecb2_mrkt_vl(row)
		 
		
		 val ecb2_mrkt_vlText =	"<derivedCells cellID=\"" + rowID + ":ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"" + ecb2_mrkt_vl + "\">\n" +
		     "   </derivedCells>\n"
	  val ntnl_amnt = aggregateLoansDef.getntnl_amnt(row)
		 
		
		 val ntnl_amntText =	"<derivedCells cellID=\"" + rowID + ":NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"" + ntnl_amnt + "\">\n" +
		     "   </derivedCells>\n"
	  val ecb2_entity_lei = aggregateLoansDef.getecb2_entity_lei(row)
		 
		
		 val ecb2_entity_leiText =	"<derivedCells cellID=\"" + rowID + ":ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"" + ecb2_entity_lei + "\">\n" +
		     "   </derivedCells>\n"
	
	   ecb2_mrkt_vlText+ntnl_amntText+ecb2_entity_leiText
	   
	} 
	
	
	
	
	def  stringForaggregateLoansAndCounterpartiesTable(table_aggregateLoansAndCounterparties: RTableaggregateLoansAndCounterparties ) :String = 
	{
	   
	  
	   "<dataTraceableByCell name=\"aggregateLoansAndCounterparties\" cubeLogic=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#aggregateLoansAndCounterparties\" sourceCubeData=\"#aggregateLoans #counterparty\" cube=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/efbt_cubes.cubes#aggregateLoansAndCounterparties\"> \n" +
	   stringForaggregateLoansAndCounterpartiesTable2(aggregateLoansAndCounterpartiesDef.getRRowsaggregateLoansAndCounterparties(table_aggregateLoansAndCounterparties)) +   
	   "</dataTraceableByCell>\n "
	     
	}
	
	
	def  stringForaggregateLoansAndCounterpartiesTable2(rows :  List[RRowaggregateLoansAndCounterparties] ) :String    = rows match
	{
	    
	   case tail :+  head  => 
	     stringForaggregateLoansAndCounterpartiesRow(head) + 
	     stringForaggregateLoansAndCounterpartiesTable2(tail) 
	   case List() => ""  
	} 
	
	
	def stringForaggregateLoansAndCounterpartiesRow(row : RRowaggregateLoansAndCounterparties) :String = 
	{
	   val rowID = aggregateLoansAndCounterpartiesDef.getconciseid(row)
	  
	   val sourcerowaggregateLoans = row.aggregateLoans
	   val sourcerowIDaggregateLoans =aggregateLoansDef.getconciseid(sourcerowaggregateLoans)
	   val sourcerowcounterparty = row.counterparty
	   val sourcerowIDcounterparty =counterpartyDef.getconciseid(sourcerowcounterparty)
	   		  		    "<rows rowID=\"" +rowID + "\" sourceRows=\"" +  "#" + sourcerowIDaggregateLoans+" " +"#" + sourcerowIDcounterparty+"\">\n" +
	   		  		stringForRowaggregateLoansAndCounterparties(row)  + 
	   		  		"</rows>\n" 
	   
			  
	  
	}
	
	 
	 
	 
	def getParamsForSourceRowsOfaggregateLoansAndCounterparties(aggregateLoansRows :List[RRowaggregateLoans], col :String) :String = aggregateLoansRows match {
	  case  tail :+ head => getParamsForSourceRowsOfaggregateLoansAndCounterparties(tail,col) +   getParamForSourceRowOfaggregateLoansAndCounterparties(head,col) 
	       case List() => "" 
	}
	
	def getParamForSourceRowOfaggregateLoansAndCounterparties(aggregateLoansRow :RRowaggregateLoans, col :String) :String = {
	  
	  val rowId = aggregateLoansDef.getconciseid(aggregateLoansRow)
	  "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + rowId +":" +col+ "\"/>\n"
	}
	
	
	
	def stringForGroupRowaggregateLoansAndCounterparties(row : RRowaggregateLoansAndCounterparties) :String     =  { 
				
						 
				val rowID = aggregateLoansAndCounterpartiesDef.getconciseid(row)
				 
				 
			  
			  val ecb2_mrkt_vl = aggregateLoansAndCounterpartiesDef.getecb2_mrkt_vl(row)
			  
				
				 val ecb2_mrkt_vlText =	"<derivedCells cellID=\"" + rowID + ":ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"" + ecb2_mrkt_vl + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val ntnl_amnt = aggregateLoansAndCounterpartiesDef.getntnl_amnt(row)
			  
				
				 val ntnl_amntText =	"<derivedCells cellID=\"" + rowID + ":NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"" + ntnl_amnt + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val ecb2_entity_lei = aggregateLoansAndCounterpartiesDef.getecb2_entity_lei(row)
			  
				
				 val ecb2_entity_leiText =	"<derivedCells cellID=\"" + rowID + ":ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"" + ecb2_entity_lei + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val cntry = aggregateLoansAndCounterpartiesDef.getcntry(row)
			  
				
				 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
	      "   </derivedCells>\n"
			
			   ecb2_mrkt_vlText+ntnl_amntText+ecb2_entity_leiText+cntryText
		   
			} 
	
	def stringForRowaggregateLoansAndCounterparties(row : RRowaggregateLoansAndCounterparties) :String     =  { 
		
				 
		val rowID = aggregateLoansAndCounterpartiesDef.getconciseid(row)
		 
val sourcerowaggregateLoans = row.aggregateLoans
val sourcerowIDaggregateLoans =aggregateLoansDef.getconciseid(sourcerowaggregateLoans)
val sourcerowcounterparty = row.counterparty
val sourcerowIDcounterparty =counterpartyDef.getconciseid(sourcerowcounterparty)
	  val ecb2_mrkt_vl = aggregateLoansAndCounterpartiesDef.getecb2_mrkt_vl(row)
		 
		
		 val ecb2_mrkt_vlText =	"<derivedCells cellID=\"" + rowID + ":ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"" + ecb2_mrkt_vl + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDaggregateLoans +":ECB2_MRKT_VL\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val ntnl_amnt = aggregateLoansAndCounterpartiesDef.getntnl_amnt(row)
		 
		
		 val ntnl_amntText =	"<derivedCells cellID=\"" + rowID + ":NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"" + ntnl_amnt + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDaggregateLoans +":NTNL_AMNT\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val ecb2_entity_lei = aggregateLoansAndCounterpartiesDef.getecb2_entity_lei(row)
		 
		
		 val ecb2_entity_leiText =	"<derivedCells cellID=\"" + rowID + ":ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"" + ecb2_entity_lei + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDcounterparty +":ECB2_ENTITY_LEI\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val cntry = aggregateLoansAndCounterpartiesDef.getcntry(row)
		 
		
		 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDcounterparty +":CNTRY\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	
	   ecb2_mrkt_vlText+ntnl_amntText+ecb2_entity_leiText+cntryText
	   
	} 
	
	
	
	
	def  stringForloansCounterpartiesAndRatingsTable(table_loansCounterpartiesAndRatings: RTableloansCounterpartiesAndRatings ) :String = 
	{
	   
	  
	   "<dataTraceableByCell name=\"loansCounterpartiesAndRatings\" cubeLogic=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#loansCounterpartiesAndRatings\" sourceCubeData=\"#aggregateLoansAndCounterparties #rating\" cube=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/efbt_cubes.cubes#loansCounterpartiesAndRatings\"> \n" +
	   stringForloansCounterpartiesAndRatingsTable2(loansCounterpartiesAndRatingsDef.getRRowsloansCounterpartiesAndRatings(table_loansCounterpartiesAndRatings)) +   
	   "</dataTraceableByCell>\n "
	     
	}
	
	
	def  stringForloansCounterpartiesAndRatingsTable2(rows :  List[RRowloansCounterpartiesAndRatings] ) :String    = rows match
	{
	    
	   case tail :+  head  => 
	     stringForloansCounterpartiesAndRatingsRow(head) + 
	     stringForloansCounterpartiesAndRatingsTable2(tail) 
	   case List() => ""  
	} 
	
	
	def stringForloansCounterpartiesAndRatingsRow(row : RRowloansCounterpartiesAndRatings) :String = 
	{
	   val rowID = loansCounterpartiesAndRatingsDef.getconciseid(row)
	  
	   val sourcerowaggregateLoansAndCounterparties = row.aggregateLoansAndCounterparties
	   val sourcerowIDaggregateLoansAndCounterparties =aggregateLoansAndCounterpartiesDef.getconciseid(sourcerowaggregateLoansAndCounterparties)
	   val sourcerowrating = row.rating
	   val sourcerowIDrating =ratingDef.getconciseid(sourcerowrating)
	   		  		    "<rows rowID=\"" +rowID + "\" sourceRows=\"" +  "#" + sourcerowIDaggregateLoansAndCounterparties+" " +"#" + sourcerowIDrating+"\">\n" +
	   		  		stringForRowloansCounterpartiesAndRatings(row)  + 
	   		  		"</rows>\n" 
	   
			  
	  
	}
	
	 
	 
	 
	def getParamsForSourceRowsOfloansCounterpartiesAndRatings(aggregateLoansAndCounterpartiesRows :List[RRowaggregateLoansAndCounterparties], col :String) :String = aggregateLoansAndCounterpartiesRows match {
	  case  tail :+ head => getParamsForSourceRowsOfloansCounterpartiesAndRatings(tail,col) +   getParamForSourceRowOfloansCounterpartiesAndRatings(head,col) 
	       case List() => "" 
	}
	
	def getParamForSourceRowOfloansCounterpartiesAndRatings(aggregateLoansAndCounterpartiesRow :RRowaggregateLoansAndCounterparties, col :String) :String = {
	  
	  val rowId = aggregateLoansAndCounterpartiesDef.getconciseid(aggregateLoansAndCounterpartiesRow)
	  "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + rowId +":" +col+ "\"/>\n"
	}
	
	
	
	def stringForGroupRowloansCounterpartiesAndRatings(row : RRowloansCounterpartiesAndRatings) :String     =  { 
				
						 
				val rowID = loansCounterpartiesAndRatingsDef.getconciseid(row)
				 
				 
			  
			  val ecb2_mrkt_vl = loansCounterpartiesAndRatingsDef.getecb2_mrkt_vl(row)
			  
				
				 val ecb2_mrkt_vlText =	"<derivedCells cellID=\"" + rowID + ":ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"" + ecb2_mrkt_vl + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val ntnl_amnt = loansCounterpartiesAndRatingsDef.getntnl_amnt(row)
			  
				
				 val ntnl_amntText =	"<derivedCells cellID=\"" + rowID + ":NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"" + ntnl_amnt + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val ecb2_entity_lei = loansCounterpartiesAndRatingsDef.getecb2_entity_lei(row)
			  
				
				 val ecb2_entity_leiText =	"<derivedCells cellID=\"" + rowID + ":ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"" + ecb2_entity_lei + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val cntry = loansCounterpartiesAndRatingsDef.getcntry(row)
			  
				
				 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val crdt_rtng_agncy = loansCounterpartiesAndRatingsDef.getcrdt_rtng_agncy(row)
			  
				
				 val crdt_rtng_agncyText =	"<derivedCells cellID=\"" + rowID + ":CRDT_RTNG_AGNCY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CRDT_RTNG_AGNCY\" value=\"" + crdt_rtng_agncy + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val rtng_scl_cd = loansCounterpartiesAndRatingsDef.getrtng_scl_cd(row)
			  
				
				 val rtng_scl_cdText =	"<derivedCells cellID=\"" + rowID + ":RTNG_SCL_CD\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#RTNG_SCL_CD\" value=\"" + rtng_scl_cd + "\">\n" +
	      "   </derivedCells>\n"
			
			   ecb2_mrkt_vlText+ntnl_amntText+ecb2_entity_leiText+cntryText+crdt_rtng_agncyText+rtng_scl_cdText
		   
			} 
	
	def stringForRowloansCounterpartiesAndRatings(row : RRowloansCounterpartiesAndRatings) :String     =  { 
		
				 
		val rowID = loansCounterpartiesAndRatingsDef.getconciseid(row)
		 
val sourcerowaggregateLoansAndCounterparties = row.aggregateLoansAndCounterparties
val sourcerowIDaggregateLoansAndCounterparties =aggregateLoansAndCounterpartiesDef.getconciseid(sourcerowaggregateLoansAndCounterparties)
val sourcerowrating = row.rating
val sourcerowIDrating =ratingDef.getconciseid(sourcerowrating)
	  val ecb2_mrkt_vl = loansCounterpartiesAndRatingsDef.getecb2_mrkt_vl(row)
		 
		
		 val ecb2_mrkt_vlText =	"<derivedCells cellID=\"" + rowID + ":ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"" + ecb2_mrkt_vl + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDaggregateLoansAndCounterparties +":ECB2_MRKT_VL\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val ntnl_amnt = loansCounterpartiesAndRatingsDef.getntnl_amnt(row)
		 
		
		 val ntnl_amntText =	"<derivedCells cellID=\"" + rowID + ":NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"" + ntnl_amnt + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDaggregateLoansAndCounterparties +":NTNL_AMNT\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val ecb2_entity_lei = loansCounterpartiesAndRatingsDef.getecb2_entity_lei(row)
		 
		
		 val ecb2_entity_leiText =	"<derivedCells cellID=\"" + rowID + ":ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"" + ecb2_entity_lei + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDaggregateLoansAndCounterparties +":ECB2_ENTITY_LEI\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val cntry = loansCounterpartiesAndRatingsDef.getcntry(row)
		 
		
		 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDaggregateLoansAndCounterparties +":CNTRY\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val crdt_rtng_agncy = loansCounterpartiesAndRatingsDef.getcrdt_rtng_agncy(row)
		 
		
		 val crdt_rtng_agncyText =	"<derivedCells cellID=\"" + rowID + ":CRDT_RTNG_AGNCY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CRDT_RTNG_AGNCY\" value=\"" + crdt_rtng_agncy + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDrating +":CRDT_RTNG_AGNCY\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val rtng_scl_cd = loansCounterpartiesAndRatingsDef.getrtng_scl_cd(row)
		 
		
		 val rtng_scl_cdText =	"<derivedCells cellID=\"" + rowID + ":RTNG_SCL_CD\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#RTNG_SCL_CD\" value=\"" + rtng_scl_cd + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDrating +":RTNG_SCL_CD\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	
	   ecb2_mrkt_vlText+ntnl_amntText+ecb2_entity_leiText+cntryText+crdt_rtng_agncyText+rtng_scl_cdText
	   
	} 
	
	
	
	
	def  stringForenrichedExposuresTable(table_enrichedExposures: RTableenrichedExposures ) :String = 
	{
	   
	  
	   "<dataTraceableByCell name=\"enrichedExposures\" cubeLogic=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#enrichedExposures\" sourceCubeData=\"#loansCounterpartiesAndRatings\" cube=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/efbt_cubes.cubes#enrichedExposures\"> \n" +
	   stringForenrichedExposuresTable2(enrichedExposuresDef.getRRowsenrichedExposures(table_enrichedExposures)) +   
	   "</dataTraceableByCell>\n "
	     
	}
	
	
	def  stringForenrichedExposuresTable2(rows :  List[RRowenrichedExposures] ) :String    = rows match
	{
	    
	   case tail :+  head  => 
	     stringForenrichedExposuresRow(head) + 
	     stringForenrichedExposuresTable2(tail) 
	   case List() => ""  
	} 
	
	
	def stringForenrichedExposuresRow(row : RRowenrichedExposures) :String = 
	{
	   val rowID = enrichedExposuresDef.getconciseid(row)
	  
	   val sourcerowloansCounterpartiesAndRatings = row.loansCounterpartiesAndRatings
	   val sourcerowIDloansCounterpartiesAndRatings =loansCounterpartiesAndRatingsDef.getconciseid(sourcerowloansCounterpartiesAndRatings)
	   		  		    "<rows rowID=\"" +rowID + "\" sourceRows=\"" +  "#" + sourcerowIDloansCounterpartiesAndRatings+"\">\n" +
	   		  		stringForRowenrichedExposures(row)  + 
	   		  		"</rows>\n" 
	   
			  
	  
	}
	
	 
	 
	 
	def getParamsForSourceRowsOfenrichedExposures(loansCounterpartiesAndRatingsRows :List[RRowloansCounterpartiesAndRatings], col :String) :String = loansCounterpartiesAndRatingsRows match {
	  case  tail :+ head => getParamsForSourceRowsOfenrichedExposures(tail,col) +   getParamForSourceRowOfenrichedExposures(head,col) 
	       case List() => "" 
	}
	
	def getParamForSourceRowOfenrichedExposures(loansCounterpartiesAndRatingsRow :RRowloansCounterpartiesAndRatings, col :String) :String = {
	  
	  val rowId = loansCounterpartiesAndRatingsDef.getconciseid(loansCounterpartiesAndRatingsRow)
	  "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + rowId +":" +col+ "\"/>\n"
	}
	
	
	
	def stringForGroupRowenrichedExposures(row : RRowenrichedExposures) :String     =  { 
				
						 
				val rowID = enrichedExposuresDef.getconciseid(row)
				 
				 
			  
			  val tripplea_notionaamount = enrichedExposuresDef.gettripplea_notionaamount(row)
			  
				
				 val tripplea_notionaamountText =	"<derivedCells cellID=\"" + rowID + ":trippleA_NotionaAmount\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#trippleA_NotionaAmount\" value=\"" + tripplea_notionaamount + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val ecb2_mrkt_vl = enrichedExposuresDef.getecb2_mrkt_vl(row)
			  
				
				 val ecb2_mrkt_vlText =	"<derivedCells cellID=\"" + rowID + ":ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"" + ecb2_mrkt_vl + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val ntnl_amnt = enrichedExposuresDef.getntnl_amnt(row)
			  
				
				 val ntnl_amntText =	"<derivedCells cellID=\"" + rowID + ":NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"" + ntnl_amnt + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val ecb2_entity_lei = enrichedExposuresDef.getecb2_entity_lei(row)
			  
				
				 val ecb2_entity_leiText =	"<derivedCells cellID=\"" + rowID + ":ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"" + ecb2_entity_lei + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val cntry = enrichedExposuresDef.getcntry(row)
			  
				
				 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val crdt_rtng_agncy = enrichedExposuresDef.getcrdt_rtng_agncy(row)
			  
				
				 val crdt_rtng_agncyText =	"<derivedCells cellID=\"" + rowID + ":CRDT_RTNG_AGNCY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CRDT_RTNG_AGNCY\" value=\"" + crdt_rtng_agncy + "\">\n" +
	      "   </derivedCells>\n"
			  
			  val rtng_scl_cd = enrichedExposuresDef.getrtng_scl_cd(row)
			  
				
				 val rtng_scl_cdText =	"<derivedCells cellID=\"" + rowID + ":RTNG_SCL_CD\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#RTNG_SCL_CD\" value=\"" + rtng_scl_cd + "\">\n" +
	      "   </derivedCells>\n"
			
			   tripplea_notionaamountText+ecb2_mrkt_vlText+ntnl_amntText+ecb2_entity_leiText+cntryText+crdt_rtng_agncyText+rtng_scl_cdText
		   
			} 
	
	def stringForRowenrichedExposures(row : RRowenrichedExposures) :String     =  { 
		
				 
		val rowID = enrichedExposuresDef.getconciseid(row)
		 
val sourcerowloansCounterpartiesAndRatings = row.loansCounterpartiesAndRatings
val sourcerowIDloansCounterpartiesAndRatings =loansCounterpartiesAndRatingsDef.getconciseid(sourcerowloansCounterpartiesAndRatings)
	  val tripplea_notionaamount = enrichedExposuresDef.gettripplea_notionaamount(row)
		 
		
		 val tripplea_notionaamountText =	"<derivedCells cellID=\"" + rowID + ":trippleA_NotionaAmount\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#trippleA_NotionaAmount\" value=\"" + tripplea_notionaamount + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/commonFunctions.functions#trippleA_NotionaAmount\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDloansCounterpartiesAndRatings +":RTNG_SCL_CD\"/>\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDloansCounterpartiesAndRatings +":NTNL_AMNT\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val ecb2_mrkt_vl = enrichedExposuresDef.getecb2_mrkt_vl(row)
		 
		
		 val ecb2_mrkt_vlText =	"<derivedCells cellID=\"" + rowID + ":ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"" + ecb2_mrkt_vl + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDloansCounterpartiesAndRatings +":ECB2_MRKT_VL\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val ntnl_amnt = enrichedExposuresDef.getntnl_amnt(row)
		 
		
		 val ntnl_amntText =	"<derivedCells cellID=\"" + rowID + ":NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"" + ntnl_amnt + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDloansCounterpartiesAndRatings +":NTNL_AMNT\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val ecb2_entity_lei = enrichedExposuresDef.getecb2_entity_lei(row)
		 
		
		 val ecb2_entity_leiText =	"<derivedCells cellID=\"" + rowID + ":ECB2_ENTITY_LEI\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_ENTITY_LEI\" value=\"" + ecb2_entity_lei + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDloansCounterpartiesAndRatings +":ECB2_ENTITY_LEI\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val cntry = enrichedExposuresDef.getcntry(row)
		 
		
		 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDloansCounterpartiesAndRatings +":CNTRY\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val crdt_rtng_agncy = enrichedExposuresDef.getcrdt_rtng_agncy(row)
		 
		
		 val crdt_rtng_agncyText =	"<derivedCells cellID=\"" + rowID + ":CRDT_RTNG_AGNCY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CRDT_RTNG_AGNCY\" value=\"" + crdt_rtng_agncy + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDloansCounterpartiesAndRatings +":CRDT_RTNG_AGNCY\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	  val rtng_scl_cd = enrichedExposuresDef.getrtng_scl_cd(row)
		 
		
		 val rtng_scl_cdText =	"<derivedCells cellID=\"" + rowID + ":RTNG_SCL_CD\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#RTNG_SCL_CD\" value=\"" + rtng_scl_cd + "\">\n" +
		    "   <function xsi:type=\"functions:BasicFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#CopyColumn\">\n" + 
		    "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + sourcerowIDloansCounterpartiesAndRatings +":RTNG_SCL_CD\"/>\n" + 
		        "   </function>\n" +  
		     "   </derivedCells>\n"
	
	   tripplea_notionaamountText+ecb2_mrkt_vlText+ntnl_amntText+ecb2_entity_leiText+cntryText+crdt_rtng_agncyText+rtng_scl_cdText
	   
	} 
	
	
	
	
	def  stringFortotalJPMktValueTable(table_totalJPMktValue: RTabletotalJPMktValue ) :String = 
	{
	   
	  
	   "<dataTraceableByCell name=\"totalJPMktValue\" cubeLogic=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#totalJPMktValue_view\" sourceCubeData=\"#enrichedExposures\" cube=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/efbt_cubes.cubes#totalJPMktValue\"> \n" +
	   stringFortotalJPMktValueTable2(totalJPMktValueDef.getRRowstotalJPMktValue(table_totalJPMktValue)) +   
	   "</dataTraceableByCell>\n "
	     
	}
	
	
	def  stringFortotalJPMktValueTable2(rows :  List[RRowtotalJPMktValue] ) :String    = rows match
	{
	    
	   case tail :+  head  => 
	     stringFortotalJPMktValueRow(head) + 
	     stringFortotalJPMktValueTable2(tail) 
	   case List() => ""  
	} 
	
	
	def stringFortotalJPMktValueRow(row : RRowtotalJPMktValue) :String = 
	{
	   val rowID = totalJPMktValueDef.getconciseid(row)
	  

				    "<rows rowID=\"" +rowID + "\" sourceRows=\"" + getListOfIdsforSourceRowsOftotalJPMktValue(row) + "\">\n" +		  		  
 		stringForGroupRowtotalJPMktValue(row)  + 
 		"</rows>\n" 
 
	  
	}
	
		  
def  getListOfIdsforSourceRowsOftotalJPMktValue(row : RRowtotalJPMktValue ) :String =
{
	 getListOfIdsforSourceRowsOftotalJPMktValue2(row.enrichedExposures)
	
}
def  getListOfIdsforSourceRowsOftotalJPMktValue2(rows: List[RRowenrichedExposures] ) :String =  rows match
		{
			  case  List() :+ head=>  "#" +enrichedExposuresDef.getconciseid(head)
			  case  tail :+ head =>   "#" +enrichedExposuresDef.getconciseid(head) +" " + getListOfIdsforSourceRowsOftotalJPMktValue2(tail) 
			 		       case List() => "" 
			
		}
def getParamsForTheSourceRowsOftotalJPMktValue(totalJPMktValueRow :RRowtotalJPMktValue, col :String) :String =  {

   getParamsForSourceRowsOftotalJPMktValue(totalJPMktValueRow.enrichedExposures, col)
}
	 
	 
	 
	def getParamsForSourceRowsOftotalJPMktValue(enrichedExposuresRows :List[RRowenrichedExposures], col :String) :String = enrichedExposuresRows match {
	  case  tail :+ head => getParamsForSourceRowsOftotalJPMktValue(tail,col) +   getParamForSourceRowOftotalJPMktValue(head,col) 
	       case List() => "" 
	}
	
	def getParamForSourceRowOftotalJPMktValue(enrichedExposuresRow :RRowenrichedExposures, col :String) :String = {
	  
	  val rowId = enrichedExposuresDef.getconciseid(enrichedExposuresRow)
	  "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + rowId +":" +col+ "\"/>\n"
	}
	
	
	
	def stringForGroupRowtotalJPMktValue(row : RRowtotalJPMktValue) :String     =  { 
				
						 
				val rowID = totalJPMktValueDef.getconciseid(row)
				 
				 
			  
			  val ecb2_mrkt_vl = totalJPMktValueDef.getecb2_mrkt_vl(row)
			  
				
				 val ecb2_mrkt_vlText =	"<derivedCells cellID=\"" + rowID + ":ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"" + ecb2_mrkt_vl + "\">\n" +
				    "   <function xsi:type=\"functions:AggregateFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#SUM\">\n" + getParamsForTheSourceRowsOftotalJPMktValue(row,"ECB2_MRKT_VL") +    "   </function>\n" +  
	      "   </derivedCells>\n"
			  
			  val cntry = totalJPMktValueDef.getcntry(row)
			  
				
				 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
				    "   <function xsi:type=\"functions:AggregateFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#First\">\n" + getParamsForTheSourceRowsOftotalJPMktValue(row,"CNTRY") +    "   </function>\n" +  
	      "   </derivedCells>\n"
			
			   ecb2_mrkt_vlText+cntryText
		   
			} 
	
	def stringForRowtotalJPMktValue(row : RRowtotalJPMktValue) :String     =  { 
		
				 
		val rowID = totalJPMktValueDef.getconciseid(row)
		 
	  val ecb2_mrkt_vl = totalJPMktValueDef.getecb2_mrkt_vl(row)
		 
		
		 val ecb2_mrkt_vlText =	"<derivedCells cellID=\"" + rowID + ":ECB2_MRKT_VL\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#ECB2_MRKT_VL\" value=\"" + ecb2_mrkt_vl + "\">\n" +
		     "   </derivedCells>\n"
	  val cntry = totalJPMktValueDef.getcntry(row)
		 
		
		 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
		     "   </derivedCells>\n"
	
	   ecb2_mrkt_vlText+cntryText
	   
	} 
	
	
	
	
	def  stringFortotalUSNotionalTable(table_totalUSNotional: RTabletotalUSNotional ) :String = 
	{
	   
	  
	   "<dataTraceableByCell name=\"totalUSNotional\" cubeLogic=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#totalUSNotional_view\" sourceCubeData=\"#enrichedExposures\" cube=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/efbt_cubes.cubes#totalUSNotional\"> \n" +
	   stringFortotalUSNotionalTable2(totalUSNotionalDef.getRRowstotalUSNotional(table_totalUSNotional)) +   
	   "</dataTraceableByCell>\n "
	     
	}
	
	
	def  stringFortotalUSNotionalTable2(rows :  List[RRowtotalUSNotional] ) :String    = rows match
	{
	    
	   case tail :+  head  => 
	     stringFortotalUSNotionalRow(head) + 
	     stringFortotalUSNotionalTable2(tail) 
	   case List() => ""  
	} 
	
	
	def stringFortotalUSNotionalRow(row : RRowtotalUSNotional) :String = 
	{
	   val rowID = totalUSNotionalDef.getconciseid(row)
	  

				    "<rows rowID=\"" +rowID + "\" sourceRows=\"" + getListOfIdsforSourceRowsOftotalUSNotional(row) + "\">\n" +		  		  
 		stringForGroupRowtotalUSNotional(row)  + 
 		"</rows>\n" 
 
	  
	}
	
		  
def  getListOfIdsforSourceRowsOftotalUSNotional(row : RRowtotalUSNotional ) :String =
{
	 getListOfIdsforSourceRowsOftotalUSNotional2(row.enrichedExposures)
	
}
def  getListOfIdsforSourceRowsOftotalUSNotional2(rows: List[RRowenrichedExposures] ) :String =  rows match
		{
			  case  List() :+ head=>  "#" +enrichedExposuresDef.getconciseid(head)
			  case  tail :+ head =>   "#" +enrichedExposuresDef.getconciseid(head) +" " + getListOfIdsforSourceRowsOftotalUSNotional2(tail) 
			 		       case List() => "" 
			
		}
def getParamsForTheSourceRowsOftotalUSNotional(totalUSNotionalRow :RRowtotalUSNotional, col :String) :String =  {

   getParamsForSourceRowsOftotalUSNotional(totalUSNotionalRow.enrichedExposures, col)
}
	 
	 
	 
	def getParamsForSourceRowsOftotalUSNotional(enrichedExposuresRows :List[RRowenrichedExposures], col :String) :String = enrichedExposuresRows match {
	  case  tail :+ head => getParamsForSourceRowsOftotalUSNotional(tail,col) +   getParamForSourceRowOftotalUSNotional(head,col) 
	       case List() => "" 
	}
	
	def getParamForSourceRowOftotalUSNotional(enrichedExposuresRow :RRowenrichedExposures, col :String) :String = {
	  
	  val rowId = enrichedExposuresDef.getconciseid(enrichedExposuresRow)
	  "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + rowId +":" +col+ "\"/>\n"
	}
	
	
	
	def stringForGroupRowtotalUSNotional(row : RRowtotalUSNotional) :String     =  { 
				
						 
				val rowID = totalUSNotionalDef.getconciseid(row)
				 
				 
			  
			  val ntnl_amnt = totalUSNotionalDef.getntnl_amnt(row)
			  
				
				 val ntnl_amntText =	"<derivedCells cellID=\"" + rowID + ":NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"" + ntnl_amnt + "\">\n" +
				    "   <function xsi:type=\"functions:AggregateFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#SUM\">\n" + getParamsForTheSourceRowsOftotalUSNotional(row,"NTNL_AMNT") +    "   </function>\n" +  
	      "   </derivedCells>\n"
			  
			  val cntry = totalUSNotionalDef.getcntry(row)
			  
				
				 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
				    "   <function xsi:type=\"functions:AggregateFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#First\">\n" + getParamsForTheSourceRowsOftotalUSNotional(row,"CNTRY") +    "   </function>\n" +  
	      "   </derivedCells>\n"
			
			   ntnl_amntText+cntryText
		   
			} 
	
	def stringForRowtotalUSNotional(row : RRowtotalUSNotional) :String     =  { 
		
				 
		val rowID = totalUSNotionalDef.getconciseid(row)
		 
	  val ntnl_amnt = totalUSNotionalDef.getntnl_amnt(row)
		 
		
		 val ntnl_amntText =	"<derivedCells cellID=\"" + rowID + ":NTNL_AMNT\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#NTNL_AMNT\" value=\"" + ntnl_amnt + "\">\n" +
		     "   </derivedCells>\n"
	  val cntry = totalUSNotionalDef.getcntry(row)
		 
		
		 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
		     "   </derivedCells>\n"
	
	   ntnl_amntText+cntryText
	   
	} 
	
	
	
	
	def  stringFornotionalOfUS_AAATable(table_notionalOfUS_AAA: RTablenotionalOfUS_AAA ) :String = 
	{
	   
	  
	   "<dataTraceableByCell name=\"notionalOfUS_AAA\" cubeLogic=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#notionalOfUS_AAA_view\" sourceCubeData=\"#enrichedExposures\" cube=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/extra/efbt_cubes.cubes#notionalOfUS_AAA\"> \n" +
	   stringFornotionalOfUS_AAATable2(notionalOfUS_AAADef.getRRowsnotionalOfUS_AAA(table_notionalOfUS_AAA)) +   
	   "</dataTraceableByCell>\n "
	     
	}
	
	
	def  stringFornotionalOfUS_AAATable2(rows :  List[RRownotionalOfUS_AAA] ) :String    = rows match
	{
	    
	   case tail :+  head  => 
	     stringFornotionalOfUS_AAARow(head) + 
	     stringFornotionalOfUS_AAATable2(tail) 
	   case List() => ""  
	} 
	
	
	def stringFornotionalOfUS_AAARow(row : RRownotionalOfUS_AAA) :String = 
	{
	   val rowID = notionalOfUS_AAADef.getconciseid(row)
	  

				    "<rows rowID=\"" +rowID + "\" sourceRows=\"" + getListOfIdsforSourceRowsOfnotionalOfUS_AAA(row) + "\">\n" +		  		  
 		stringForGroupRownotionalOfUS_AAA(row)  + 
 		"</rows>\n" 
 
	  
	}
	
		  
def  getListOfIdsforSourceRowsOfnotionalOfUS_AAA(row : RRownotionalOfUS_AAA ) :String =
{
	 getListOfIdsforSourceRowsOfnotionalOfUS_AAA2(row.enrichedExposures)
	
}
def  getListOfIdsforSourceRowsOfnotionalOfUS_AAA2(rows: List[RRowenrichedExposures] ) :String =  rows match
		{
			  case  List() :+ head=>  "#" +enrichedExposuresDef.getconciseid(head)
			  case  tail :+ head =>   "#" +enrichedExposuresDef.getconciseid(head) +" " + getListOfIdsforSourceRowsOfnotionalOfUS_AAA2(tail) 
			 		       case List() => "" 
			
		}
def getParamsForTheSourceRowsOfnotionalOfUS_AAA(notionalOfUS_AAARow :RRownotionalOfUS_AAA, col :String) :String =  {

   getParamsForSourceRowsOfnotionalOfUS_AAA(notionalOfUS_AAARow.enrichedExposures, col)
}
	 
	 
	 
	def getParamsForSourceRowsOfnotionalOfUS_AAA(enrichedExposuresRows :List[RRowenrichedExposures], col :String) :String = enrichedExposuresRows match {
	  case  tail :+ head => getParamsForSourceRowsOfnotionalOfUS_AAA(tail,col) +   getParamForSourceRowOfnotionalOfUS_AAA(head,col) 
	       case List() => "" 
	}
	
	def getParamForSourceRowOfnotionalOfUS_AAA(enrichedExposuresRow :RRowenrichedExposures, col :String) :String = {
	  
	  val rowId = enrichedExposuresDef.getconciseid(enrichedExposuresRow)
	  "     <parameters xsi:type=\"functions:CellsParameter\" cells=\"#" + rowId +":" +col+ "\"/>\n"
	}
	
	
	
	def stringForGroupRownotionalOfUS_AAA(row : RRownotionalOfUS_AAA) :String     =  { 
				
						 
				val rowID = notionalOfUS_AAADef.getconciseid(row)
				 
				 
			  
			  val tripplea_notionaamount = notionalOfUS_AAADef.gettripplea_notionaamount(row)
			  
				
				 val tripplea_notionaamountText =	"<derivedCells cellID=\"" + rowID + ":trippleA_NotionaAmount\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#trippleA_NotionaAmount\" value=\"" + tripplea_notionaamount + "\">\n" +
				    "   <function xsi:type=\"functions:AggregateFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#SUM\">\n" + getParamsForTheSourceRowsOfnotionalOfUS_AAA(row,"trippleA_NotionaAmount") +    "   </function>\n" +  
	      "   </derivedCells>\n"
			  
			  val cntry = notionalOfUS_AAADef.getcntry(row)
			  
				
				 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
				    "   <function xsi:type=\"functions:AggregateFunction\" functionSpec=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/platform_calls/getAttributeLineage1.platform_call#First\">\n" + getParamsForTheSourceRowsOfnotionalOfUS_AAA(row,"CNTRY") +    "   </function>\n" +  
	      "   </derivedCells>\n"
			
			   tripplea_notionaamountText+cntryText
		   
			} 
	
	def stringForRownotionalOfUS_AAA(row : RRownotionalOfUS_AAA) :String     =  { 
		
				 
		val rowID = notionalOfUS_AAADef.getconciseid(row)
		 
	  val tripplea_notionaamount = notionalOfUS_AAADef.gettripplea_notionaamount(row)
		 
		
		 val tripplea_notionaamountText =	"<derivedCells cellID=\"" + rowID + ":trippleA_NotionaAmount\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#trippleA_NotionaAmount\" value=\"" + tripplea_notionaamount + "\">\n" +
		     "   </derivedCells>\n"
	  val cntry = notionalOfUS_AAADef.getcntry(row)
		 
		
		 val cntryText =	"<derivedCells cellID=\"" + rowID + ":CNTRY\" column=\"file:/C:/freebirdtools-develop/git/efbt/bundles/org.eclipse.efbt.regmodules.example/example/bird_import/variables.efbt_data_definition#CNTRY\" value=\"" + cntry + "\">\n" +
		     "   </derivedCells>\n"
	
	   tripplea_notionaamountText+cntryText
	   
	} 
	
	
			
			def stringForEndOfXML() : String = {			
			  "</data_lineage:DataLineageModel>\n"
			}
	
	}
