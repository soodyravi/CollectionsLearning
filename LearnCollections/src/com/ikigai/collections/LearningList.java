package com.ikigai.collections;

import java.util.*;

public class LearningList {

		
		@SuppressWarnings("unchecked")
		public static void main(String[] args){
/*************************************************************************************************************************/
/*                                                                                                                       */
/*                                   Example for a String list                                                           */
/*                                                                                                                       */		                                                                                                                   
/*************************************************************************************************************************/				 
			 		
		// 1. Add String elements one by one
			List<String> l = new ArrayList<String>();
					l.add("Ravi");
					l.add("GowriRavi");
					l.add("PraveenRavi");
					l.add("NaveenRavi");
			System.out.println("-----------------------------------------------------------------------------------------------\n");		
			System.out.println("1.1. The elements in the list are: "+ l);
			
		//2. Add elements to a list at once by creating a separate array first.
			List<String> addAllStringAtOnce = new ArrayList<String>();
					String[] myStr = {"Hasthra", "Mithra", "Samreena"};
					addAllStringAtOnce.addAll(Arrays.asList(myStr));
			System.out.println("1.2 The elements that were added all at once are: " + addAllStringAtOnce);
			
		//3. Add elements to a list at once by creating an separate array first.
			List<String> addAllStringAtOnceInLine = new ArrayList<String>();
					addAllStringAtOnceInLine.addAll(Arrays.asList("Hash Purushoth", "Mia Purushoth"));
			System.out.println("1.3 The elements that were added all at once in line are: " + addAllStringAtOnceInLine);
			System.out.println("-----------------------------------------------------------------------------------------------\n");

/*************************************************************************************************************************/
/*                                             Example for an Integer list                                               */
/*                                                                                                                       */
/*                                                                                                                       */		                                                                                                                   
/*************************************************************************************************************************/				 
	     //1. //Add elements one by one  
		   List<Integer> intList = new ArrayList<Integer>();
	       			intList.add(1);
	       			intList.add(2);
	       			intList.add(3);
	       			intList.add(4);
	       			intList.add(5);
	       System.out.println("2.1 The elements in the integer list are: "+intList);
	       
	     //2. Add elements in one go.
	       List<Integer> addAllAtOnce = new ArrayList<Integer>();
	       			addAllAtOnce.addAll(Arrays.asList(100, 200, 300, 400, 500));
	       System.out.println("2.2 The int Elements that were added all at once are: "+ addAllAtOnce);
	       
	     //3. Add Elements to a list at once by creating a seperate array first.   
	       List<Integer> addAllAtOnceInLine = new ArrayList<Integer>();
	       			Integer[] intArr = new Integer[] {10, 20, 30, 40};
	       			addAllAtOnceInLine.addAll(Arrays.asList(intArr));
	       System.out.println("2.3 The int elemtents that were added by creating an integer array and then added are: " + addAllAtOnceInLine);
	       System.out.println("-----------------------------------------------------------------------------------------------\n");

	       
/*************************************************************************************************************************/
/*                                                                                                                       */
/*                                            Properties of  List                                                        */
/*                                                                                                                       */		                                                                                                                   
/*************************************************************************************************************************/		       
	     //1. List is growable.
	        List<String> listOne = new ArrayList<String>();
	        		listOne.add("one");
	        		listOne.add("two");
	        		listOne.add("three");
	        		listOne.add("four");
	        		listOne.add("five");
	        System.out.println("3.1.a Property 1 - The initial elements in the list are: "+listOne);		
	        System.out.println("3.1.b Property 1 - The initial length of the list is: " +listOne.size());
	        		listOne.add("six");
	        		listOne.add("seven");
	        System.out.println("3.1.c Property 1 - The current elements in the list are: "+listOne);		
	    	System.out.println("3.1.d Property 1 - The current length of the list is: " +listOne.size());
	    	
	    //2. Accepts null value
	    	 List<String> listTwo = new ArrayList<String>();
	    	 		listTwo.add("one");
	    	 		listTwo.add(null);
	    	 		listTwo.add("three");
	    	 		listTwo.add(null);
	    	 		listTwo.add("five");
             System.out.println("3.2   Property 2- accepts null value: "+listTwo);
             
       //3. Accepts Hetergeneous and homogeneous values  
            @SuppressWarnings("rawtypes")
			List listThree = new ArrayList();
             		listThree.add("one");
             		listThree.add(2);
             		listThree.add(10.10);
             		listThree.add("4/3/2018");
            System.out.println("3.3   Property 3- Accepts heterogeneous values: "+ listThree); 	
            
       //4. Preserves order of the elements added
            List<String> listFour = new ArrayList<String>();
            		listFour.add("One");
            		listFour.add("Two");
            		listFour.add("Three");
            		listFour.add("Four");
            		listFour.add("Five");
           	
                    listFour.remove(1);
                    listFour.remove(3);
                    
                    listFour.set(1, "2");
                    listFour.add("six");
                    listFour.set(3, "4");
                    listFour.add("seven");
                    
                    
            System.out.println("3.4   Property 4 - Preserves order of the elements: "+listFour);  
       //5. Allows Duplicates.
            List<String> dupList = new ArrayList<String>();
            		dupList.add("1");
            		dupList.add("2");
            		dupList.add("1");
            System.out.println("3.5.a ArrayList allows duplicate values: "+ dupList);		
            // for adding another list to an existing list.
                    dupList.addAll(3, listOne);
            System.out.println("3.5.b All values in the duplicated arraylist are: "+ dupList);
            System.out.println("-----------------------------------------------------------------------------------------------\n");

                    
                    
/*************************************************************************************************************************/
/*                                                                                                                       */
/*                                            Common Methods used in  List                                               */
/*                                                                                                                       */		                                                                                                                   
/*************************************************************************************************************************/		                 
            List<String> methodList 		= new ArrayList<String>();
            List<String> methodListTwo 		= new ArrayList<String>();
          
        //1. Add element to an object
            		methodList.add("I am Soody");
            		methodList.add("I have 2 brothers");
            		methodList.add("I have 2 Kids");
            System.out.println("4.1.a Added list elements using add() method: \n"+ methodList );		
            		methodListTwo.add("My brothers are Praveen and Naveen");
            		methodListTwo.add("My daughters are Hasthra and Mithra");
            		methodListTwo.add("I am Soody");
            System.out.println("\n4.1.b My second list for add() Method: \n " + methodListTwo);		
        
            
        //2. Add All elements from one collection to another.
            		methodList.addAll(methodListTwo);
            System.out.println("\n4.2 Added 2 collections using addAll() method: \n "+ methodList);		
        
            
        //3. Get the element from an index from a collection
            String elmntAtThree = methodList.get(3);
            System.out.println("\n4.3 The element located in the 3rd index of the collection is: \n "+ elmntAtThree);
        
            
        //4. Get the index of an element/object in a collection
            int index = methodList.indexOf("I am Soody");
            System.out.println("\n4.4 The index of the first occurance of the element -' I am Soody' is: \n "+ index );
        
            
        //5. get the index of an element/object for last occurance in the collection
            int lastIndex = methodList.lastIndexOf("I am Soody");
            System.out.println("\n4.5 The last index of the occurance of the element - 'I am Soody' is: \n " + lastIndex);
        
            
        //6. Remove an element from the list.
            		methodList.remove(5);
            System.out.println("\n4.6 Removing the second - 'I am Soody' element from the collection: \n " + methodList);
        
            
        //7. Set an element at a specified index.
            		methodList.set(0, "My name is Soody");
            System.out.println("\n4.7 Replacing 'I am Soody' with 'My name is Soody' : \n " + methodList);
       
            
        //8. Insert an element into an existing Arraylist
            methodList.add(1, "Ravi and Gowri are my Parents");
            methodList.add(2, "Samreena is my SIL");
            System.out.println("\n4.8 Inserting 'Ravi and Gowri are my Parents' in index 1:\n "+ methodList);
            System.out.println("-----------------------------------------------------------------------------------------------\n");

           
            
            
            
            
            
	    	
	       
	       
	       
	       
	  
	       
	       
			
			
		}

		
		
		
		
	}



