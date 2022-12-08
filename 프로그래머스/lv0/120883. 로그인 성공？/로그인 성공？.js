function solution(id_pw, db) {
    var answer=""
    db.map((element,i)=>{
      if(id_pw[0]==element[0]&&id_pw[1]==element[1]) answer = "login"
    else if(id_pw[0] ==element[0] && id_pw[1] !=element[1]) answer ="wrong pw"
	else if(id_pw[0] !=element[0] && id_pw[1] !=element[1]) answer = "fail"})
	
    return answer;
}

