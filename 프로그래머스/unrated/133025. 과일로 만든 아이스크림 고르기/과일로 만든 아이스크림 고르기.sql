-- 코드를 입력하세요
SELECT a.FLAVOR
From FIRST_HALF a left join ICECREAM_INFO b ON a.Flavor = b.Flavor 
WHERE INGREDIENT_TYPE = 'fruit_based' and TOTAL_ORDER > '3000'
Order by TOTAL_ORDER desc