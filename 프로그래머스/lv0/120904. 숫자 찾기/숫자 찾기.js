function solution(num, k) {
    var answer = 0;
    var num_str = String(num);
    var cnt=0;
    var check =0;
    
    num_str.indexOf(k) != -1 ? check = num_str.indexOf(k)+1 : -1

    
    if(check)
        return check;
    else
        return -1;
        
}