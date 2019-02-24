public class CountNames {
	public static void main( String args[] ) {
        
        String[] names = {"Tommy Lee Jones", "William Hurt", "Nicole Kidman",
            "Catherine Zeta-Jones", "JAMES EARL JONES", "Tom Hardy", 
            "Judi Dench", "Sean Bean", "Carey Mulligan", "Toby Jones" };
        
        int jones = 0;

        for (String each : names) {
            each = each.toLowerCase();
            if (each.endsWith("jones")){
                jones += 1;
            }
        }

        System.err.println("Jones: " + jones);
        

	}
}

