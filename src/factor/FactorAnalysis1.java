package factor;

import com.lobsterman.JavaGrinders.*;

public class FactorAnalysis1 {

    public static void main (String args[]) {
		
        
        
         
		
                String TraceFile = "C:\\Users\\Ecologic\\Documents\\NetBeansProjects\\TheGames\\src\\factor\\Factor2.txt";
                
                
                try {
			DataFileParser myParser = new DataFileParser(TraceFile);
			//DataFileParser myParser = new DataFileParser("DataFiles/Contingency.txt");
			// now construct a VariableOrganizer from the Parser
			VariableOrganizer myOrganizer = new VariableOrganizer(myParser);
			//myOrganizer.asTablePresenter();
			
			NumberVariable x = (NumberVariable)myOrganizer.getVariable(0);
			NumberVariable y = (NumberVariable)myOrganizer.getVariable(1);
			
			y.listRegressionResults(x,5); 		// polynomial regression results
	 
		} catch (Exception e) { e.printStackTrace(); }
	}
}
