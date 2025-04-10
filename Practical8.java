class Practical8{
    
    static void star(int ln){
      if(ln>0){
        System.out.print("*");
        star(ln-1);
      }
    }
    
    static void displayPattern1(int ln, int size){
      if(ln<=(size+1)){
        star(ln);
        System.out.println();
        displayPattern1(ln+1, size);
        star(ln-1);
        System.out.println();
      }
    }
    
static void pattern2(int size){
	for(int ln=1; ln<=size; ln++){
		for(int bl=1; bl<=size-ln+1; bl++){
			System.out.print(" ");
		}
		for(int sym=ln; sym>0; sym--){
			System.out.print("*");
		}
		System.out.print("\n");
	}
	for(int ln=size+1; ln<size+2; ln++){
		for(int plus=1; plus<=ln; plus++){
			System.out.print("+");
		}
		System.out.print("\n");
	}
	for(int ln=1; ln<=size; ln++){
		for(int bl=1; bl<=ln; bl++){
			System.out.print(" ");
		}
		for(int slash=1; slash<=size-ln+1; slash++){
			System.out.print("/");
		}
		System.out.print("\n");
	}
}
    
    public static void main (String[] args){
      displayPattern1(1,3);
      pattern2(3);
    }
}



