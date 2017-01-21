

public class LabCalculator{
	
	public static void main(String args[]){

		if(args[0].equalsIgnoreCase("add")){
			 System.out.println(Double.parseDouble(args[1])+Double.parseDouble(args[2]));
		}

		if(args[0].equalsIgnoreCase("subtract")){
			 System.out.println(Double.parseDouble(args[1])-Double.parseDouble(args[2]));
		}

		if(args[0].equalsIgnoreCase("multiply")){
			 System.out.println(Double.parseDouble(args[1])*Double.parseDouble(args[2]));
		}

		if(args[0].equalsIgnoreCase("divide")){
			 System.out.println(Double.parseDouble(args[1])/Double.parseDouble(args[2]));
		}



		

	}

	
}