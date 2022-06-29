package org.test;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
		
Map<String, String> m=new Hashtable<String ,String>();

m.put("vel", "selenium");
m.put("ganesh", "python");
m.put("dinesh", "corejava");
m.put("subash", "jira");
m.put("vengat","framework");
m.put("anbu", "api testing");


Collection<String> values = m.values();
System.out.println(values);

Set<Entry<String,String>> set = m.entrySet();

for (Entry<String, String> entry : set) {
	System.out.println(entry);
	
}
 Set<String> keySet = m.keySet();
 
 for (String string : keySet) {
	 
	 System.out.println(string);
	
}
	
	
}
}
