
// Outcome of the below program

		class J_S4A2{
			
			private void method1(){
			 System.out.println ("Parent's method1()");
			}
			
			public void method2() {
			 System.out.println ("Parent's method2()");
			method1();
			}
			}
		
			 class Child extends J_S4A2 {
			 public void method1() {
			 System.out.println ("Child's method1()");
			} 
			
			public static void main(String[] args) {  //corrected from (String args[])  
				J_S4A2 p = new Child();
			p.method2();
			}}

	/* Output will be as follows subject to the above changes done:
			 C. Prints : Parent's method2()
			 Parent's method1()
			 
	*/
			 
	// Thank You

