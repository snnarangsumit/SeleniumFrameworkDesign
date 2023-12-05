package JavaCodes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class hashMapexample {

public static void main(String[] args) { // TODO Auto-generated method stub

HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(0, "hello"); 
hm.put(1, "Gudbye"); 
hm.put(42, "morning"); 
hm.put(3, "evening"); 
System.out.println(hm.get(42)); 
hm.remove(42);
System.out.println(hm.get(42));
Set sn= hm.entrySet(); 
Iterator it =sn.iterator();

//hashtable -pass table set collections 

while(it.hasNext())
{ 
	System.out.println(it.next());
	Map.Entry mp=(Map.Entry)it.next();
	// System.out.println(mp.getKey());
	System.out.println(mp.getValue()); 
}

//HashSet
// HashSet treeset, LinkedHashset implements Set interface 
//does not accept duplicate values  
// There is no guarantee elements stored in sequential order..Random order

HashSet<String> hs= new HashSet<String>(); 
hs.add("USA");
hs.add("UK"); 
hs.add("INDIA"); 
hs.add("he"); 
hs.add("she");
hs.add("INDIA"); 

System.out.println(hs); 
System.out.println(hs.remove("UK")); 
System.out.println(hs.isEmpty());
System.out.println(hs.size());

Iterator<String> i=hs.iterator(); 
while(i.hasNext())
{ System.out.println(i.next()); }
}

}



/*
 Synchronization:

HashMap: It is not synchronized, which means it is not thread-safe. Multiple threads can access a HashMap simultaneously, and there is no guarantee of the order in which the threads access and modify the map.
Hashtable: It is synchronized. All its methods are synchronized, making it thread-safe. This ensures that multiple threads cannot access Hashtable simultaneously, preventing data corruption.
Null Values:

HashMap: Allows one null key and any number of null values. This is because it uses null to represent the absence of a key or a value.
Hashtable: Neither keys nor values can be null. If you attempt to insert a null key or value, a NullPointerException will be thrown.
Performance:

HashMap: Generally performs better than Hashtable. Since HashMap is not synchronized, it has less overhead, making it faster in a single-threaded environment.
Hashtable: Due to synchronization, Hashtable has a performance cost, making it slower than HashMap in a single-threaded environment.
Iterating through Elements:

HashMap: The iterator of HashMap is fail-fast. If the map is structurally modified at any time after the iterator is created, in any way, except through the iterator's own remove method, the iterator will throw a ConcurrentModificationException.
Hashtable: The enumerator of Hashtable is not fail-fast. Any changes made to the map after the creation of the enumerator will not be known to the enumerator.
Inheritance:

HashMap: Extends the AbstractMap class and implements the Map interface.
Hashtable: Extends the Dictionary class and implements the Map interface.
In modern Java development, HashMap is often preferred over Hashtable due to its better performance in non-multithreaded scenarios and the flexibility of allowing null values. However, if you require thread safety, Hashtable might be used, or you can use 
 * 
 */

