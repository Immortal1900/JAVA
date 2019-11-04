import java.util.Arrays;

public class qwertyu {
public static void main(String as []) {
	String allnames[]= {"aaa","aaa","bbbb","ccc","ddd","ccc","aaa","kkk"};
	String noDuplicates[]=new String[allnames.length];
	int i,j,k=0;
	for(i=0;i<allnames.length;i++) {
		boolean flag=true;	
			for(j=0;j<noDuplicates.length;j++) {
			if(allnames[i]==noDuplicates[j]) {
				flag=false;
			}
	}	
			if(flag==true) {
				noDuplicates[k]=allnames[i];
				k++;
			}
}

	System.out.println("Original string array:\n"+Arrays.toString(allnames));
	System.out.println(Arrays.toString(noDuplicates));
}
}

