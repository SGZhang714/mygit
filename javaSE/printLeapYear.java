//能被四整除，不能被一百整除

//能被一百整除，能被四百整除

public class printLeapYear {



public static void main (String[] args){

int year ;

for(year = 1000;year < 2000;year++){

if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){

System.out.print(year + " ");

}

}

}





}