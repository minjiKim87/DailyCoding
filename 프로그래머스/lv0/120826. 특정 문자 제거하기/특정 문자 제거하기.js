function solution(my_string, letter) {
   //return my_string.replace(letter, ''); // 대소문자 구분안됨
    
    
   return my_string.split(letter).join('');
}