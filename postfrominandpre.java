
public class postfrominandpre {

	/**
	 * @param args
	 */
	  static int preIndex = 0;
	void printPost(int[] in, int[] pre, int inStrt, int inEnd) 
    { 
        if (inStrt > inEnd)  
            return;         
  
    
        int inIndex = search(in, inStrt, inEnd, pre[preIndex++]); 
  
        // traverse left tree 
        printPost(in, pre, inStrt, inIndex - 1); 
  
        // traverse right tree 
        printPost(in, pre, inIndex + 1, inEnd); 
  
        // print root node at the end of traversal 
        System.out.print(in[inIndex] + " "); 
    } 
  
    int search(int[] in, int startIn, int endIn, int data) 
    { 
        int i = 0; 
        for (i = startIn; i < endIn; i++)  
            if (in[i] == data)  
                return i;             
        return i; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub


        int in[] = { 4, 2, 5, 1, 3, 6 }; 
        int pre[] = { 1, 2, 4, 5, 3, 6 }; 
        int len = in.length; 
        postfrominandpre tree = new postfrominandpre(); 
        tree.printPost(in, pre, 0, len - 1);
	}

}
