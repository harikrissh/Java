import java.util.Scanner;
class GenerateSeries{

public static void main(String[] args){
Scanner s=new Scanner(System.in);
int range;
range=s.nextInt();
for(int i=1;i<=range;i++){
	if(i%2!=0)
		System.out.print(i+" ");
	else
		System.out.print("-"+i+" ");
}

}

}