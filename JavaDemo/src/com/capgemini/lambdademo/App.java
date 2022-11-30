package com.capgemini.lambdademo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


	class Demo6
	{
		private String name;

		public Demo6(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Data [name=" + name + "]";
		}
		
		}

	public class App {

		public static void main(String[] args) {
			List<Demo6> list=new ArrayList<>();
			list.add(new Demo6("Nayna"));
			list.add(new Demo6("Sanavi"));
			list.add(new Demo6("Aardhya"));
			list.add(new Demo6("Arun"));
			list.add(new Demo6("Sarvashri"));
			list.add(new Demo6("Shreya"));

					
			
			Collections.sort(list,(Demo6 o1,Demo6 o2)->{return o1.getName().compareTo(o2.getName());});
			
			for (Demo6 data:list)
			{
				System.out.println(data.getName());
			}
		}
	}