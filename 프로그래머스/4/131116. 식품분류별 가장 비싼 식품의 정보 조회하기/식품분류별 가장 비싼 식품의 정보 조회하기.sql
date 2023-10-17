-- 코드를 입력하세요
-- 식품의 정보를 담은 FOOD_PRODUCT 테이블
-- 식품 ID, 식품 이름, 식품코드, 식품분류, 식품 가격
-- 식품분류별로 가격이 제일 비싼 식품 -> 분류, 가격, 이름을 조회
-- 식품분류가 '과자', '국', '김치', '식용유'인 경우만 출력
-- 결과는 식품 가격을 기준으로 내림차순 정렬
SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
FROM (SELECT CATEGORY, PRICE, PRODUCT_NAME,
             ROW_NUMBER() OVER(PARTITION BY CATEGORY ORDER BY PRICE DESC) AS NO
      FROM FOOD_PRODUCT
      WHERE CATEGORY IN ('과자', '국', '김치', '식용유'))
WHERE NO = 1
ORDER BY PRICE DESC