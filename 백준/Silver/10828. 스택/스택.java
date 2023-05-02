			import java.util.Stack;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{

Stack<Integer> stack = new Stack<Integer>();

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

int N = Integer.parseInt(br.readLine());

for(int i =0;i<N;i++){
String str = br.readLine();
	String[] strArray = str.split(" ");

//System.out.println(str);

	
	switch(strArray[0]){
		case "push":
		//	System.out.println("push");
			stack.push(Integer.parseInt(strArray[1]));
			break;

		case "pop":
	//	System.out.println("pop");
			if(!stack.empty()){	System.out.println(stack.pop());}
			else{System.out.println("-1");}
			break;

	
		case "size":
		//	System.out.println("size");
			System.out.println(stack.size());
			break;

		case "empty":
		//	System.out.println("empty");
			if(stack.empty()==true){
			System.out.println("1");
			}else{
				System.out.println("0");}
			break;

		case "top":
//System.out.println("top");
			if(!stack.empty()){System.out.println(stack.peek());}
			else{System.out.println("-1");}
			break;

		

}

}

}
}