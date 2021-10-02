package lecture_37;

public class stack_client {
	public static void main(String[] args) throws Exception {
		stack s= new stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(20);
		s.push(30);
//		s.push(30);
//		s.push(20);
//		s.push(30);
		s.display();
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
		s.display();
//		System.out.println();
		System.out.println("Size of stack is : "+s.size());
//		System.out.println("Top of Stack is : "+s.tos);
	}

}
