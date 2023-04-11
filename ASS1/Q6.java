class Q6 {
  
  public static void main(String[] args){

    boolean b = true;
    
    String str = new String();
    str = Boolean.toString(b);//String str=Boolean.toString(b); 2nd type
    System.out.println("boolean value into String :"+str);

    Boolean b2 = new Boolean(b);
    System.out.println("boolean value into Boolean instance :"+b2);

    String str2 = new String("true");
    boolean b3 = Boolean.parseBoolean(str2);
    System.out.println("String value into boolean value :"+b3);

    b2 = Boolean.valueOf(str2);
    System.out.println("String value into Boolean instance :"+b2);
  
  }  
}


  
