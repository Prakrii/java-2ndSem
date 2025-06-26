// 1. Conditional Statements
// if
// if-else
// if-else-if
// switch
// 2. Looping Statements
// for
// while
// do-while
// 3. Jump Statements   
// break
// continue
// return

public class ControlStructure{
    public static void main(String[] args){
       
        int b=5;
        if (b<0){
            System.out.println("b is negetive");
        }
        else{
            System.out.println("b is positive");
        }
int c=4;
if(b==c){
    System.out.println("c and b are equal");
}
    else if(b<c){
        System.out.println("c is greater than b ");
    }
    else{
        System.out.println("b is greater than c ");
    }
String gender="Boy";
switch(gender){
    case "Boy":
    System.out.println("You're gender is a boy");
break;
case "Girl":
System.out.println("You're gender is a girl");
break;
default:    
System.out.println("Unknown gender");
    }

    int a;
    for(a=1;a<5;a++){
        System.out.println(a);
    }
    int d=0;
    while(d<600){
        System.out.println(d);
        d=d+100;

    }
    }


}