class parent{  
void func(){
System.out.println("This is Parent Class");
}  
}  
class child extends parent{  
void func(){
System.out.println("This is Child Class");
} 
void display(){ 
super.func();   
}  
}  
class call{  
public static void main(String args[]){  
child n=new child();  
n.display();  
}
}