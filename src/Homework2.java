import java.util.*;
class Homework2{
	public static void main(String[] args) {
		
		String text;
		char sp[];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Text : ");
		text=scan.nextLine();

		sp=new char[text.length()];

		for(int i=0;i<text.length();i++){
			
			sp[i]=text.charAt(i);

			if(sp[i]=='R'){
				sp[i]='E';
				if(sp[i]=='E'){
					sp[i]='W';
				}
			}
			else if(sp[i]=='W'){
				sp[i]='R';
				if(sp[i]=='R'){
					sp[i]='E';
				}
			}
			else if(sp[i]=='E'){
				sp[i]='W';
				if(sp[i]=='W'){
					sp[i]='R';
				}
			}

		}
		System.out.println();
		for (int i = sp.length-1; i >= 0 ; i--){
			System.out.print(sp[i]);
		}
	}
}
