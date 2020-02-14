package assignment;

import java.util.Properties;

public class Propertiesofjava {

	public static void main(String[] args) {
		            Properties prop = System.getProperties();
		            System.out.println ("JVM Vendor : " + prop.getProperty("java.vendor") );
		            System.out.println("JVM Version:"+prop.getProperty("java.version"));
		            System.out.println("JVM Version:"+prop.getProperty("class.path"));
		    }
		
	}


