package factorydesignpattern;

public class SelectNtworkFactory {
	

	
		public Cellularplan getPlan(String planType) {
			if (planType==null) {
				return null;
			}
			if(planType.equalsIgnoreCase("abcNetwork")) {
				return new ABCNetwork();
			}
			else if(planType.equalsIgnoreCase("pqrNetwork")) {
				return new PQRNetwork();
			}
			else if(planType.equalsIgnoreCase("xyzNetwork")) {
				return new XYZNetwork();
			}
			return null;
		}

}
	


