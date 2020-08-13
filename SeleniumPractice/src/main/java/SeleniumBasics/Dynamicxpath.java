package SeleniumBasics;

public class Dynamicxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Absolute and Relative xpaths 
		 *  xpath = //htmltag[@attribute='value of the attribute']
		 *  
		 *  //input[@id='txtUsername'] --- xpath using id
		 *  //input[@name='txtUsername']  --- xpath using name
		 *  
		 *  Always use Relative xpath
		 *  
		 *  //a[contains(text(),'password')] -- to use contains
		 *  
		 *  //input[contains(@id,'Username')] -- for fields without label
		 *  
		 *  //input[@id='btnLogin' or @id='btnSubmit'] --- xpath using 'or'
		 *  
		 *  //input[@id='btnLogin' and @id='btnSubmit'] --- xpath using 'and'
		 *  
		 *  //input[starts-with(@id,'txt')] --- starts -with -- starting elements are the same 
		 *  
		 * //a[text()='linda.anderson']//parent::td//parent::tr//child::td[1] --- use of parent and child
		 * //a[text()='nitin']//ancestor::tr --- use of ancestor
		 * //a[text()='nitin']//ancestor::tr//child::td[1] -- use of ancestor and child
		 *  Parent returns immediate parent and ancestor will return the entire hierarchy
		  
		 */
		
		
		/* HW - forward sibling and preceding sibling
		 * following-sibling 
		 * 
		 * //td[text()='Linda Anderson']//parent::tr[1]//child::td//following-sibling::td
		 * 
		 * preceding-sibling
		 * 
		 * 
		 * child
		 * 
		 */
		
		
		

	}

}
