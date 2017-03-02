package com.example.email_validator;

public class EmailValidator1 {
	void valid(String s){
	    if(hasOnlyOne(s)&&hasAtLeastOne(s)){
			  System.out.println("Valid");
		   }
		else{
			  System.out.println("Not Valid");
		   }
		}
	    //check if the string has only one @ and at least one .
	boolean hasOnlyOne(String s) 
		{
	      char ch='@';
		  int p1 = s.indexOf(ch);
		  if (p1 < 0)
		    return false;
		  int p2 = s.lastIndexOf(ch);
		  return p2 == p1;
		}
	boolean hasAtLeastOne(String s) 
		{
	      char ch='.';
		  int p1 = s.indexOf(ch);
		  if (p1 < 0)
		    return false;
		  int p2 = s.lastIndexOf(ch);
		  return p2 != p1;
		}

}
