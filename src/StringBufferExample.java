
public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("abcdefgh");
		System.out.println(sb);
		//sb.replace(1, 5, "XYZ");	//range from 1-4 will be replaced by XYZ
		//sb.insert(0, "XYZ");
		//sb.append("XYZ");
		//sb.setLength(12);
		//sb.setCharAt(2, 'Z');	//setting a new char 'Z' on index 2 (replace 'c')
		//sb.deleteCharAt(4);		//delete the char on index 4
		//sb.delete(1, 5);		//delete 1,2,3,4
		sb.reverse();
		System.out.println(sb);
		
	}

}
/*	
 
 	append		:	adds the contents at the end of an existing object
 	insert		:	adds the contents on the given index
 	replace		:	replaces a range with new contents
 	setLength	:	can adjust the length of String buffer (increase/decrease)
 	setCharAt	:	set a particular char on desired index
 	deleteCharAt: 	delete a char from given index
 	delete		:	deletes a range
 	reverse		:	reverse the order of chars.
 	toString	:	use to convert StringBuffer to String object.
 	
 

*/