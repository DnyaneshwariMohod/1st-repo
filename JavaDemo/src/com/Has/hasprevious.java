package com.Has;

import java.util.*;


public class hasprevious{

	public static void main(String[] args) {
	 List<String> list = new ArrayList<String>();
  
        
        list.add("hello");
        list.add("ok");
        list.add("bye");
  
        ListIterator<String> itr
            = list.listIterator(list.size());
  
        while (itr.hasPrevious()) 
        {
            
            System.out.println(itr.previous());
        }
  
        
	}
}