-- 코드를 입력하세요
SELECT CATEGORY, PRICE as MAX_PRICE, PRoduCT_NAME
FROM FOOD_PRODUCT
WHERE price in (
    select max(price)
    from FOOD_PRODUCT
    group by CATEGORY)
    and CATEGORY In ('과자', '국', '김치','식용유')
GROUP BY CATEGORY 
ORDER BY MAX_PRICE DESC;