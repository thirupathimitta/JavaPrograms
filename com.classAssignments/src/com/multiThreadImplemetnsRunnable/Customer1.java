package com.multiThreadImplemetnsRunnable;

 class Customer1 extends Thread {
	 
	  	
	 Banking b;
	 
	 	@Override
	public void run() {
	 		
	 		try {
				b.withdraw(8000.00f);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
    	}

		Customer1(Banking b){
	 		 this.b=b;
	 		
	 	}
}

