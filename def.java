class abc
{  
  abc(){ 
       System.out.println(" Default Contructor");
      }  
  abc(int x){  
this();  
System.out.println(x);  
}  
}
class def{  
    public static void main(String args[]){  
     abc a=new abc(10);  
}
}