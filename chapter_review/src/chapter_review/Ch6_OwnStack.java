package chapter_review;

public class Ch6_OwnStack {
	int stack[];
	int tos;
	
	Ch6_OwnStack(int number){
		this.stack = new int[number];
		this.tos = -1;
	}
	
	//push to put pop to take
	
	void push(int item) {
		if( tos == stack.length - 1) {
			System.out.println("Stack if full!");
		} else {
			stack[++tos] = item;
		}
	}
	
	int pop() {
		if( tos < 0 ) {
			System.out.println("Stack underflow!");
			return 0;
		} else {
			return stack[tos--];
		}
	}
}

