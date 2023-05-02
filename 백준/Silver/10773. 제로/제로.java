//if 0, stack.pop
import java.util.Stack;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Stack<Integer> stack = new Stack<Integer>();

int num =0;
int k = Integer.parseInt(br.readLine());

for(int i =0 ;i< k;i++){
	num = Integer.parseInt(br.readLine());
	if(num==0&&(!stack.empty()))
		stack.pop();
	else{
		stack.push(num);
	}

}

int sum=0;
	
while(!stack.empty()){

sum += stack.pop();
}

System.out.println(sum);
}
}