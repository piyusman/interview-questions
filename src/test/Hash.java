package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Hash {



  private String name;

  private String book;


  
  @Override
  public boolean equals(Object o){
      if(o==this)
          return true;
      if(!(o instanceof Hash)){
          return false;
      }
      Hash hash = (Hash)o;
      return hash.name.equals(name) && hash.book.equals(book);
      
  }
  
  @Override
  public int hashCode(){
      int result = 17;
      result = 31 * result + name.hashCode();
      result = 31 * result + book.hashCode();
      return result;
  }
  

  public Hash(String name, String book) {

    this.name = name;

    this.book = book;

  }



  public static void main(String[] args) {

    HashMap<Integer, Hash> map = new HashMap<>();
    List<Hash> hashList = new ArrayList<>();
    
    Hash hash1 = new Hash("A", "Abook");

    Hash hash2 = new Hash("B", "Bbook");

    Hash hash3 = new Hash("A", "Abook");
    if(hash1.equals(hash3)){
        System.out.println("Hello true");
    }
    hashList.add(hash1);
    hashList.add(hash2);
    hashList.add(hash3);
    for(Hash h : hashList)
    map.put(1, hash1);

    map.put(2, hash2);

    map.put(3, hash3);

    Set<Entry<Integer, Hash>> set = map.entrySet();

    for (Map.Entry<Integer, Hash> entry : map.entrySet()) {

      System.out.println(entry.getKey());

      System.out.println(entry.getValue().name);

    }
   
    Collections.sort(hashList, new Comparator<Hash>(){

        @Override
        public int compare(Hash o1, Hash o2) {
            return o1.name.compareTo(o2.name);
        }
        
    });
    for(Hash h : hashList){
        System.out.println(h.name);
    }
  }
}