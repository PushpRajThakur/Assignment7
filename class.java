final class A{  
 void print(){
 System.out.println("A");
}                                       
}            
class B extends A{  
 void print(){
 System.out.println("B");
}                                       
}
class Class {
public static void main(String args[]){  
B obj= new B(); 
obj.print();
}
}