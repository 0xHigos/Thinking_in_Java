package chapter7;

import chapter7.execrise.E_15;

class Soap{
	private String s;
	 Soap() {
		// TODO Auto-generated constructor stub
		 System.out.println("Soap()");
		 s="Constructed.";
	 }
	 public String toString(){
		 return s;
	 }
}

public class Bath {
	 
	private String 
	 	 	s1="happy",
			s2="happy",
			s3,s4;
	private Soap castille;
	private int i;
	private float toy;
	public Bath(){
		System.out.println("Inside Bath()");
		s3="joy";
		toy=3.14f;
		castille=new Soap();
	}
	@Override
	public String toString() {
		if(s4==null)
			 s4="joy";
		return "Bath [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", s4=" + s4
				+ ", castille=" + castille + ", i=" + i + ", toy=" + toy + "]";
	}
	public static void main(String[] args) {
		Bath b=new Bath();
		System.out.println(b);
		
	}
	
			
}
