function solution(polynomial) {
  
    var arr= polynomial.split(" ")
    console.log(arr)
    var num1=0
    var num2=0
    
    var temp=0
   
    for(let i =0;i<arr.length/2;i++){
        if(arr[2*i].indexOf("x")>=0){
            temp =arr[2*i].substring(0, arr[2*i].length-1)
            console.log(temp)
            if(!temp)
                num1+=1
            else
                num1+=Number(temp)
            console.log(num1)
        }
        else{
             num2+=Number(arr[2*i])
             console.log(num2)
        }
    }
    
   if(num1==0)
       return String(num2)
    else if(num1==1)
        if(num2==0)
            return "x"
        else 
            return "x"+" + "+String(num2)
    else
        if(num2==0)
            return String(num1)+"x"
        else
        return String(num1)+"x"+" + "+String(num2)
  
  
}