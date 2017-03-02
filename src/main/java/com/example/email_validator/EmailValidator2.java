package com.example.email_validator;

public class EmailValidator2 {
	void valid(String s){
	    if(hasOnlyOne(s)&&hasAtLeastOne(s)&&startwithsmall(s)==1&&includes(s)==1){
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
	//2 more rules
	int startwithsmall(String s)
	    {
		  char first = s.charAt(0);
		  if (('a' <= first && first <= 'z'))
		  {
		  // first character is a lowercase letter
			return 1;
		  }
		  else
			return 0;
	    }
	int includes(String s)
	    {
		//includes letters coming right after @ symbol
		  if(s.matches("[@][a-z]"))
		  {
			  return 1;
		  }
		  else
			  return 0;
        }

}
