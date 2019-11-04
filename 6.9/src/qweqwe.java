import java.util.Arrays;

public class qweqwe {
public static void main(String as []) {
	String appeared []= {"aaa","bbb","ccc","ddd","eee","jjj"};
	String notSelected []= {"aaa","bbb","ddd"};
	int size=(appeared.length)-(notSelected.length);
	String selected[] = new String [size];
	int i=0,j=0;
	for (;i<appeared.length;i++) {
		int flag=1;
		for(int k=0;k<notSelected.length;k++) {
		if (appeared[i].equals(notSelected[k])){
			flag=0;
			break;		
		}
		}
		if (flag==1) {
			selected[j]=appeared[i];			
			j++;
	
		}
	}
	System.out.println("Selected candiadtes are \n"+Arrays.toString(selected));
}
}
