-- 코드를 입력하세요
SELECT HOUR(DATETIME) HOUR, COUNT(DATETIME) 
FROM ANIMAL_OUTS
GROUP BY HOUR(DATETIME)
HAVING HOUR >=9 AND HOUR <=19
ORDER BY HOUR